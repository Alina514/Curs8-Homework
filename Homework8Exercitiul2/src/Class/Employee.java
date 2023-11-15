package Class;

import java.util.Date;

public class Employee implements Person  {
        private String firstName;
        private String lastName;
        private Date birthday;
        private String address;
        private Date dateOfEmployment;
        private String position;

        // Constructor
        public Employee(String firstName, String lastName, Date birthday, String address, Date dateOfEmployment, String position) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthday = birthday;
            this.address = address;
            this.dateOfEmployment = dateOfEmployment;
            this.position = position;
        }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }
}
