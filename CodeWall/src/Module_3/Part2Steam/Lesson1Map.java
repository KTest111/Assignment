package Part2.Steam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson1Map {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 3, 1, 13, 14, 141, 22, 145, 123, 1, 23, 1, 547, 86);

/**
 * step 1 => Change to Stream
 */
//        Stream<Integer> integerStream = integerList.stream();
//        Stream<Integer> integerStream = stream.map(
//                new Function<Integer, Integer>() {
//
//                    @Override
//                    public Integer apply(Integer integer) {
//                        return 100 + integer;
//                    }
//                })
        /**
         * step 2=>Use map method
         */
//        Stream<Integer> integerStream1 = integerStream.map(integer -> integer + 1000);


        /**
         * step 3=>loop and output
         */
//        integerStream1.forEach(System.out::println);

        /**
         * step 3=>change back to List
         */
//        List<Integer> integerList1 = integerStream1.toList();


        /**
         * Step 4=>
         */
//        System.out.println(integerList1);




        integerList.stream().map(integer -> integer+10).forEach(System.out::println);

    }
}

