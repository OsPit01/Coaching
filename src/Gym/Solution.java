package Gym;


import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        UserContainer userContainer = null;
        while (true) {

            System.out.println("******** Register *********");
            System.out.println("1.Login 2.Register 3.exit");
            System.out.println("please do choice");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("######## Login #######");
                    System.out.println("######## Enter for registered username ########");
                    String userName = scanner.nextLine();
                    System.out.println("######## Inter for password #########");
                    String password = scanner.nextLine();
                    if (userContainer.isNameExists(userName, password)) {
                        System.out.println("\n" + "Successful entry");
                    } else {
                        System.out.println("wrong username or password");

                    }
                    break;
                case "2":
                    System.out.println("############# Register ###############");
                    System.out.println("enter UserName");
                    String createName = scanner.nextLine();
                    System.out.println("enter password ");
                    String createPassword = scanner.nextLine();
                    userContainer = new UserContainer(createName, createPassword);
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







