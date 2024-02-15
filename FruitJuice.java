package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class FruitJuice { //given class name
    int product_code;
    String flavour, pack_type;
    int pack_size, product_price;
    
    FruitJuice(){ //default constructor
        product_code = 0;
        flavour = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }
    
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Flavour: ");
        flavour = in.nextLine(); //storing the flavour
        System.out.print("Enter the Pack Type: ");
        pack_type = in.nextLine(); //storing the pack type
        System.out.print("Enter the Product Code: ");
        product_code = in.nextInt(); //storing the code
        System.out.print("Enter the Pack Size: ");
        pack_size = in.nextInt(); //storing the size
        System.out.print("Enter the Product Price: ");
        product_price = in.nextInt(); //storing the price
    }
    
    public void discount(){
        product_price = product_price - 10; //given discount 
    }
    
    public void display(){ //the output
         System.out.println("Product Code: " + product_code);
        System.out.println("Flavour: " + flavour);
        System.out.println("Pack Type: " + pack_type);
        System.out.println("Pack Size: " + pack_size);
        System.out.println("Product Price: " + product_price);
    }
}