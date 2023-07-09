package Chapter3_Arrays;

import java.util.Arrays;

public class revision {
    public static void main(String[] args) {
        // two dimentional arrays
        String names[] = {"Kaung", "Aung", "Hein"};
        int numbers[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        System.out.println(numbers[2][1]);
//        numbers[2][2] = 19;
        System.out.println(numbers.length);
        for (int[] number : numbers) {
            System.out.println(Arrays.toString(number));
        }

        System.out.print("[");
        for (int i = 0; i < numbers[1].length; i++) {
            System.out.print(numbers[1][i]);
        }
        System.out.println("]");
        System.out.print("[");
        for (int i = 0; i < numbers[2].length; i++) {
            System.out.print(numbers[2][i]);
        }
        System.out.print("]");
    }
}





