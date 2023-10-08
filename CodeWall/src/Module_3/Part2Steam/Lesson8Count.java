package Part2.Steam;

import java.util.Arrays;
import java.util.List;

public class Lesson8Count {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 1, 2, 3, 4, 3, 4, 5, 6, 5, 6, 7, 7, 8);


        System.out.println(list.stream().filter(integer -> integer%2==0).count());
        System.out.println(list.size());




    }
}
