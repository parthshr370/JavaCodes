
// Basic calcultor made using if else while loops and operators like + - ? * used


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ans = 0 ;

        while(true) {
            System.out.println("Enter the operator");
            char outp = in.next().trim().charAt(0);

            if(outp == '+' || outp == '-' || outp == '*' || outp == '/' || outp == '%') {
                System.out.println("Enter the 2 numbers");

                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(outp == '+'){

                    ans = num1 + num2 ;

                }
                if(outp == '-'){

                    ans = num1 - num2 ;

                }
                if(outp == '*'){

                    ans = num1 * num2 ;
                }
                if(outp == '/'){
                    ans = num1/num2 ;


                }

            } else if(outp == 'x' || outp == 'X'){

                break;
            } else{
                System.out.println("The operation is invalid");

            }
            System.out.println("The result is " + ans);
        }

    }
}
