import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && a > c){
            System.out.println("A is the largest number: ");

        }else if(b > a && b > c ){
            System.out.println("B is the largest number: ");
        }else {
            System.out.println("C is the largest number: ");
        }

    }
}
