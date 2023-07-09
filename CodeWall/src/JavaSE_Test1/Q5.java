package JavaSE_Test1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Numbe =");
        String str = scanner.nextLine();
            switch (str) {
                case "1":
                    System.out.println("Selected 1");
                case "2":
                    System.out.println("Selected 2");
                case "3":
                    System.out.println("selected 3");
            }
        }
    }
