import java.util.Scanner;

public class fanction {
    public static void main(String[] args){
        
            int ans = sum();
            System.out.println(ans);

    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please input your first number: ");
        int num1 = in.nextInt();
        System.out.println("Please enter your second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
       // System.out.println(sum);
        return sum;
    }
}
