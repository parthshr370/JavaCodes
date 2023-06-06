
// Program to take a input from the keyboard as name and then assign

import java.util.Scanner;

public class Naming {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = in.next();
        String personalised = Greet(name);
        System.out.println(personalised);


    }

    static String Greet(String name){

        String message = "Hello there " + name;
        return message;


    }

}
