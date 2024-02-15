package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class userMethods_Factorial{
    long fact(int n){ //given method name
        long f = 1; //factorial variable
        for(int i = 1; i<=n; i++){ //runs till the number
            f = f*i; //factorial
        }
        return (f); //returns factorial
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: "); //asking for input
        int n = in.nextInt(); //storing the n value
        System.out.println("Enter another number: "); //asking for another input
        int m = in.nextInt(); //storing the m value
        
        userMethods_Factorial ob = new userMethods_Factorial(); //creating an object of the class
        float S = (ob.fact(n))/((ob.fact(m)*(ob.fact(n-m)))); //given expression 
        System.out.println("The S = " + S); //output
    }
}