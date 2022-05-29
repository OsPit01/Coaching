package Gym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Register {

    public String login;
  public  String password;



    public void register() throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        while (true) {
            System.out.println("Hello");
            System.out.println("put command: register");
            String put = reader.readLine();

            if (put.equals("exit")) {
                break;
            } else if (!(put.equals("register"))) {
                System.out.println("Plese inter: \"Register\"" + "   " + " no such command exists");
            } else if (put.equals("register")) {
                System.out.println("write your: \"login\"");

                String temp  = reader.readLine();

                System.out.println("Your login:" + " " + temp);
                login = temp;
                System.out.println(temp + " " + "Please write your password, from words or symbol");
                    temp = reader.readLine();
                    password = temp;
                System.out.println("Welcome" + " " + login);
                }
            }
        }


    }

