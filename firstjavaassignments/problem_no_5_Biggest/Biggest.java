import java.util.Scanner;

public class Biggest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your first number for comparison");
        int num1 = input.nextInt();

        System.out.println("Please input your first number for comparison");
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println(num1+ " Is the biggest number of the two");
        }else{
            System.out.println(num2+" Is the biggest number");
        }
    }
}
