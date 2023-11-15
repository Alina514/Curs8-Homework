package Class;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
         Date programmerBirthday = new Date();
         Date programmerDateOfEmployment = new Date();
         Programmer programmer = new Programmer("David", "Popescu", programmerBirthday, "Nuforului nr.4", programmerDateOfEmployment, "Senior developer", "Java");

        System.out.println("Programmer:");
        System.out.println("Name: " + programmer.getFirstName() + " " + programmer.getLastName());
        System.out.println("Birthday: " + programmer.getBirthday());
        System.out.println("Address: " + programmer.getAddress());
        System.out.println("Date of Employment: " + programmer.getDateOfEmployment());
        System.out.println("Position: " + programmer.getPosition());
        System.out.println("Language: " + programmer.getLanguage());
        System.out.println();

        Date dbAdminBirthday = new Date();
        Date dbAdminDateOfEmployment = new Date();
        DataBaseAdmin dbAdmin = new DataBaseAdmin("Iulia", "Dorobantu", dbAdminBirthday, "Luceafarului nr.3", dbAdminDateOfEmployment, "DB Administrator", "HumanResource");

        System.out.println("Database Admin:");
        System.out.println("Name: " + dbAdmin.getFirstName() + " " + dbAdmin.getLastName());
        System.out.println("Birthday: " + dbAdmin.getBirthday());
        System.out.println("Address: " + dbAdmin.getAddress());
        System.out.println("Date of Employment: " + dbAdmin.getDateOfEmployment());
        System.out.println("Position: " + dbAdmin.getPosition());
        System.out.println("Database Technology: " + dbAdmin.getDbTechnology());





    }
}