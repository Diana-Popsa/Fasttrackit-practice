package ro.fasttrackit.classroom;

import java.time.LocalDate;

public class Professor {
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHiring;
    private String emailAddress;
    private Boolean isPHD;

    public boolean isPhd() {
        return isPHD;
    }

}
