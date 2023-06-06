// Creating Functions in Java

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

int ans = sum2(); // initiating the sum2 function as ans . the output stream is ans

        System.out.println(ans);

    }

    // run the function and then return the final answer to the int ans
 //the below code is used to establish a static integer method named sum2

    static int sum2() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;

        return sum ;


    }
}