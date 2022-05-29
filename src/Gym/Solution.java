package Gym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        HashMap<String,String> receiveLoginAndPassword = new HashMap<>();
       Register newRegister = new Register();
        newRegister.register();



        System.out.println("Login to your account" + " " + "write your name");
        Login enter = new Login();

     enter.login(newRegister.login);
      enter.writePassword(newRegister.password);
    }

}









