package Annual_Internal2024boards;

public class pattern9f {
   public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { //no of columns = 5
            /** to print:
             * 2
             * 33
             * 444
             * 5555 */
            for (int j = 1; j < i; j++) {
              System.out.print(i);
            }
            
            /**to print:
              12345
             2345
              345
             45
              5
             */
            for (int k = i; k <= 5; k++) {
               System.out.print(k);
            }
            System.out.println();
        }
   }
}
