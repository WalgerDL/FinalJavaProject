package ru.sber.atm;

public class InvalidCardException extends Exception{
    public InvalidCardException() {
    }

    public InvalidCardException(String message) {
        super(message);
    }

    public InvalidCardException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCardException(Throwable cause) {
        super(cause);
    }

    public InvalidCardException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
