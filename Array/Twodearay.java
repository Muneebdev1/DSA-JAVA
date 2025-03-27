import java.sql.DriverManager;
import java.util.Arrays;
import java.util.Scanner;

public class Twodearay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];
        for(int row=0; row < arr.length; row++){
            for (int col=0; col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        for(int[] num: arr){
            System.out.println(Arrays.toString(num));
        }

        // int[][] arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
    
       
        
    }
    
}
