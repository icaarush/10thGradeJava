package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
class Employee{ //given class name
    //declaring Instance Variables
    long pan;
    String name;
    double taxincome, tax;
    
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your PAN: "); //asking for input
        pan = in.nextLong(); //storing the PAN
        System.out.println("Enter your Name: "); //asking for input
        name = in.next(); //storing their name
        System.out.println("Enter your Taxable Income: "); //asking for input
        taxincome = in.nextDouble(); //storing their taxable annual income
    } 
    void cal(){ 
        if(taxincome<=250000){
            tax=0; //no tax
        }
        else if(taxincome>=250001 && taxincome<500000){
            tax = 0.1 * (taxincome-250000); //10% of income exceeding 250000
        }
        else if(taxincome>=500001 && taxincome<1000000){
            tax = 30000 + (0.2 * (taxincome-500000)); //30000 + 20% of income exceeding 5000000
        }
        else if(taxincome>1000000){
            tax = 50000 + (0.3 * (taxincome - 1000000)); //50000 + 30% of income exceeding 1000000
        }
    }
    void display(){ 
        System.out.println("Pan Number \t Name \t Tax-Income \t Tax");//format
        System.out.println(pan +"\t \t"+ name +" \t"+ taxincome +"\t"+ tax); 
    }
}