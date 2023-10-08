package Module_3.Chapter15collection_framwork;

import Module_1.basic_1.Chapter3_Arrays.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {
        int []numbers = new int[6];


        List list1 = new ArrayList();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(4);
        list1.add(3);
        System.out.println(list1);

        List list12 = new ArrayList();
        list12.add(3);
        list12.add("Min");
        list12.add(3.0);
        list12.add(0);
        list12.add(true);
        System.out.println(list12);

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(5);
        System.out.println(list3.get(2));;




    }

}
