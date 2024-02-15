package Annual_Internal2024boards;


import java.util.Scanner;

public class pattern_floydtriangleORicse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type 1 for Floyd's triangle"); //displaying choices
        System.out.println("Type 2 for an ICSE pattern");

        System.out.print("Enter your choice: "); //input
        int x = in.nextInt(); // storing the input

        switch (x) { //the variable
            case 1: //if they enter 1
                int a = 1; //triangle starts with the number 1
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(a++ + "  "); //consecutive numbers
                    }
                    System.out.println();
                }
                break; //to stop fallthrough

            case 2: //if they enter 2
                String s = "ICSE";
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(s.charAt(j));//one character at a time
                    }
                    System.out.println();
                }
                break; //preventing fallthrough

            default:
                System.out.println("Incorrect Choice"); //appropriate output
        }
    }
}