package Module_1.basic_1.Chapter3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        String name = "Kaung Htet Zaw";
        int age = 20;
        while (true) {
            System.out.println("Enter A Number: ");

            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            System.out.println(userInput);

        }
    }
}
