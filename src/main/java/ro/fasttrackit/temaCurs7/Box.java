package ro.fasttrackit.temaCurs7;

public class Box<T> {
    private T theType;

    public Box(T givenType) {
        this.theType = givenType;

    }

    public T getTheType() {
        return theType;
    }
}
