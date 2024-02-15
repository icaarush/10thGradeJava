package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
class RailwayTicket{ //given class name
    String name, coach;
    long mob_no;
    int amt, totalamt;
    
    void accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name: "); //asking for input
        name = in.next(); //storing their name
        System.out.println("Enter the name of the Coach: ");
        coach = in.next(); //storing their coach
        System.out.println("Enter your Mobile Number: ");
        mob_no = in.nextLong(); //storing their mobile number
        System.out.println("Enter the Amount of your Ticket: ");
        amt = in.nextInt(); //storing their amount
    }
    
    void update(){ //as per given conditions
        if(coach.equalsIgnoreCase("first_ac")){
            totalamt = amt + 700; 
        }
        else if(coach.equalsIgnoreCase("second_ac")){
            totalamt = amt + 500;
        }
        else if(coach.equalsIgnoreCase("third_ac")){
            totalamt = amt + 250;
        }
        else if(coach.equalsIgnoreCase("sleeper")){
            totalamt = amt;
        }
    }
    
    void display(){
        System.out.println("Name \t Coach \t Total Amount \t Mobile Number");
        System.out.println(name +"\t"+ coach +"\t"+ totalamt +"\t"+ mob_no);
    }
    
    public static void main(String[] args){
        RailwayTicket ob = new RailwayTicket(); //creating an object
        ob.accept(); //invoking the input method
        ob.update(); //invoking the calculation method
        ob.display(); //invoking the display method
    }
}