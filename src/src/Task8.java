package src;

public class Task8 {
    public static void main(final String[] args) {
        final CustomDouble number1 = new CustomDouble(2, 0.3);
        final CustomDouble number2 = new CustomDouble(4, 0.1);

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        System.out.println("The sum of num1 and num 2 = " + number1.addition(number2));
        System.out.println("The difference of num1 and num2 = " + number1.subtraction(number2));

        System.out.println("number1 == number2: " + number1.equals(number2));

        final CustomDouble number3 = new CustomDouble(2, 0.1);
        final CustomDouble number4 = new CustomDouble(2, 0.1);

        System.out.println("number3 = " + number3);
        System.out.println("number4 = " + number4);

        System.out.println("number3 == number4: " + number3.equals(number4));

        System.out.println(number2.toDouble());

    }
}
