package JavaSE_Test1;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Number =");
        int num = scanner.nextInt();
        int[] array = new int[num];
        System.out.println("Enter the elements =");
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
    }
}

