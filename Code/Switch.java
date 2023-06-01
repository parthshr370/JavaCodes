import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String Companies = in.next();

        switch (Companies) {

            case "amazon" :
                System.out.println("Get anything at your doorstep");
break;
            case "apple" :
                System.out.println("You cant afford it but its good");
break;
            case "microsoft" :
                System.out.println("Windows was made here");
break;
            case "netflix" :
                System.out.println("Chill and ??");
break;
            case "meta" :
                System.out.println("some 3d verse idk idk");
break;

            default:
                System.out.println("Enter the company Name");



        }
    }

}
