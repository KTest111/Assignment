package Module_3.Chapter18Database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SignUp {
    private static String patternPw = "[A-Za-z]*[A-Z]+[A-Za-z]*[0-9]+[,<>.';:!@#$%^&*)(_\\-+=]";
    private static String patternPhone = "09[0-9]{7,9}";

    public static void signUp() {
        String name;
        String password;
        String phone;
        String gender;
        int age = 0;
        String idType;
        int idNumber;

        boolean loop = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n##### Sign Up Page #####\n");

        //inputs
        //1. input fullName
        System.out.print("Enter your fullName : ");
        name = sc.nextLine();

        //2. input password and check strong format
        do {
            System.out.print("Enter your password : "); //format
            password = sc.next();
            if (!password.matches(patternPw)) {
                System.out.println("\nYour password must have be at least" +
                        "\n one upper, lower, numbers and special character : ");
            }
        } while (!password.matches(patternPw));

        //3. input phone and check format and unique
        do {
            System.out.print("Enter your mobile number : "); //unique
            phone = sc.next();
            if (UtilityDB.checkPhNumber(phone)) {
                System.out.println("\nPhone number already exit.");
            } else if (!phone.matches(patternPhone)) {
                System.out.println("\nPhone number is invalid format.");
            }
        } while (UtilityDB.checkPhNumber(phone) || !phone.matches(patternPhone));

        //4. input gender
        System.out.print("Enter your gender (male or female) :  ");
        gender = sc.next();

        //5. input age and check to be integer
        do {
            try {
                loop = false;               //restore default boolean
                System.out.print("Enter your age : ");
                age = sc.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Input must be number : " +
                        "\n");

                sc = new Scanner(System.in);
                loop = true;
            }
        } while (loop);

        //6. input nrc data (type and number) and check for duplicate
        do {
            System.out.print("Enter your ID type : (NRC, Lincese, passport) "); //one acc per one nrc
            idType = sc.next();

            System.out.print("Enter your ID number : ");
            idNumber = sc.nextInt();

            if (UtilityDB.checkNRC(idType, idNumber)) {
                System.out.println("\nID card already created the account.\n Enter again :");
            }
        } while (UtilityDB.checkNRC(idType, idNumber));

        // register user data to database
        boolean accountstatus = UtilityDB.registerUser(name, password, phone, gender, age, idType, idNumber);

        if (accountstatus){
            System.out.println("""
                    
                    ***\t**********\t***
                    Account created successfully
                    ***\t**********\t***
                    """);
            String temp[] = {"Helo","home"};
            Home.main(temp);
        }
        else {
            System.out.println("""
                    Fail to create the account
                    """);
            loop = true;
        }
    }
}

