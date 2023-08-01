package Module_1.basic_1.Chapter3_Arrays;

import java.util.Random;
import java.util.Scanner;

public class MiningGame {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
//              System.out.println(a);
        int count = 0;
        while (true) {
            System.out.print("Enter Your Number:");
            Scanner sc = new Scanner(System.in);
            int userinput = sc.nextInt();
            count++;

            if (count>=1 && count<=4) {

                if (userinput == a) {
                    System.out.println("Your are correct!,geinus!!");
                    break;
                } else if (userinput < a) {
                    System.out.println("Wrong,your number is Lower!");
                } else if (userinput > a) {
                    System.out.println("Wrong,your number is higher");
                }
            }
            if (count>=5 && count<=8){
                if (userinput == a) {
                    System.out.println("Your are correct!,Good!");
                    break;
                } else if (userinput < a) {
                    System.out.println("Wrong,your number is Lower!");
                } else if (userinput > a) {
                    System.out.println("Wrong,your number is higher");
                }
            }
            if (count>8){
                if (userinput == a) {
                    System.out.println("Correct but stupid!!!");
                    break;
                } else if (userinput < a) {
                    System.out.println("Wrong,your number is Lower!");
                } else if (userinput > a) {
                    System.out.println("Wrong,your number is higher");
                }
            }
        }
    }
}


