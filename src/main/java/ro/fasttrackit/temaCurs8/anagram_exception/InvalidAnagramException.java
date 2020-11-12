package ro.fasttrackit.temaCurs8.anagram_exception;

public class InvalidAnagramException extends Exception{
    public InvalidAnagramException (String exceptionMotive){
        super(exceptionMotive);
    }
}
