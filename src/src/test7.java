package src;

public class test7 {
    static Product_Number[] products;

    static {
        products = new Product_Number[]{
                new Product_Number(new Product("Lemon", 30), 2),
                new Product_Number(new Product("Orange", 67), 10)
        };
    }

    public static void main(final String[] args) {
        System.out.println("***Paycheck***");
        for (final Product_Number product : products) {
            System.out.println(product.getProduct());
            System.out.println("Total: " + product.getAmount() + " pieces = " + product.finalPrice() + " UAH");
        }
        final int totalAmount = products[0].finalPrice() + products[1].finalPrice();
        System.out.println("Total amount: " + totalAmount + " UAH");
    }
}
