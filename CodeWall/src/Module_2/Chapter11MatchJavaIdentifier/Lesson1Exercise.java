package Module_2.Chapter11MatchJavaIdentifier;

import java.util.Scanner;

public class Lesson1Exercise {
    public static void main(String[] args) {
        String patten = "[A-Z]'*'[a-z][1-9]*'{8,10}'*'";

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your code : ");
            String input = sc.next();
            if (input.equals("STOP"))break;;

            if (input.matches(patten)) {
                System.out.println("Valid code");
            } else {
                System.out.println("Invalid code");
            }
        }while (true) ;
    }
}

