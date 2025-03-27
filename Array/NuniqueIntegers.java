import java.util.Arrays;
import java.util.Random;
public class NuniqueIntegers {
    public static void main(String[] args) {
        int n=5;

        Solutionlp sol = new Solutionlp();
       int[] ans = sol.sumZero(n);
       System.out.println(Arrays.toString(ans));
        
    }
    
}

class Solutionlp {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int temp =n;
        
        
        
            for(int i=0;i<n/2;i++){
                
                
                
                
                
                arr[i] = temp;
                
                arr[n-1-i] = -arr[i];
                temp--;
                
            }
            if (n%2 !=0){
                arr[n/2] = 0;
                
        }
        

        return arr;
        
    }
}
