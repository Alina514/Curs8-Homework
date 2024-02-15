package exercitiul3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PersonInfo {
    private String firstName;
    private String lastName;
    private LocalDateTime birthdate;

    public PersonInfo(String firstName, String lastName, LocalDateTime birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public String getFullName() {

        return firstName + " " + lastName;
    }

    public int getAge() {
        LocalDateTime currentDate = LocalDateTime.now();
        return (int) ChronoUnit.YEARS.between(birthdate, currentDate);
    }
}
