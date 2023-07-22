package Module_2.chapter4.oop.Lesson_1;

import java.util.Scanner;

public class Lesson8_ReturnIf {
    static String validate(){
        System.out.println("Enter a number");
        int userInput = new Scanner(System.in).nextInt();
        if(userInput > 18){
            return " can ";
        }return " can't ";
    }
    public static void main(String[] args) {
    String result =  validate();
        System.out.println("You" + result + "vote");
    }
}
