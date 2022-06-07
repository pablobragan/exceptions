package org.pbragan.exceptions.services;

import org.pbragan.exceptions.services.exceptions.ExampleTwoServiceException;

import java.util.List;

public interface ExampleTwoService {

    <T> List<T> findAllOf(T t) throws ExampleTwoServiceException;
}
