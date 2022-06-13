package org.pbragan.exceptions.examples.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.pbragan.exceptions.examples.model.Person;
import org.pbragan.exceptions.examples.model.PersonState;
import org.pbragan.exceptions.examples.services.BathroomService;
import org.pbragan.exceptions.examples.services.ClothesService;
import org.pbragan.exceptions.examples.services.PersonService;
import org.pbragan.exceptions.examples.services.exceptions.FallException;
import org.pbragan.exceptions.examples.services.exceptions.NoWaterException;
import org.pbragan.exceptions.examples.services.exceptions.PersonException;
import org.pbragan.exceptions.examples.services.fakes.PersonaServiceDummyImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PersonControllerTest {

    PersonService personService;
    BathroomService bathroomService;
    ClothesService clothesService;

    PersonController personController;
    @BeforeEach
    void setUp() {
        personService = Mockito.mock(PersonService.class);
        bathroomService = Mockito.mock(BathroomService.class);
        clothesService = Mockito.mock(ClothesService.class);

        personController = new PersonController(personService,bathroomService,clothesService);
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * En este se va a probar el caso en que la persona se cae de la cama, al levantarse, y queda gravemente
     * herida.
     */
    @Test
    public void takeMorningShower_personFalledAndBadlyHurt() throws PersonException, NoWaterException {
        //given
        Person person = Mockito.mock(Person.class);
        Mockito.doThrow(FallException.class).when(personService).getUpFromBed(person);
        Mockito.when(person.getState()).thenReturn(PersonState.BADLY_HURT);
        //when
        assertThrows(PersonException.class, () -> personController.takeMorningShower(person),"No se arrojo la excepción esperada :-(");
        //then
        verify(personService,times(1)).awake(person);
        Mockito.verify(personService,Mockito.times(1)).getUpFromBed(person);
        Mockito.verify(personService,Mockito.never()).undress(person);
    }
}