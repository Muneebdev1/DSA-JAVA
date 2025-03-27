import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your desired Multi digit number: ");
        int number = in.nextInt();

        // for product of numbers.

        int temp = number;
        
        int product = 1;
       

        while(temp > 0){
                
                int rem = temp % 10;
                product *= rem;
                temp = temp/10;
        }
        System.out.println(product);


        // sum of numbers

        int sum = 0;
        while(temp > 0){
            int rem = temp %10;
            sum += rem;
            temp = temp/10;

        }
        System.out.println(sum);

    }
    
}
