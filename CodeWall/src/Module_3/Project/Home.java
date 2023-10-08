package Module_3.Project;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = false;
        int option = 0;

        System.out.println("""        
                Welcome
                """);
        do {
            System.out.print("""
                                    
                    choose the option ...
                    1. sign up
                    2. sign in
                    0. exit     :
                    Choose number as show """);

            try {
                switch (option) {
                    case 1:
                        SignUp.signUp();
                        break;
                    case 2:
                        SignIn.signIn();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default: {
                        System.out.println("\nOption must only be 1, 2 or 9");
                        loop = true;
                    }
                }
            }
        }
    }
}
