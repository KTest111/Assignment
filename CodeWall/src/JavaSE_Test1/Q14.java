package JavaSE_Test1;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Number =");
        int num = scanner.nextInt();
        int[]array = new int[num];
         int temp = 0;
         for (int i = 0; i < num; i++) {
             System.out.println("Enter array elements =");
             array[i] = scanner.nextInt();
             temp += array[i];
         }
        System.out.println(temp);
    }
}
