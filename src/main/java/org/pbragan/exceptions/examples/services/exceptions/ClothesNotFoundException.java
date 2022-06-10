package org.pbragan.exceptions.examples.services.exceptions;

public class ClothesNotFoundException extends Exception{
    public ClothesNotFoundException() {
    }

    public ClothesNotFoundException(String message) {
        super(message);
    }

    public ClothesNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClothesNotFoundException(Throwable cause) {
        super(cause);
    }

    public ClothesNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
