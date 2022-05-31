package Gym;


import java.sql.SQLOutput;
import java.util.*;

public class Solution {


    public static void main(String[] args) {

        while (true) {

            System.out.println("******** Register *********");
            System.out.println("1.Login 2.Register 3.exit");
            System.out.println("please do choice");
            Scanner scanner = new Scanner(System.in);
            UsersInformation uid = new TryRegister();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("######## Login #######");
                    System.out.println("######## Enter for registered username ########");
                    String newUserName = scanner.nextLine();
                    System.out.println("######## Inter for password #########");
                    String newPassword = scanner.nextLine();
                    boolean flag = uid.isLogin(newUserName, newPassword);
                    if (flag) {
                        System.out.println("\n" + "Successful entry");
                    } else {
                        System.out.println("wrong username or password");
                    }
                    break;
                case "2":
                    System.out.println("############# Register ###############");
                    System.out.println("enter UserName");
                    String userName = scanner.nextLine();
                    System.out.println("enter password ");
                    String password = scanner.nextLine();

                    Users user = new Users();
                    user.setName(userName);
                    user.setPassword(password);
                    uid.register(user);

                    System.out.println("Registration was successful");
                    break;

                case "3":
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect code");

            }
        }


    }
}







