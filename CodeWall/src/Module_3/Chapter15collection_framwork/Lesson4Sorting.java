package Module_3.Chapter15collection_framwork;

import java.util.*;

public class Lesson4Sorting {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(2);
        integers.add(4);
        integers.add(5);
        integers.add(7);
        integers.add(9);
        integers.add(8);
        System.out.println(integers);
        //list.sort = function

       integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {   //sorting or reverse
                    return 1;  //  1 = swap
                }
                return -1;   //  0 or -1 = false
            }
        });
        System.out.println(integers);

        Collections.sort(integers);
        System.out.println(integers);

        Collections.sort(integers,Comparator.naturalOrder());
        Collections.sort(integers, Comparator.reverseOrder());

        //Collections.sort (): (small to large)
        //Collections.sort (): (last - fast)

        //function ==> Comparater.naturalOrder();
    }
}
