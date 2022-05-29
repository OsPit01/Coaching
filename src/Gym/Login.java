package Gym;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Login extends Register {

    String hello;



    public void login(String useLogin) throws Exception {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        while (true) {
            String check = reader.readLine();
            if (check.equals("exit")) {
                break;
            }

            if (!(check.equals(useLogin))) {
                System.out.println("not available");

            }
            if (check.equals(useLogin)) {
                System.out.println("Your login:" + " " + useLogin);
                hello = useLogin;
break;


            }
        }
        System.out.println(useLogin + " " + "Please confirm your password");
    }

    public void writePassword(String password) throws Exception {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        while (true) {

                       String temp = reader.readLine();

            if(temp.equals("exit")) {
                break;
            }

            if (temp.equals(password)) {
                System.out.println("you have successfully logged into your account\n");

                System.out.println("Welcom \t" + " " + hello);;
                break;
            } else {
                System.out.println("not available");
            }
        }
    }



}




