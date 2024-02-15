package Annual_Internal2024boards;

import java.util.Scanner;

public class characterManipulation4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int c_v = 0;
        int c_c = 0;
        
        for(int i=1; i<=20;i++){
            System.out.println("Enter a letter: ");
            char l = in.next().charAt(0);
            char L = Character.toUpperCase(l);
            int x = (int)(L);
            if((x==65)||(x==69)||(x==73)||(x==79)||(x==85)){
                c_v = c_v+1;
            }
            else{
                c_c = c_c+1;
            }
        }
        System.out.println("The Number of Vowels: "+c_v);
        System.out.println("The Number of Consonants: " +c_c);
    }
}
