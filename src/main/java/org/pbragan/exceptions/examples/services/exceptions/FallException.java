package org.pbragan.exceptions.examples.services.exceptions;

public class FallException extends PersonException{
    public FallException(String message) {
        super(message);
    }

    public FallException(String message, Throwable cause) {
        super(message, cause);
    }

    public FallException(Throwable cause) {
        super(cause);
    }

    public FallException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
