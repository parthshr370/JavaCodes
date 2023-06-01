import java.util.Scanner;

public class Salary{


    public static void main(String[] args) {

        Scanner salary = new Scanner(System.in);

        System.out.println("enter the salary of the employee");

        int a = salary.nextInt();

        if(2000 < a){

            a = a + 10000;


        }
        else {
            a = a + 20000;

        }
        System.out.println(salary);

    }
}