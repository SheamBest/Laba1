package src.Task7;

public class Product {
    private String name;
    private int price;

    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price of *" + name + "* by one: " + price + " UAH";
    }

}
