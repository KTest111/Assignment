package Module_3.Chapter18Database;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UtilityDB {
    static String url = "jdbc:mysql://localhost:3306/cwbank";
    static String dbuser = "root";
    static String dbpassword = "";
//    public static void main(String[] args) {
//        try {
//            Class.forName("java.sql.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }

    private static void recordHistory(String senderPhone, String senderName,
                                      String receiverPhone, String receiverName, double amount){
        try {
            LocalDateTime timeNow = LocalDateTime.now();
            DateTimeFormatter formatStyle= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String transferTime = formatStyle.format(timeNow);

            System.out.println(transferTime);

            Connection connection = DriverManager.getConnection(url,dbuser,dbpassword);
            Statement statement = connection.createStatement();
            int status = statement.executeUpdate("insert into " +
                    "histories(senderName, receiverName, senderPhone, receiverPhone,transferTime,amount) " +
                    "values ('"+senderName+"', '"+receiverName+"','"+senderPhone+"','"+receiverPhone+"','"+
                    transferTime +"',"+amount+");");
            if (status == 1)
                System.out.println("Transfer Recorded successfully.");
            else
                System.out.println("Failed to record.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    private static boolean checkDbData(String column, String inputData) {
        try {
            Connection connection = DriverManager.getConnection(url, dbuser, dbpassword);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users;");

            String dbData;
            while (resultSet.next()) {
                //Data type Inversion
                if (column.equals("age") || column.equals("idnumber")) {
                    int dbDataInt = resultSet.getInt(column);
                    dbData = Integer.toString(dbDataInt);
                } else {
                    dbData = resultSet.getString(column);
                }

//                System.out.println(name);
                if (dbData.equals(inputData)) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean checkPhNumber(String inpPhone) {
        return checkDbData("phone", inpPhone);
    }

    public static boolean checkNRC(String inpNrcType, int inpNrcNumber) {
        boolean checkedType = checkDbData("idtype", inpNrcType);
        boolean checkedNumber = checkDbData("idnumber",
                Integer.toString(inpNrcNumber));

        return checkedType && checkedNumber;
    }

    public static boolean checkUserLogIn(String phone, String password) {

        if (!checkPhNumber(phone))
            return false;
        ResultSet userinfo = retrieveData(phone);
        while (true) {
            try {
                if (!userinfo.next()) break;
                String dbPassword = userinfo.getString("password");
                return password.equals(dbPassword);
            } catch (SQLException e) {
                System.out.println(e.getLocalizedMessage());
                return false;
            }
        }
        return false;

    }

    public static boolean registerUser(String name, String password,
                                       String phone, String gender,
                                       int age, String idType, int idNumber) {
        try {
            Connection connection = DriverManager.getConnection(url, dbuser, dbpassword);
            Statement statement = connection.createStatement();
            int status = statement.executeUpdate(
                    " insert into users (name, password, phone, gender, age, idtype, idnumber) " +
                            "values (\""
                            + name + "\", \""
                            + password + "\", \""
                            + phone + "\", \""
                            + gender + "\","
                            + age + ",\""
                            + idType + "\","
                            + idNumber + ");");

            return status == 1; //1 ok , 0 fail

        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
    }

    public static ResultSet retrieveData(String phone) {
        try {
            Connection connection = DriverManager.getConnection(url, dbuser, dbpassword);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users where phone = " + phone);
            return resultSet;
        } catch (SQLException e) {
            return null;
        }
    }

    public static boolean cashIntoAccount(String phone, double balance) {
        try {
            Connection connection = DriverManager.getConnection(url, dbuser, dbpassword);
            Statement statement = connection.createStatement();
            int status = statement.executeUpdate("UPDATE users  SET balance = " +
                    balance + " WHERE phone = " + phone + ";");
            return status == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static boolean transferBalance(String sender, String receiver, double amount) {
        ResultSet senderInfo = retrieveData(sender);
        ResultSet receiverInfo = retrieveData(receiver);


        try {
            if (!senderInfo.next() || !receiverInfo.next()) {
                System.out.println("Unexpected Error occur.");
                return false;
            } else {
                double senderBalance = senderInfo.getDouble("balance");
                double receiverBalance = receiverInfo.getDouble("balance");
                String senderName = senderInfo.getString("name");
                String receiverName = receiverInfo.getString("name");

                senderBalance = senderBalance - amount;
                receiverBalance = receiverBalance + amount;

                if (cashIntoAccount(sender, senderBalance) &&
                        cashIntoAccount(receiver, receiverBalance)) {
                    //record history
                    recordHistory(sender,senderName, receiver,receiverName,amount);
                    return true;
                }
                return false;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showTransferHistory(String phone) {
        try {
            Connection connection = DriverManager.getConnection(url,dbuser,dbpassword);
            Statement statement  = connection.createStatement();
            ResultSet dataSet = statement.executeQuery("select * from histories where senderPhone = '"+phone+"';");

            if (!dataSet.next())
            {
                System.out.println("No transfer history".toUpperCase());
            }
            else {
                System.out.println("""
                    Sender              Receiver                Amount              Time    \s""".toUpperCase());

                do {

                    String senderName = dataSet.getString("senderName");
                    String receiverName = dataSet.getString("receiverName");
                    String transferTime = dataSet.getString("transferTime");
                    double amount = dataSet.getDouble("amount");

                    if (senderName.length()<9)
                        senderName += "\t\t";
                    else if (receiverName.length()<9) {
                        receiverName += "\t\t";
                    }

                    String formatStr = """
                        %s          %s          %,      .3f           %s      \s"""
                            .formatted(senderName,receiverName,amount,transferTime);


                    System.out.println(formatStr);
                }while (dataSet.next());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
