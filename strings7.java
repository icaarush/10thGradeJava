package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class strings7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter something: "); //asking for input
        String n = in.nextLine(); //storing the input
        
        String a = n.replace("a", "*"); // replacing a with *
        String A = a.replace("A", "*"); // replacing A with *
        String e = A.replace("e", "*"); // replacing e with *
        String E = e.replace("E", "*"); // replacing E with *
        String i = E.replace("i", "*"); // replacing i with *
        String I = i.replace("I", "*"); // replacing I with *
        String o = I.replace("o", "*"); // replacing o with *
        String O = o.replace("O", "*"); // replacing O with *
        String u = O.replace("u", "*"); // replacing u with *
        String U = u.replace("U", "*"); // replacing U with *
        
        System.out.println("After transformation: \n"+ U); //printing the output
    }
}