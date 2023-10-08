package Part2.Steam;

import java.util.Arrays;
import java.util.List;

public class Lesson10Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 20, 11, 2, 300, 44, 3, 540, 75, 660, 5, 6, 700, 37, 28);
        System.out.println(list.
                stream()
                .filter(integer -> integer < 300)
//                .sorted(Comparator.reverseOrder())
                .sorted()
                .toList());
    }
}
