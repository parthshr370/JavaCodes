
//Program to check the Case of the first string of the input (uppercase/lowercase)

import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        // the char(0) tells us the position of the string . here the string at place 0 will be selected

        if(ch >= 'a' && ch <= 'z' ){

            System.out.println("Lowecase");

        }else {

            System.out.println("Uppercase");
        }



    }
}
