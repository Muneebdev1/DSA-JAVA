import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number that you want to reverse");
        int number = in.nextInt();

        String temp = Integer.toString(number);
        int[] arraynumber = new int[temp.length() + 1];
        
        for(int i=number; i > 0; i/=10){
            arraynumber[] = ;

        }

        for(int digit : arraynumber){
            System.out.println(digit);
        }


    }
    
}
