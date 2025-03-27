import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        // factors of given number
        int count = 1;
        int temp = number;
        while (count <= number){
            if (number % count == 0){
                System.out.println("This number is a factor: " + count);

            }
            count++;
            

        }
    }
    
}
