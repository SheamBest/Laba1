package src.Task10;

import java.util.List;

public class Task10 {
    public static void main(final String[] args) {
        final House house = new House(List.of(
                new Kitchen("Kitchen","Blue",1,1,4,8, 1, 1),
                new LivingRoom("Living Room","Green",1,2,6,1,1,2)
        ),"Yellow","Lvivs'ka str.");

        System.out.println(house);
    }
}
