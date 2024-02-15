package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class strings2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter something:"); //asking for input
        String n = in.nextLine(); //storing the input
        
        String a = n.replace("a", ""); //removing a if present
        String A = a.replace("A", ""); //removing A if present
        String e = A.replace("e", ""); //removing e if present
        String E = e.replace("E", ""); //removing E if present
        String i = E.replace("i", ""); //removing i if present
        String I = i.replace("I", ""); //removing I if present
        String o = I.replace("o", ""); //removing o if present
        String O = o.replace("O", ""); //removing O if present
        String u = O.replace("u", ""); //removing u if present
        String U = u.replace("U", ""); //removing U if present
        
        System.out.println("After removal of vowels: \n" + U); //printing the output
    }
}