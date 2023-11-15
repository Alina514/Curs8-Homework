package Class;
import java.util.Date;

public class Programmer extends Employee{
    private String language;

    public Programmer(String firstName, String lastName, Date dateBirthday, String address, Date dateOfEmployment, String position, String language) {
        super(firstName, lastName, dateBirthday, address, dateOfEmployment, position);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
    public String getPosition() {
        return "Programmer";
    }
}
