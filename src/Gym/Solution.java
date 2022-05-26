package Gym;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws Exception {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        HashMap<Integer, String> user = new HashMap<>();

        Integer porol;
        String log;
        Boolean access = false;

        while (true) {
            System.out.println("Hello");
            System.out.println("put command: Register");
            String put = reader.readLine();

            if (put.equals("Exit")) {
                System.out.println("GoodBye");
                break;
            } else if (!(put.equalsIgnoreCase("REGISTER"))) {
                System.out.println("Plese inter: \"Register\"" + "   " + " no such command exists");
            }

            else if (put.equalsIgnoreCase("REGISTER")) {
                System.out.println("write your: \"login\"  \nyou can use words and numbers also symbol");
                log = reader.readLine();
                System.out.println("Your login:" + " " + log + "\nYour login added\n");

                System.out.println("Please write your porol" + " " + " " + "only numbers\n  \t  size maximum 5 numbers");

                String temp = reader.readLine();
                porol = Integer.parseInt(temp);
                int sizePorol = temp.length();

                if (sizePorol > 6) {
                    break;

                } else if (!(porol instanceof Integer)) {
                    break;

                }
                System.out.println("your porol successfully added");
                user.put(porol, log);
                System.out.println("Welcome" + " " + log);


                System.out.println("Please confirm your porol");

                while (true) {
                    if (user.containsKey(Integer.parseInt(reader.readLine()))) {
                        System.out.println("Welcome");
                    } else {
                        System.out.println("not available");

                    }

                }


            }
        }


    }
}
