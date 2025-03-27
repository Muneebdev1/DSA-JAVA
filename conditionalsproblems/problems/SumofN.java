import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=0;
        int sum = 0;
        while(a != 1){
                a = in.nextInt();
                sum += a;
        }
        System.out.println(sum);

    }
    
}
