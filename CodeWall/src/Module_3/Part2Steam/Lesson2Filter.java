package Part2.Steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lesson2Filter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9);

//        list.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if(integer%2==0) return true;
//                return false;
//            }
//        }).forEach(System.out::println);

//        list.stream().filter(integer -> {
//            if(integer%2==0) return true;
//            return false;
//        }).forEach(System.out::println);
        list.stream().filter(integer -> integer%2==0).forEach(System.out::print);
    }
}



