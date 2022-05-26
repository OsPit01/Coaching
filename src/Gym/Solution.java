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
        HashMap<String,Integer> login = new HashMap<>();
        Integer porol;
        String log;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);


        while (true) {
            System.out.println("Hello");
            System.out.println("put command: Register");
            String put = reader.readLine();

            if (put.equals("Exit")) {
                break;
            } else if (!(put.equalsIgnoreCase("REGISTER"))) {
                System.out.println("Plese inter: \"Register\"" + "   " + " no such command exists");

            } else if (put.equalsIgnoreCase("REGISTER")) {
                System.out.println("write your: \"login\"  \nyou can use words and numbers also symbol");
                 log = reader.readLine();
                System.out.println("Your login:" + " " + log + "\nYour login added\n");

                System.out.println("Please write your porol" + "only numbers");
                String temp = reader.readLine();
                porol = Integer.parseInt(temp);

                if(!(porol instanceof Integer)) {

                }



            }



        }

    }


}
