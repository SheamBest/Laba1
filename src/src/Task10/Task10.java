package src.Task10;

import java.util.List;

public class Task10 {
    public static void main(final String[] args) {
        final House house = new House(List.of(
                new Room("Kitchen","Blue",1,1,4,8),
                new Room("Living Room","Green",1,2,6,1)
        ),"Yellow","Lvivska str.");

        System.out.println(house);
    }
}
