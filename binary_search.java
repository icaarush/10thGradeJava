package Annual_Internal2024boards;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13 }; //random array
        int n = 7; //variable to be searched for
        int l = arr.length; //length of array
        int t = 0; //index if n is found
        int c = 0; //counter
        int ll = 0; //lower limit
        int ul = l - 1; //upper limit [l-1 because last index]

        while (ll <= ul) {
            int m = ll + (ul - ll)/ 2; 

            //check if the variable is at the middle
            if (arr[m] == n) {
                t=m;
                c++;
            }

            //if the variable is greater, care not of the lower half
            if (arr[m] < n) {
                ll = m + 1;
            }
            // if the target is smaller, care not of the greater half
            else {
                ul = m - 1;
            }
        }
        
        if(c==1){ 
            System.out.println("Search successful at index: "+t); //out1
        }
        else{
            System.out.println("Search unsuccessful"); //out2
        }
    }
}