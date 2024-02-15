package Annual_Internal2024boards;


public class charcterManipulations12f {
    public static void main(String[] args){
        int a = 97; //starts with small a
        for (int i = 1; i <= 4; i++) { //4 rows
            for (int j = 1; j <= 5; j++) { //5 columns
                System.out.print((char)a + " ");
            }
            a++;
            
            //becomes capital after 2 rows
            if (i == 2){
                a = 65; //ASCII code of capital A
            }
            System.out.println();
        }
    }
}