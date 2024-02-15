package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class strings6{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: "); //asking for input
        String n = in.next(); //storing the input
        
        for(int i = 0;  i<n.length(); i++){ //only runs till number of letters
            char x = n.charAt(i); //one letter at a time
            int a = (int)(x); //gets ASCII code
            System.out.println("ASCII of "+x+"= "+a); //output
        }
    }
}