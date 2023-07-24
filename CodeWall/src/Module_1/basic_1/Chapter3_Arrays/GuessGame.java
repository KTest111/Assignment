package Chapter3_Arrays;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int count = 0;
        int num = 88;
        while (true) {
            System.out.println("Enter A Number = ");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            System.out.println(userInput);


            if (userInput == 88) {
                System.out.println("Correct");

            } else if (userInput > 70 && userInput < 87) {
                System.out.println("Nice but guess again a little bit higher");

            } else if (userInput > 50 && userInput < 69) {
                System.out.println("Not bad but guess again a little bit higher");

            } else if (userInput > 30 && userInput < 49) {
                System.out.println("more higher");

            } else if (userInput > 20 && userInput < 29) {
                System.out.println("Guess more higher");

            } else if (userInput > 10 && userInput < 19) {
                System.out.println("Try again");

            } else if (userInput < 10) {
                System.out.println("Guess again");
            }
            while (count <= 8) {
                count++;
                if (count >= 1 && count <= 4) {
                    } else if (userInput == num) {
                        System.out.println("Genius");
                        System.out.println();
                    }
                } if (count >= 5 && count <= 8) {
                } else if (userInput == num) {
                    System.out.println("Good");
                    System.out.println();

                } else {
                    System.out.println("Stupid");
                    System.out.println();

                }
            }
        }
    }


