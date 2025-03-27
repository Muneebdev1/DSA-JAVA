import java.util.Arrays;
import java.util.Scanner;

public class aray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[12];
        for(int i =0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
