package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class strings20c{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: "); //asking for input
        String n = in.next(); //storing input
         
        for(int i = 0; i<n.length(); i++){
            //last char = last row => rows = no.of char
            for(int j = i; j<n.length(); j++){
                //correspoding column can only repeat till char left
                char o = n.charAt(j); //obtaining char
                System.out.print(o); //printing char
            }
            System.out.println(); //new line after each row
        }
    }
}