package Module_3.Part2Steam;

import java.util.Arrays;
import java.util.List;

public class Lesson5Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 70, 80);

//       int result = list.stream().reduce(100, new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return integer+integer2;
//            }
//        });

        int result =  list.stream().reduce(0, Integer::sum);
        System.out.println(result);

//       Optional<Integer> integerOptional = list.stream().reduce(Integer::sum);
//       int result1  = integerOptional.get();
//        System.out.println(result1);

        int result1=list.stream().reduce(Integer::sum).get();
        System.out.println(result1);
    }
}

