package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class strings14{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter something: "); //asking for input
        String n = in.nextLine(); // storing input
        String N = n.toUpperCase(); //converting to uppercase
        
        System.out.println("The Output: "); 
        for(int i = 0; i<N.length(); i++){ //iterations = no. of char
            char a = N.charAt(i); //obtaining char at position
            int x = (int)(a); //obtaining ASCII value
            int z = x-1; //previous char
            
            if(z==65 || z==69 || z==73 || z==79 || z==85){ //if it is a vowel
                z = x+1; //next char
                char o = (char)(z); //character of the ASCII code
                System.out.print(o); //output
            }
            else if(z==31){ //if it is white space, ASCII: 32 but x-1=> 32-1 = 31
                System.out.print(" "); //printing whitespace
            }
            else{ //if it not a vowel or space, then it is a consonant!
                char o = (char)(z); //character of the ASCII code
                System.out.print(o); //output
            }
        }
    }
}