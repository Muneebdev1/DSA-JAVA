import java.util.Scanner;

public class FirstN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();  // Read integer input

        double average = averageN(N);
        System.out.println(average);
        
        in.close();  // Close Scanner
    }

    static double averageN(int a) {
        double sum = 0;
        
        for (int i = 0; i <= a; i++) {
            sum += i;
        }

        return sum / (a + 1);  // Correcting the denominator
    }
}

