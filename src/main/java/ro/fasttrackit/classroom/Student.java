package ro.fasttrackit.classroom;

import java.time.LocalDate;


public class Student {
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private String email;
    private Float grade;
    private Boolean finished;

    public Student(String givenLastName, LocalDate givenDateOfBirth) {
        this.lastName = givenLastName;
        this.dateOfBirth = givenDateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getGrade() {
        return Grade;
    }

    public void setGrade(Float grade) {
        Grade = grade;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }
}
