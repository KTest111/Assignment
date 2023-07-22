package JavaSE_Test1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the 2 number" );
        int b = scanner.nextInt();
        System.out.println("Before a ="+a+",b= " +b);

        int c = a;
        a = b;
        b = c;
        System.out.println("After a ="+a+", b= " +b);
    }
}





