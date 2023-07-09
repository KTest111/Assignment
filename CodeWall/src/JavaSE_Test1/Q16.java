package JavaSE_Test1;

import java.util.Random;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        if (num == 4 ) {
            Random random = new Random();
            Random random1 = new Random();
            Random random2 = new Random();
            Random random3 = new Random();
            Random random4 = new Random();

            System.out.println(random1);
            System.out.println(random2);
            System.out.println(random3);
            System.out.println(random4);
        }
        else {
            System.out.println("something wrong");
        }
    }
}
