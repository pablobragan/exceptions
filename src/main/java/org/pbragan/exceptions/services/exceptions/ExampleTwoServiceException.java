package org.pbragan.exceptions.services.exceptions;

public class ExampleTwoServiceException extends Exception{
    public ExampleTwoServiceException() {
    }

    public ExampleTwoServiceException(String message) {
        super(message);
    }

    public ExampleTwoServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExampleTwoServiceException(Throwable cause) {
        super(cause);
    }

    public ExampleTwoServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
