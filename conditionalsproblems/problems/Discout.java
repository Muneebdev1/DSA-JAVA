import java.util.Scanner;

public class Discout {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please share price of the product: ");
        int productprice = in.nextInt();
        System.out.println("Please share the discount in %age: ");
        double Discout = productprice * in.nextDouble();

        double price = productprice - Discout/100;
        System.out.println(price);
    }
    
}
