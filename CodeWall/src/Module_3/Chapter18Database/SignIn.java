package Module_3.Chapter18Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class SignIn {
    static Scanner scanner = new Scanner(System.in);

    public static void signIn() {
        System.out.println("\n\n##### Sign In Page #####\n");
        String phone, password;
        boolean loop = false;
        int option = 0;
        String[] temp = {"sign","in"};

        do{
            System.out.print("Enter phone number to log in : ");
            phone = scanner.next();

            System.out.print("Enter password  : ");
            password = scanner.next();

            if (UtilityDB.checkUserLogIn(phone,password))
                break;
            else
                System.out.println("Credential Error!");

        }while (true);

        String username = checkSignInData(phone, password);
        if (username != null) {
            System.out.println("\n\n+++ You are sign in \n" +
                    "Welcome " + username + "...");

            do {
                System.out.print("""
                                            
                        Choose option to process!
                        1 : Cash In
                        2 : Transfer
                        3 : Check Balance
                        4 : Transfer History
                        0 : Sign Out              : \s""");

                try {
                    loop = true;
                    option = scanner.nextInt();
                    switch (option) {
                        case 1: //cash in
                            cashIn(phone);
                            break;
                        case 2: // transfer
                            transfer(phone);
                            break;
                        case 3: //check balance
                            checkBalance(phone);
                            break;
                        case 4: //ViewTransfer History
                            viewHistory(phone);
                            break;
                        case 0: //Exit sign in
                            Home.main(temp);
                            loop = false;
                            break;
                        default: {
                            System.out.println("\nOption must only be number : 1,2,3,4,0.");
                        }
                    }

                } catch (Exception e) {
                    System.out.println("Invalid input option ...");
                    System.out.println(e.getStackTrace()+e.getLocalizedMessage());
                    scanner = new Scanner(System.in);
                    loop = true;
                }
            } while (loop);
        }
    }

    private static void viewHistory(String phone) {
        UtilityDB.showTransferHistory(phone);
    }

    private static void checkBalance(String phone) {
        ResultSet dataSet = UtilityDB.retrieveData(phone);
        try {
            if (!dataSet.next())
                System.out.println("Unexpected Error Occur!");
            else
            {
                double balance = dataSet.getDouble("balance");
                System.out.println("Balance : " + balance);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void transfer(String sender) {
        ResultSet senderSet = UtilityDB.retrieveData(sender);
        try {
            if (!senderSet.next())
                System.out.println("Error Occur!");
            else
            {
                double balance = senderSet.getDouble("balance");
                String password = senderSet.getString("password");
                String receiver;    double amount;

                do {
                    System.out.print("\nEnter receiver phone number to transfer : ");
                    receiver = scanner.next();
                    if (!UtilityDB.checkPhNumber(receiver))
                        System.out.print("User not found !");
                    else
                        break;
                }while (true);

                do {
                    System.out.print("\nEnter amount to transfer : ");
                    amount = scanner.nextDouble();
                    if (balance < amount)
                        System.out.println("Insufficient amount to transfer");
                    else
                        break;
                }while (true);

                System.out.print("\nEnter password to confirm : ");
                String inpPassword = scanner.next();

                do{
                    if(password.equals(inpPassword)){
                        if (UtilityDB.transferBalance(sender,receiver,amount))          //*****\\
                            System.out.println("Balance transfer successfully.");
                        else
                            System.out.println("Fail to transfer.");
                        break;
                    }
                    else{
                        System.out.print("Wrong password.\n");
                    }
                }while (true);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static String checkSignInData(String phone, String password) {
        ResultSet singleData = UtilityDB.retrieveData(phone);
        while (true) {
            try {
                if (!singleData.next())
                    return null;
                else {
                    String phoneDb = singleData.getString("phone");
                    String passwordDb = singleData.getString("password");
                    String nameDb = singleData.getString("name");

                    if (phone.equals(phoneDb) && password.equals(passwordDb))
                        return nameDb;
                }
            } catch (SQLException e) {
                System.out.println(e.getLocalizedMessage());
                return null;
            }
        }
    }

    private static void cashIn(String phone) {
        ResultSet resultSet = UtilityDB.retrieveData(phone);
        try {
            if (!resultSet.next())
                System.out.println("Balance update failed.");
            else
            {
                double balance = resultSet.getDouble("balance");
                String password = resultSet.getString("password");

                System.out.print("\nEnter amount to cash in : ");
                double increaseAmount = scanner.nextDouble();

                System.out.print("\nEnter password to confirm : ");
                String inpPassword = scanner.next();

                if (password.equals(inpPassword)){
                    double newBalance = increaseAmount + balance;
                    if (UtilityDB.cashIntoAccount(phone, newBalance)) {
                        System.out.println("Balance updated.");
                    }
                    else
                        System.out.println("Failed to update Balance.");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
