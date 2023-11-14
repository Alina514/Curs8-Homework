package exercitiul1si2;

public class Cosmetics extends Product {
    private String color;
    private Double weight;

    public Cosmetics(Integer price, String name, String description, Integer quantity, int dateAdded, String color, Integer weight) {
        super(Double.valueOf(price), name, description, quantity);
        this.color = color;
        this.weight = Double.valueOf(weight);
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }
}
