import java.util.Arrays;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2},
            {3,4}
        };
        int r=1;
        int c=4;

        Solutionpi sol = new Solutionpi();
        int[][] ans = sol.matrixReshape(mat, r, c);
        for(int[] num: ans){
            System.out.println(Arrays.toString(num));
        }
        
    }
    
}

class Solutionpi {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int col = mat[0].length;

        if((rows*col) != r*c){
            return mat;
        }
        
        int[][] matri = new int[r][c];

        int index =0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                int newRow = index / c;
                int newCol = index % c;

                matri[newRow][newCol] = mat[i][j];
                index++;
            }
        }
        return matri;

    }
}


// I like this solution.

// class Solution {
//     public int[][] matrixReshape(int[][] mat, int r, int c) {

//         int originalRows = mat.length;
//         int originalCols = mat[0].length;

//         // Check if reshaping is possible
//         if (originalRows * originalCols != r * c) {
//             return mat; // Return original matrix if dimensions don't match
//         }

//         int[][] arr = new int[r][c];

//         int l = 0, m = 0;
//         for (int i = 0; i < originalRows; i++) {
//             for (int j = 0; j < originalCols; j++) {
//                 arr[l][m] = mat[i][j];
//                 m++;  
                
                 
//                 if (m == c) {
//                     m = 0;
//                     l++;
//                 }
//             }
//         }
//         return arr;
//     }
// }