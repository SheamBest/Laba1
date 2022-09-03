package src;

public class Task2 {
    public static void main(final String[] args) {
        final String string = "Hello World!";
        final String symbol = "!";
        final String afterReplace = string.replace(symbol,"");
        System.out.println(string);
        System.out.println(afterReplace);
    }
}