import java.util.Scanner;

public class Simplecalc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Please enter the operator for the operation that you want to perform");
        char operator = input.next().charAt(0); // Takes the first character of the input string

        if(operator == '+'){
            int result = num1 + num2;
            System.out.println("The sum of two number is: " + result);
        }else if(operator == '-'){
            int result = num1 - num2;
            System.out.println("The difference of two number is: " + result);
        }else if(operator == '/'){
            int result = num1 / num2;
            System.out.println("The division of two number is: " + result);

        }else if(operator == '*'){
            int result = num1 * num2;
            System.out.println("The prodcut of two number is: " + result);
        }

    }
}
