package src;

public class Task7 {

    public static void main(final String[] args) {
        final ProductNumber[] products = new ProductNumber[]{
                new ProductNumber(new Product("Lemon", 30), 2),
                new ProductNumber(new Product("Orange", 67), 10)
        };
        System.out.println("***Paycheck***");
        printPaycheck(products);
        System.out.println("Total amount: " + totalAmount(products) + " UAH");
    }

    private static void printPaycheck(final ProductNumber[] products) {
        for (final ProductNumber product : products) {
            System.out.println(product.getProduct());
            System.out.println("Total: " + product.getAmount() + " pieces = " + product.finalPriceOfProduct() + " UAH");
        }
    }

    private static int totalAmount(final ProductNumber[] products){
        int sum = 0;
        for (final ProductNumber product : products) {
            sum += product.finalPriceOfProduct();
        }
        return sum;
    }
}
