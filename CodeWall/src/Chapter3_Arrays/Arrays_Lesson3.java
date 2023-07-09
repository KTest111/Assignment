package Chapter3_Arrays;

import java.util.Arrays;

public class Arrays_Lesson3 {
    public static void main(String[] args) {
        int num[] = new int[2];
        System.out.println(Arrays.toString(num));


        int numbers[][] = {{1,2},{1,2,3},{1,2,3,4},{1,2,3,4,5}};
        numbers[0] = new int[1];
        System.out.println(Arrays.toString(numbers));

    }
}
