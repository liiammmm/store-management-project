public class Apple {
    private String name;
    private double weight;
    private double price;

    // Makes a default apple.
    public Apple() {
        name = "Apple";
        weight = 1.0;
        price = weight * 0.10;
    }

    // Makes an apple with a name.
    public Apple(String name) {
        this.name = name;
        weight = 1.0;
        price = weight * 0.10;
    }

    // Makes an apple with a weight.
    public Apple(double weight) {
        name = "Apple";
        this.weight = weight;
        price = weight * 0.10;
    }

    // Makes an apple with a name and weight.
    public Apple(String name, double weight) {
        this.name = name;
        this.weight = weight;
        price = weight * 0.10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        price = weight * 0.10;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Displays the apple information.
    public String toString() {
        return "Apple: " + name +
               "\nWeight: " + weight + " lbs" +
               "\nPrice: $" + String.format("%.2f", price);
    }
}
