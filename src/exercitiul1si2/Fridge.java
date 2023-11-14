package exercitiul1si2;

public class Fridge extends Electronics {
   private Double temperature;

    public Fridge(Integer price, String name, String description, Integer quantity, int dateAdded, String type, Integer length, Integer width, Integer height, Integer weight, Integer temperature) {
        super(Double.valueOf(price), name, description, quantity, type, length, width, height, weight);
        this.temperature = Double.valueOf(temperature);
    }

    public Double getTemperature() {
        return temperature;
    }
}
