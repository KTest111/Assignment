package JavaSE_Test1;

import Chapter3_Arrays.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println("array before reverse: ");

        for(int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
        System.out.println("array after reverse: "  );
    }
    }

