import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6}
        };
        Solution112 sol = new Solution112();
        int[][] trans = sol.transpose(matrix);

        for(int[] train : trans){
            System.out.println(Arrays.toString(train));
        }
        
    }
    
}

class Solution112 {
    public int[][] transpose(int[][] matrix) {
        int[][] Trans = new int[matrix[0].length][matrix.length];

        
        for(int j=0; j<matrix.length;j++){
            for(int i=0;i<matrix[j].length; i++){
                Trans[i][j] = matrix[j][i];
            }

        }
        return Trans;
        
    }
}
