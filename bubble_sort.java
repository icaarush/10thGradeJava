package Annual_Internal2024boards;

public class bubble_sort {
    public static void main(String[] args) {
        //random array using google random number generator
        int[] arr = {11, 100, 73, 82, 47, 40, 21}; 
        
        int n = arr.length; //lenght of the array
        
        //before sort
        System.out.println("The Original Array: ");
        for (int p=0; p<n; p++) {
            System.out.print(arr[p] + " ");
        }
        System.out.println();
        
        //sorting
        for (int i = 0; i < n-1; i++) { //index = lenght -1
            for (int j = 0; j < n - i - 1; j++) { // one number is sorted
                if (arr[j] > arr[j + 1]) { //compare with the next number
                    // swapping arr[j] and arr[j+1]
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        //after sort
        System.out.println("The Sorted Array: ");
        for (int p=0; p<n; p++) {
            System.out.print(arr[p] + " ");
        }
        System.out.println();
    }
}