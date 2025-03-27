import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double P = in.nextDouble();
        double A =0;
        System.out.println("Input the annual rate: ");
        double R = in.nextDouble();
        System.out.println("Input the time in years: ");
        int T = in.nextInt();
        A = P * Math.pow((1+(R/100.0)), T);

        System.out.println("This is the final amount " + A);
        System.out.println("This is the compound interest " + (A-P));
    }
    
}
