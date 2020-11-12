package ro.fasttrackit.temaCurs7.Generics;

public class Box<T extends Human> {
    private T theType;

    public Box(T givenType) {
        this.theType = givenType;

    }

    public T getTheType() {
        return theType;
    }
}
