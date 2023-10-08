package Module_3.Part2Steam;

import java.util.Arrays;
import java.util.List;

public class Lesson6Reduce {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a","b","c","d","e");




        String str = stringList.stream().reduce("Hello World",(s, s2) -> s+s2);
        System.out.println(str);

//      Optional<String> stringOptional = stringList.stream().reduce((s, s2) -> s+s2);
//      String str2 = stringOptional.get();
//        System.out.println(str2);

        String str1 = stringList.stream().reduce((s, s2) -> s + s2).get();


    }
}


