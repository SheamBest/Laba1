package src;

public class Task3_Recursion {
    static int factorial(final int number){
        if (number == 0)
            return 1;
        else
            return(number * factorial(number-1));
    }
    public static void main(final String[] args) {
        final int factor;
        final int numberOfNumbers = 10;
        factor = factorial(numberOfNumbers);
        System.out.println("Factorial of "+ numberOfNumbers +" is: " + factor);
    }
}
