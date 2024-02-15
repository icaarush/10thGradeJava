package Annual_Internal2024boards;

//imports
import java.util.Scanner;

//code
public class marks_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int N = in.nextInt(); //stores no. of students

        String[] names = new String[N]; //array creation 
        double[] totalMarks = new double[N];
        double totalSum = 0;

        for (int i = 0; i < N; i++) {
            in.nextLine(); //clears line
            System.out.print("Enter the name of Student " + (i + 1) + ": ");
            names[i] = in.nextLine(); //index: 0, but student: 1  => [i+1]
            System.out.print("Enter the total marks of Student " + (i + 1) + ": ");
            totalMarks[i] = in.nextDouble();
        }
        
        for (double marks : totalMarks) { //as each element goes in the entire array
            totalSum += marks; //add all marks
        }

        double avg = totalSum / N; //average formula
        System.out.println("Average total marks: " + avg); //print average

        System.out.println("Deviations of each student:");
        for (int i = 0; i < N; i++) { //all the students
            double dev = totalMarks[i] - avg; //deviation formula
            System.out.println(names[i] + ": " + dev); //name and their deviation
        }
    }
}
