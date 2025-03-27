import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("We will calculate eculiden distance: ");
        System.out.println("Please enter X1: ");
        int num1 = in.nextInt();
        System.out.println("Please enter X2: ");
        int num2 = in.nextInt();
        System.out.println("Please enter y1: ");
        int num3 = in.nextInt();
        System.out.println("Please enter y2: ");
        int num4 = in.nextInt();

        double result = Math.pow((num1-num2), 2) + Math.pow((num3=num4), 2);
        System.out.println(result);

         
        
    }
    
}
