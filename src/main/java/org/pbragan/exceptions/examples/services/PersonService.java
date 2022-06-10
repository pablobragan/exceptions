package org.pbragan.exceptions.examples.services;

import org.pbragan.exceptions.examples.model.BathContext;
import org.pbragan.exceptions.examples.model.Clothes;
import org.pbragan.exceptions.examples.model.Person;
import org.pbragan.exceptions.examples.services.exceptions.CardioVascularAccidentException;
import org.pbragan.exceptions.examples.services.exceptions.FallException;

import java.util.List;

public interface PersonService {

    /**
     * La persona se despierta.
     * Puede suceder que tenga un accidente cardio vascular y no se despierte
     */
    void awake(Person person) throws CardioVascularAccidentException;

    void getUpFromBed(Person person) throws FallException;

    boolean isOk(Person person);

    void goToBathroom(Person person);

    List<Clothes> undress(Person person);

    void dress(List<Clothes> clothes, Person person);

    void takeAShower(Person person, BathContext context);

}
