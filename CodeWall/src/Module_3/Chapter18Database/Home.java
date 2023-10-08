package Module_3.Chapter18Database;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = false;
        int option = 0;

        System.out.println("""
                
                Welcome\s
                The banking application started.""");
        do{
            System.out.print("""
                
                choose the option ...\s
                1. sign up
                2. sign in
                0. exit     : \s""");

            try {
             loop = false;
                option = sc.nextByte();

                switch (option){
                    case 1 : SignUp.signUp();break;
                    case 2 : SignIn.signIn();break;
                    case 0 : System.exit(0); break;
                    default: {
                        System.out.println("\nOption must only be 1, 2 and 0");
                        loop = true;
                    }
                }

            } catch (Exception e) {
                System.out.println("Invalid input...");
                sc = new Scanner(System.in);        //refresh scanner
               loop = true;
            }
        }while (loop);
    }
}
