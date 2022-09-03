package src;

public class test3 {
    static int factorial(final int number){
        if (number == 0)
            return 1;
        else
            return(number * factorial(number-1));
    }
    public static void main(final String[] args) {
        final int factor;
        final int number_of_numbers = 10;
        factor = factorial(number_of_numbers);
        System.out.println("Factorial of "+ number_of_numbers +" is: " + factor);
    }
}
