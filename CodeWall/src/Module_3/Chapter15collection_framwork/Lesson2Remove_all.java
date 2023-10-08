package Module_3.Chapter15collection_framwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson2Remove_all {
    public static void main(String[] args) {
        List<Integer> integersList = new ArrayList<>();
        integersList.add(10);
        integersList.add(9);
        integersList.add(7);
        integersList.add(7);
        integersList.add(8);
        System.out.println(integersList);


        List<String> stringList = new ArrayList<>();
        stringList.add("Aung");
        stringList.add("kaung");
        stringList.add("maung");
        stringList.add("kyaw");

        System.out.println(stringList);
        stringList.remove(3);
        System.out.println(stringList);
        stringList.remove("kyaw");
        System.out.println(stringList);

        List temp = Arrays.asList("Aung", "maung");
    stringList.removeAll(temp);
        System.out.println(stringList);
    }
}
