package Annual_Internal2024boards;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 8, 6, 2}; //random array

        int n = 1; //variable to be searched for
        int l = arr.length; //length of array
        int t = 0; //index of var if found
        int c = 0; //counter
        
        for (int i = 0; i < l; i++) { //from first to last
            if (arr[i] == n) { //if found then
                t = i; //store its index
                c++; //and increase count
            } //else, move on
        }
        if(c==1){ // if found
            System.out.println("Search successful at index: " +t); //out1
        }
        else{ //if not found
            System.out.println("Search unsuccessful"); //out2
        }
    }
}