package src;

import java.util.Arrays;
import java.util.Comparator;

public class test1 {
    public static void sortArray(final String[] array, final char symbol){
        Arrays.sort(array, Comparator.comparingInt(string -> (int) string.chars().filter(ch -> ch == symbol).count()));
    }
    public static void main(final String[] args) {
        final String[] array = {"listen", "ooo", "clone", "ozone", "olololo"};
        final char symbol = 'o';
        System.out.println("Original:");
        System.out.println(Arrays.toString(array));
        sortArray(array, symbol);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(array));
    }
}
