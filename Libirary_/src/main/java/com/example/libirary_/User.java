package com.example.libirary_;

import userprofile.Order;

import java.util.ArrayList;
import java.util.Random;

public class User extends Person{
    private static int userCounter =0;
    private static User currentUser;
   public static ArrayList<User> users = new ArrayList<User>();

   public ArrayList<Order> orders = new ArrayList<Order>();
    private int confirmationCode;
    private Random random = new Random();

   public User(int id,String userName, String email, String password){
       super(userCounter,userName,email,password);
   }
    public User(String userName, String email, String password) {
        super(userCounter+1,userName,email,password);
        userCounter++;
        users.add(this);
        confirmationCode = random.nextInt((9999999-1000000)+1)+1000000;
        System.out.println(confirmationCode);
    }
    public static int getUserCounter() {
        return userCounter;
    }

    public static User getCurrentUser() {
        return currentUser;
    }
    public static void setCurrentUser(User user){
        currentUser = user;
    }
    public int getConfirmationCode(){ return confirmationCode;}
    public void generateNewConfirmationCode(){
        confirmationCode = random.nextInt((9999999-1000000)+1)+1000000;
        System.out.println(confirmationCode);
    }

}
