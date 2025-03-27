import java.util.Scanner;

public class Factorialprog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        
        int factorial = 1;
        for(int i=number; i >= 0; i--){
            
            if(number == 0){
                System.out.println("Factorial of your number is: ");
                break;
            }else{
                
                factorial *= i;
                

            }

        }
       System.out.println(factorial);
    }
}
