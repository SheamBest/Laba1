package src;

public class Task9 {
    public static void main(final String[] args) {
        final CustomDouble number1 = new CustomDouble(2, 0.3);
        final CustomDouble number2 = new CustomDouble(4, -0.1);

        System.out.println("number1= " + number1);
        System.out.println("number2= " + number2);

        final Calculator calculator = new Calculator();

        System.out.println("number1 + number2 = " + calculator.operations(number1, '+', number2));
        System.out.println("number1 - number2 = " + calculator.operations(number1, '-', number2));
        System.out.println("number1 * number2 = " + calculator.operations(number1, '*', number2));
        System.out.println("number1 / number2 = " + calculator.operations(number1, '/', number2));

    }
}
