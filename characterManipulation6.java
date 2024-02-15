package Annual_Internal2024boards;

//imports
import java.util.Scanner;
//code
public class characterManipulation6{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character: "); //input first char
        char a = in.next().charAt(0); //store input
        System.out.println("Enter another character: "); //input second char 
        char b = in.next().charAt(0); //store input
        
        int m = (int)(a); //ASCII of first char
        int n = (int)(b); //ASCII of second char
        int d = m-n; //difference of ASCII
        
        System.out.println("d = ("+m+"-"+n+") = "+d); //output format
        //given conditions:
        if(d==0)
        System.out.println("both the characters are same.");//out1
        else if(d<0)
        System.out.println("first character is smaller."); //out2
        else if(d>0)
        System.out.println("second character is smaller."); //out3
    }
}