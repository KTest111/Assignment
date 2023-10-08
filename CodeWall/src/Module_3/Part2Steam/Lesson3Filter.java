package Module_3.Part2Steam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lesson3Filter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Thura Linn", "Aung", "CodeWall Technologies",
                "Mg Mg", "Ko Ko", "Khant Khant");
        list.stream().filter(s -> s.length() > 4 && s.length() < 11).
                map(String::toUpperCase).sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
    }
}
