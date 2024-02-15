package Annual_Internal2024boards;

//imports
import java.util.Scanner;
//code
public class series1a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number [N] = "); //Scanner input
        int n = in.nextInt(); //store input
        float S = 1; //initialize variable to store sum
        int f; //factorial values

        for (int i = 2; i <= n; i++) {
            int numerator = (2 * i) - 1; //numerator is always an odd number
            f = 1;

            for (int j = 2; j <= i; j++) {
                f *= j; //to obtain factorial
            }

            double z = (double) numerator / f; //dividing the numerator by the factorial
            S += z; //storing them by adding all of the singular decimal values of the above division
        }
        System.out.println("Sum = " +S); //printing the sum
    }
}