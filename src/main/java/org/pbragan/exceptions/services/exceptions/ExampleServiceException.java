package org.pbragan.exceptions.services.exceptions;

public class ExampleServiceException extends Exception{
    public ExampleServiceException() {
    }

    public ExampleServiceException(String message) {
        super(message);
    }

    public ExampleServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExampleServiceException(Throwable cause) {
        super(cause);
    }

    public ExampleServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
