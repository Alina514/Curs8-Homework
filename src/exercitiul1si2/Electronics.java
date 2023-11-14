package exercitiul1si2;

public class Electronics extends Product {
    private String type;
    private Double length;
    private Double width;
    private Double height;
    private Double weight;

    public Electronics(Double price, String name, String description, Integer quantity, String type, Integer length, Integer width, Integer height, Integer weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = Double.valueOf(length);
        this.width = Double.valueOf(width);
        this.height = Double.valueOf(height);
        this.weight = Double.valueOf(weight);
    }

    public String getType() {
        return type;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }
}
