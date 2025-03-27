import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.close();  // Close scanner to avoid memory leak

        System.out.println("Prime numbers between " + num1 + " and " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {  // Check if i is prime
                System.out.print(i + " ");  // Print prime number
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;  // 2 is the only even prime number
        if (n % 2 == 0) return false;  // Exclude even numbers
        
        for (int c = 3; c * c <= n; c += 2) {  // Check only odd numbers up to √n
            if (n % c == 0) {
                return false;
            }
        }
        return true;
    }
}

    

