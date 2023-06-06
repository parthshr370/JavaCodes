public class Shadow {

static int x = 90 ;  // this is initialised inside this scope of public class
     //the value of larger scope gets shadowed when the var is initialised again

    public static void main(String[] args) {

        int x = 70;

fun();
    }
 static void fun(){

     System.out.println(x); // x = 70 will be printed
 }

}
