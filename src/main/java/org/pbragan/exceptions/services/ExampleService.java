package org.pbragan.exceptions.services;

import org.pbragan.exceptions.services.exceptions.ExampleServiceException;

public interface ExampleService {

    /**
     * Este metodo debe guardar algo en un repositorio.
     * @param something
     * @param <T>
     * @return
     * @throws ExampleServiceException: se va a arrojar si el repositorio no esta disponible
     */
    <T> T save(T something) throws ExampleServiceException;
}
