package src;

import java.util.Arrays;
import java.util.Comparator;

public class test1 {
    public static void main(final String[] args) {
        final String[] array = {"listen", "ooo", "clone", "ozone", "olololo"};
        System.out.println("Original:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Comparator.comparingInt(string -> (int) string.chars().filter(ch -> ch == 'o').count()));
        System.out.println("Sorted:");
        for(final String sorted : array)
                System.out.println(Arrays.toString(new String[]{sorted}));
        }
}