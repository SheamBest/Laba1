package src;

public class Product_Amount {
    private Product product;
    private int number;

    public Product_Amount(final Product product, final int number) {
        this.product = product;
        this.number = number;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    public int getAmount() {
        return number;
    }

    public void setAmount(final int number) {
        this.number = number;
    }

    public int finalPrice() {
        return product.getPrice() * number;
    }
}
