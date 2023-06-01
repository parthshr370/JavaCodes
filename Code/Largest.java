// To find which is the largest of the 3 numbers entered in the input

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        System.out.println("enter 3 numbers");
        Scanner lar = new Scanner(System.in);

       int a = lar.nextInt();
       int b = lar.nextInt();
       int c = lar.nextInt();

       //find the largest of the 3 numbers
        int max = a ;
        if(b > max ){

           max = b; ;

        }
        if (c > max ){
            max = c ;



        }

        System.out.println("the largest number is " + max);
    }


}
