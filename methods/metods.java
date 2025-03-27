import java.util.Scanner;

public class metods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        maxima(num1, num2, num3);
        minima(num1, num2, num3);

        
    }
    static void maxima(int a, int b, int c){
        if (a>b && a >c){
            System.out.println("This number is largest: "+ a);
        }
        else if (b>a && b >c){
            System.out.println("This number is largest: "+ b);
        }
        else {
            System.out.println("This number is largest: "+ c);
        }
    }

    static void minima(int a, int b, int c){
        if (a<b && a <c){
            System.out.println("This number is smallest: "+ a);
        }
        else if (b<a && b <c){
            System.out.println("This number is largest: "+ b);
        }
        else {
            System.out.println("This number is largest: "+ c);
        }
    }
    
}
