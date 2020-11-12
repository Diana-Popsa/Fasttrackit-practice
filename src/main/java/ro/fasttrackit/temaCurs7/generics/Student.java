package ro.fasttrackit.temaCurs7.generics;

public class Student implements Human {
    private String name;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade(int i) {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
