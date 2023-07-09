package JavaSE_Test1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Numbe =");
        String str = scanner.nextLine();
        switch (str) {
            case "one":
                System.out.println("Selected one");
            case "two":
                System.out.println("Selected two");
            case "three":
                System.out.println("selected three");
        }
    }
}
