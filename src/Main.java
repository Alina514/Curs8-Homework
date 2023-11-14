import exercitiul1si2.Cosmetics;
import exercitiul1si2.Electronics;
import exercitiul1si2.Fridge;
import exercitiul3.PersonInfo;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        Cosmetics cosmetics = new Cosmetics((int) 8.99, "Lipstick", "Red matte", 10, 12,"Red", 12);
        Electronics electronics = new Electronics(200.0, "Hair dryer", "Philips hair dryer",1, "Electronics", 6, 8, 13, 65);
        Fridge fridge = new Fridge((int) 1.400, "Samsung Fridge", "New generation", 1, 20, "Electronics", 60, 100, 182, 50, -12);
        LocalDateTime currentDate = LocalDateTime.now();

        System.out.println("Cosmetics - Lipstick:");
        System.out.println("Name: " + cosmetics.getName());
        System.out.println("Price: $" + cosmetics.getPrice());
        System.out.println("Color: " + cosmetics.getColor());
        System.out.println("Weight: " + cosmetics.getWeight() + " g");
        System.out.println("Quantity: " + cosmetics.getQuantity());
        System.out.println("Date Added: " + cosmetics.getDateAdded());
        System.out.println();

        System.out.println("Electronics - Hair dryer:");
        System.out.println("Name: " + electronics.getName());
        System.out.println("Price: $" + electronics.getPrice());
        System.out.println("Type: " + electronics.getType());
        System.out.println("Weight: " + electronics.getWeight() + " g");
        System.out.println("Quantity: " + electronics.getQuantity());
        System.out.println("Type:"  + electronics.getType());
        System.out.println("Length:" + electronics.getLength());
        System.out.println("Width: " + electronics.getWidth());
        System.out.println("Height: " + electronics.getHeight());
        System.out.println("Date Added: " + electronics.getDateAdded());
        System.out.println();

        System.out.println("Electronics - Fridge:");
        System.out.println("Name: " + fridge.getName());
        System.out.println("Price: $" + fridge.getPrice());
        System.out.println("Description: " + fridge.getDescription());
        System.out.println("Temperature: " + fridge.getTemperature() + "°C");
        System.out.println("Quantity: " + fridge.getQuantity());
        System.out.println("Width: " + fridge.getWidth());
        System.out.println("Weight: " + fridge.getWeight());
        System.out.println("Length: " + fridge.getLength());
        System.out.println("Date Added: " + fridge.getDateAdded());
        System.out.println();

        LocalDateTime birthdate = LocalDateTime.of(1993, 3, 25, 0, 0);
        PersonInfo person = new PersonInfo("Iulia", "Debbie", birthdate);

        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge() + " years");
    }
}
