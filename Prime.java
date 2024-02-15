package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class Prime{ //given class name
    private int n; //given instance variable
    
    void input(){ 
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter a number: ");
        int n = in.nextInt(); //storing the number
    }
    
    void checkprime(){
        int c = 0; //count
        for(int i=1; i<=n; i++){ //value goes up to the number
            if(n % i == 0){ //if it is divisible
                c++; //count increases 
            }
        }
        if(c == 2){ //factors are: 1 and n
            System.out.println("The Number is Prime."); //out1
        }
        else{
            System.out.println("The Number is Composite."); //out2
        }
    }
    
    public static void main(String[] args){
        Prime ob = new Prime(); //creating an object
        ob.input(); //calling the input method
        ob.checkprime(); //calling the check method
    }
}