package Module_3.Part2Steam;

import java.util.Arrays;
import java.util.List;

public class Lesson9Limit {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 1, 2, 3, 4, 3, 4, 5, 6, 5, 6, 7, 7, 8);
//        list.stream().distinct().limit(4).forEach(System.out::println);

        System.out.println(list.stream().limit(3).toList());

//        list
//                .stream()
//                .filter(integer -> integer%2==0)
//                .distinct()
//                .limit(2)
//                .forEach(System.out::println);
    }
}
