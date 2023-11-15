package Class;
import java.util.Date;

public class DataBaseAdmin extends Employee {
    private String dbTechnology;

    public DataBaseAdmin(String firstName, String lastName, Date birthday, String address, Date dateOfEmployment, String position, String dbTechnology) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    @Override
    public String getAddress() {
        // Add "db admin" prefix to the address
        return "db admin " + super.getAddress();
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
}
