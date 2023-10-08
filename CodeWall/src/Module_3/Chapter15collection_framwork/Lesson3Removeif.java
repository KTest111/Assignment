package Module_3.Chapter15collection_framwork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lesson3Removeif {

    public Lesson3Removeif() {
        super();
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        System.out.println(integers);
        integers.removeIf(integer -> integer%2==0);
        System.out.println(integers);
        List<String> names = new ArrayList<>();
        names.add("Mg Aung");
        names.add("Ma Zin");
        names.add("Mg Kyaw");
        names.add("Mg Myo");
        names.add("Ma Thest");
        names.add("Ma Moe");
        names.add("Mg Min");
        names.add("Ma Ma");
        System.out.println(names);
   /*     integers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0) {
                    return false;
                } else {
                    return false;
                }
            }
        });
        System.out.println(integers);

        integers.removeIf(integer -> {
            if (integer % 2 == 0)
                return true;
            return false;
        });*/

        names.removeIf(n -> n.startsWith("Ma"));
        System.out.println(names);


    }
}
