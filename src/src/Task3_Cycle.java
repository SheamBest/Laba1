package src;

public class Task3_Cycle {
     public static int factorial(final int number)
    {
        int result = 1;
        for (int i = 1; i <= number; ++i){
            result *= i;
        }
        return result;
    }
    public static void main(final String[] args){
        final int factor;
        final int numberOfNumbers = 5;
        factor = factorial(numberOfNumbers);
        System.out.println("Factorial of "+ numberOfNumbers +" is: " + factor);
    }
}
