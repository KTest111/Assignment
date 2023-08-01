package Module_1.basic_1.Chapter3_Arrays;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        while (true){
            int userInputs = scanner.nextInt();
            if (userInputs%2==0){
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
            }
        }



