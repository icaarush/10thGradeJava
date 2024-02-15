package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class series1b{
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number[A]: "); //to accept numerator
        int a = in.nextInt();
        System.out.println("Enter another number[n]: "); //to accept limit
        int n = in.nextInt();
        double S = 0, z;

        for (int i = 1; i <= n; i++) {
            double f = 1;
            
            for (int j = 1; j <= i; j++) {
                f *= j; //to obtain the factorial
            }
            
             z = a / f; //division
            S += z; //to store all the quotients by addition
        }
        System.out.println("The Sum is: " +S); //printing the output
    }
}