package ro.fasttrackit.temaCurs7.generics;

public class Box<T extends Human> {
    private T theType;

    public Box(T givenType) {
        this.theType = givenType;

    }

    public T getTheType() {
        return theType;
    }
}
