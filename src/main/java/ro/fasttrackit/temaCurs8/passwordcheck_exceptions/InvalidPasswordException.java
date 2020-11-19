package ro.fasttrackit.temaCurs8.passwordcheck_exceptions;

public class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String exceptionMotive) {
        super(exceptionMotive);
    }
}
