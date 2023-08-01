package Module_1.basic_1.Chapter3_Arrays;

public class Arrays {
    public static void main(String[] args) {

        // One dimentional arrays;
        String names[] = {"Kaung", "Htet", "Zaw"};
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8,};

        System.out.println(numbers[7]);
        numbers[4] = 15;
        System.out.println(numbers.length);

        System.out.println(numbers);

        // Two dimentional Arrays;
        String names1[] = {"Kaung", "Htet"};
        int numbers1[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {11, 12, 13},
        };
        System.out.println(numbers1[1][2]);
        numbers1[2][2] = 19;
        System.out.println(numbers1.length);
        System.out.println(numbers1[0].length);

        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + " ");

        }
        System.out.println();

        for (int[] ints : numbers1) {
            for (int[] ints1 : numbers1) {
                System.out.print(numbers1 + "");
            }
        }
    }
}










