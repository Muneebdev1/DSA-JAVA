import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n=3;
        Solution76 sol = new Solution76();
        int [][] ans = sol.generateMatrix(n);
        for(int[] anu: ans){
            System.out.println(Arrays.toString(anu));
        }
        
    }
    
}

class Solution76 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top =0;
        int bottom=matrix.length-1;
        int left =0;
        int right=matrix[0].length-1;
        int var=1;

        while(top <= bottom && left <=right){

            for(int i=left;i<=right;i++){
                matrix[top][i] = var;
                var++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                matrix[i][right] = var;
                var++;
            }
            right--;

            if(left <= right){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i] = var;
                    var++; 
                }
                bottom--;

            }

            if(top <= bottom){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left] = var;
                    var++;
                }
                left++;

            }

        }

        return matrix;



        
        
    }
}