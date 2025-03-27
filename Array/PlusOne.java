import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9};
        Solutionfd sol = new Solutionfd();
        System.out.println(Arrays.toString(sol.plusOne(digits)));
    }    
}

class Solutionfd {
    public int[] plusOne(int[] digits) {
        // Start from the least significant digit (end of array)
        for (int i = digits.length - 1; i >= 0; i--) {
            // If current digit is less than 9, simply increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, set it to 0 and continue to next digit
            digits[i] = 0;
        }
        
        // If we're here, it means all digits were 9
        // Create new array with one extra digit
        int[] result = new int[digits.length + 1];
        result[0] = 1;  // Set first digit to 1, rest are already 0 by default
        return result;
    }
}