import java.util.Scanner;

public class Comission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of commission: ");
        double num1 = in.nextDouble();
        System.out.println("Enter the amount of sales: ");
        double num2 = in.nextDouble();

        double result = (num1/num2 )*100;
        System.out.println(result);
    }
    
}
