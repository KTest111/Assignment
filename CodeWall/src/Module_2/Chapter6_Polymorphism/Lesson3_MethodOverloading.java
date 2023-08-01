package Module_2.Chapter6_Polymorphism;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lesson3_MethodOverloading {

    static void transfer(String phonenumber, int ammount,String notes) {
        System.out.println("You have transfered " + ammount + " MMK to " + phonenumber);
        System.out.println("Thank you");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number to transfer");
        String phonenumber = sc.nextLine();

        System.out.println("Enter ammount");
        int ammount = sc.nextInt();

        Scanner secsc = new Scanner(System.in);
        System.out.println("Enter notes");
        String notes = secsc.nextLine();

        if(notes==null){
            transfer(phonenumber,ammount,notes);
        }else{
            transfer(phonenumber,ammount,notes);
        }
    }
}





