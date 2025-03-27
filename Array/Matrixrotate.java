import java.util.Arrays;

public class Matrixrotate {
    public static void main(String[] args) {
        int[][] mat = {
            {0,1},
            {1,0}
        };

        int[][] target = {
            {1,0},
            {0,1}
        };

        Solutionmn sol = new Solutionmn();
        System.out.println(sol.findRotation(mat, target));

        
    }
    
}

class Solutionmn {
    public boolean findRotation(int[][] mat, int[][] target) {
        

        for(int r=0;r<4;r++){
            if(Arrays.deepEquals(mat, target)){
                return true;
            }

        rotate90(mat);
        }
        return false;
    }
        

        private void rotate90(int[][] mat){
            int n =  mat.length;

        
        //transpose of the matrix
        for(int row=0;row<mat.length;row++){
            for(int col=row+1;col<mat[row].length; col++){
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;

            }
        }

        // inverse of matrix.
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length/2;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;

            }

        }

    
}
}
