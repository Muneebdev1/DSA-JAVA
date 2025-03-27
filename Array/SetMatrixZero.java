import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] matrix ={
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        Solutionlkm sol = new Solutionlkm();
        sol.setZeroes(matrix);

        for(int[] num: matrix){
            System.out.println(Arrays.toString(num));
        }
        
    }
    
}

class Solutionlkm {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] ZeroRows = new boolean[m];
        boolean[] ZeroCols = new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    ZeroRows[i] = true;
                    ZeroCols[j] = true;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ZeroRows[i] || ZeroCols[j]){
                    matrix[i][j] =0;

                }
            }
        }

        
        
        
    }
}
