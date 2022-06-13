package org.pbragan.exceptions.examples.services.fakes;

import org.pbragan.exceptions.examples.model.BathContext;
import org.pbragan.exceptions.examples.model.Clothes;
import org.pbragan.exceptions.examples.model.Person;
import org.pbragan.exceptions.examples.services.PersonService;
import org.pbragan.exceptions.examples.services.exceptions.CardioVascularAccidentException;
import org.pbragan.exceptions.examples.services.exceptions.FallException;

import java.util.List;

public class PersonaServiceDummyImpl implements PersonService {
    @Override
    public void awake(Person person) throws CardioVascularAccidentException {

    }

    @Override
    public void getUpFromBed(Person person) throws FallException {
        throw new FallException("bla");
    }

    @Override
    public boolean isOk(Person person) {
        return false;
    }

    @Override
    public void goToBathroom(Person person) {

    }

    @Override
    public List<Clothes> undress(Person person) {
        return null;
    }

    @Override
    public void dress(List<Clothes> clothes, Person person) {

    }

    @Override
    public void takeAShower(Person person, BathContext context) {

    }
}
