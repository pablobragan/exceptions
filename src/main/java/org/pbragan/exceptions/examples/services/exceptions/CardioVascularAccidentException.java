package org.pbragan.exceptions.examples.services.exceptions;

public class CardioVascularAccidentException extends RuntimeException{
    public CardioVascularAccidentException(String message) {
        super(message);
    }

    public CardioVascularAccidentException(String message, Throwable cause) {
        super(message, cause);
    }

    public CardioVascularAccidentException(Throwable cause) {
        super(cause);
    }

    public CardioVascularAccidentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
