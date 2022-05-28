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
        try {
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(input);

            HashMap<Integer, String> user = new HashMap<>();

            Integer porol;
            String log;


            while (true) {
                System.out.println("Hello");
                System.out.println("put command: register");
                String put = reader.readLine();

                if (put.equals("Exit")) {
                    break;
                } else if (!(put.equals("register"))) {
                    System.out.println("Plese inter: \"Register\"" + "   " + " no such command exists");
                } else if (put.equalsIgnoreCase("REGISTER")) {
                    System.out.println("write your: \"login\"");
                    log = reader.readLine();
                    System.out.println("Your login:" + " " + log);
                    System.out.println(log + " " + "Please write your porol" + " " + " " + "only numbers\n  \t  size maximum 10 numbers");
                    String temp = reader.readLine();

                    porol = Integer.parseInt(temp);
                    int sizePorol = temp.length();

                    if (sizePorol > 10) {
                        break;

                    } else if (!(porol instanceof Integer)) {
                        break;

                    }
                    System.out.println("your porol successfully added");
                    user.put(porol, log);


                    System.out.println("Please confirm your porol");

                    while (true) {
                        if (user.containsKey(Integer.parseInt(reader.readLine()))) {
                            System.out.println("Welcome" + "\t" + log);
                            break;
                        } else {
                            System.out.println("not available\t" + "password entered incorrectly \t " + "please repeat again");
                        }

                    }


                }
break;
            }

        } catch (Exception e) {
            System.out.println("password entered incorrectly -" +
                    " perhaps you have exceeded the size of the numbers or used the wrong format");
        }
    }

}
