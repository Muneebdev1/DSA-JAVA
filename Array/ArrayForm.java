import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;

public class ArrayForm {
    public static void main(String[] args) {
        int[] num = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 34;

        Solutionasd sol = new Solutionasd();
        List<Integer> arr = sol.addToArrayForm(num, k); // No need to cast to ArrayList
        System.out.println(arr); // Should print [1, 0, 0, 0, 0, 0, 0, 0, 3, 3]
    }
}

class Solutionasd {
    public List<Integer> addToArrayForm(int[] num, int k) {
        // Build the string from the array
        StringBuilder nam = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            nam.append(num[i]); // More efficient than string concatenation
        }

        // Convert to BigInteger and add k
        BigInteger finalnum = new BigInteger(nam.toString());
        BigInteger bi = finalnum.add(BigInteger.valueOf(k));

        // Convert result to list of digits
        ArrayList<Integer> arr = new ArrayList<>();
        String resultStr = bi.toString(); // e.g., "10000000033"
        
        // Add each digit to the list
        for (int i = 0; i < resultStr.length(); i++) {
            int digit = Character.getNumericValue(resultStr.charAt(i)); // Convert char '1' to int 1
            arr.add(digit); // Append digit to list
        }

        return arr;
    }
}
        
       
        