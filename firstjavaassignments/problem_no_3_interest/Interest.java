import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input your principal amount: ");
        int p = input.nextInt();
      
        System.out.println("Please input your time for investment in years: ");
        int t = input.nextInt();
        
        System.out.println("Please input your Interest rate: ");
        int r = input.nextInt();


        double SimpleInterest = (p*t*r)/100;

        System.out.println("Your simple interest for this period is: " + SimpleInterest);




    }
}
