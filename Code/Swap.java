public class Swap {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        swap(a,b);

        System.out.println(a + " " + b);

        String name = "Parth Sharma" ;

        hello(name);

        System.out.println(name);
    }

    static void hello(String name){

        name = "Rishit sharma" ;


    }

    static void swap(int a , int b ) // the use of static void since we dont need to return any value at the start of the code

    {

        int temp = a;
        a = b ;

        b = temp ;

    }
}
