package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class oddEven_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = new int[20]; //array size: 20
        int sumE = 0; //even number sum
        int sumO = 0; //odd number sum

        for (int i = 0; i < 20; i++) { //for 20 numbers
            System.out.print("Enter a number: "); //asking to input
            nums[i] = in.nextInt(); //storing every number
        }
        
        for (int n : nums) { //each element in array
            if (n % 2 == 0) { //if it is even
                sumE += n;
            } else {
                sumO += n; //if not even then it is odd!
            }
        }

        System.out.println("Sum of Even Numbers: " + sumE); //out1
        System.out.println("Sum of Odd Numbers: " + sumO); //out2
    }
}
