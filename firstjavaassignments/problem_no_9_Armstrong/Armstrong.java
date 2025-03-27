package firstjavaassignments.problem_no_9_Armstrong;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You may please enter your number: ");
        // taking input
        Integer number = input.nextInt();
        // converting to string to calculate number of digits in number.
        String arm = Integer.toString(number);
        int length = arm.length();
        // initialized array to save all the powered values of each digit.
        double[] arr = new double[length+2];

        // first loop to convert the string back to int characterwise and then taking power and then assignign value to array.
        for(int i=0; i<length; i++){
            int calc = Character.getNumericValue(arm.charAt(i));
            double result = Math.pow(calc, length);
            
            arr[i] = result;
        }
        // assigning this variable outside so that I may be able to access for if statement.
        double res=0;

        // adding all the number of array and placing the result in res variable.
        for(int i=0; i<length; i++){
            
            res += arr[i];
            
            
        }
        
        if(res == number){
            System.out.println("This is armstrong number");
             
        }else{
            System.out.println("Unfortunately number is no narssastic");
        }



    }
    
}
