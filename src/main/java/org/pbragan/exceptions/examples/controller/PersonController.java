package org.pbragan.exceptions.examples.controller;

import org.pbragan.exceptions.examples.model.*;
import org.pbragan.exceptions.examples.services.BathroomService;
import org.pbragan.exceptions.examples.services.ClothesService;
import org.pbragan.exceptions.examples.services.PersonService;
import org.pbragan.exceptions.examples.services.exceptions.ClothesNotFoundException;
import org.pbragan.exceptions.examples.services.exceptions.FallException;
import org.pbragan.exceptions.examples.services.exceptions.NoWaterException;
import org.pbragan.exceptions.examples.services.exceptions.PersonException;

import java.util.List;

public class PersonController {

    public static final String NO_ME_PUEDO_BAÑAR_ME_VOY_AL_MEDICO = "No me puedo bañar, me voy al medico";
    final PersonService personService;
    final BathroomService bathroomService;
    final ClothesService clothesService;

    public PersonController(PersonService personService, BathroomService bathroomService, ClothesService clothesService) {
        this.personService = personService;
        this.bathroomService = bathroomService;
        this.clothesService = clothesService;
    }

    public Person takeMorningShower(Person person) throws PersonException, NoWaterException {
        personService.awake(person);
        try {
            personService.getUpFromBed(person);
        } catch (FallException e) {
            if(PersonState.BADLY_HURT.equals(person.getState())){
                throw new PersonException(NO_ME_PUEDO_BAÑAR_ME_VOY_AL_MEDICO);
            }
        }
        List<Clothes> dirtyClothes = personService.undress(person);
        BathContext bathContext = bathroomService.openShowerFaucet();
        personService.takeAShower(person, bathContext);
        try {
            List<Clothes> cleanClothes = clothesService.findClothes(person);
            personService.dress(cleanClothes,person);
            person.setMood(Mood.HAPPY);
        } catch (ClothesNotFoundException e) {
            personService.dress(dirtyClothes,person);
            person.setMood(Mood.UNHAPPY);
        }
        person.setState(PersonState.CLEAN);
        return person;
    }
}
