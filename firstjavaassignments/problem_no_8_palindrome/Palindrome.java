package firstjavaassignments.problem_no_8_palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String plai = input.next();
        int length = plai.length();
        int halflength = length/2;
        
        

        for (int i=0; i <= halflength; i++){
                int secondary = length;
                if(plai.charAt(i) == plai.charAt(secondary-1)){
                    System.out.println("The number is plaindrome");
                    break;

                }else{
                    System.out.println("Unfortunately number is not plaindrome");
                    break;
                }
            

            
            }
            
    }
    
}
