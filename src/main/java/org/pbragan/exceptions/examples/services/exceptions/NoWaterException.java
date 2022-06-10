package org.pbragan.exceptions.examples.services.exceptions;

public class NoWaterException extends Exception{
    public NoWaterException() {
    }

    public NoWaterException(String message) {
        super(message);
    }

    public NoWaterException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoWaterException(Throwable cause) {
        super(cause);
    }

    public NoWaterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
