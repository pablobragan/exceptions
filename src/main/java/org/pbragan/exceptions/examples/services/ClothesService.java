package org.pbragan.exceptions.examples.services;

import org.pbragan.exceptions.examples.model.Clothes;
import org.pbragan.exceptions.examples.model.Person;
import org.pbragan.exceptions.examples.services.exceptions.ClothesNotFoundException;

import java.util.List;

public interface ClothesService {

    List<Clothes> findClothes(Person person) throws ClothesNotFoundException;
}
