package firstjavaassignments.problem_no_7_fabinci;

import java.util.Scanner;

public class Fabinonci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please inpput the number till where you want to calculate the series");
        int n = input.nextInt(); // taking input before loop

        int[] facbinciseries = new int[n +1]; // array large enough to store the series.
        if (n < 0){
            System.out.println("Please enter a non-negative integer");
            return;

        }
        facbinciseries[0] = 0;
        if (n > 0){
            facbinciseries[1] = 1;

        }
        for (int i =2; i <=n; i++){
            facbinciseries[i] = facbinciseries[i-1] + facbinciseries[i-2];

        }

        
        System.out.println("Your fabinci sequence is: " );
        for (int num : facbinciseries){
            System.out.println(num);
        }
    }
    
}
