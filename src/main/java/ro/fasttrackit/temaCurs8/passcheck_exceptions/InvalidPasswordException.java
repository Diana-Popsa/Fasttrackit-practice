package ro.fasttrackit.temaCurs8.passcheck_exceptions;

public class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String exceptionMotive) {
        super(exceptionMotive);

    }
}
