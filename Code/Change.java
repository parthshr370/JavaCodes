import java.util.Arrays;

public class Change {

    public static void main(String[] args) {

        int[] arr ={1,3,5,44,22,90}; // at first arr is pointing towards this array

        hello(arr);

        System.out.println(Arrays.toString(arr)); //printing the array

        }

    static void hello(int[] nums) {

        nums[0] = 99 ; //here the num now points towards


    }
}

