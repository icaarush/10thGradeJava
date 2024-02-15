package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class BookFair { //given class name
    String bname;
    double price;
    
    public BookFair(){ //default constructor
        bname = "";
        price = 0.0;
    }
    
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        bname = in.nextLine(); //storing the name of the book
        System.out.print("Enter the Price: ");
        price = in.nextDouble(); //storing the price of the book
    }
    
    public void calculate(){
        double d; //for discount
        if (price <= 1000) //condition1
            d = price * 0.02; //2% of the price
        else if (price <= 3000)
            d = price * 0.1; //10% of the price
        else
            d = price * 0.15; //15% of the price
            
        price = price - d;
    }
    
    public void display(){ //output
        System.out.println("The Name of the Book: " + bname);
        System.out.println("Final Price: " + price);
    }
    
    public static void main(String[] args){ //main method
        BookFair obj = new BookFair(); //creating an object
        obj.input(); //invoking input method
        obj.calculate(); //invoking discount method
        obj.display(); //invoking output method
    }
}