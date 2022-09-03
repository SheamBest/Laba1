package src;

public class ProductNumber {
    private Product product;
    private int number;

    public ProductNumber(final Product product, final int number) {
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

    public int finalPriceOfProduct() {
        return product.getPrice() * number;
    }
}
