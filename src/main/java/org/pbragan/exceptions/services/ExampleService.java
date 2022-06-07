package org.pbragan.exceptions.services;

import org.pbragan.exceptions.services.exceptions.ExampleServiceException;

public interface ExampleService {

    <T> T save(T something) throws ExampleServiceException;
}
