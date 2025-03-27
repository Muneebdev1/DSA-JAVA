import java.util.List;
import java.util.ArrayList;

public class LuckyNumberOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},
                         {9,11,13},
                         {15,16,17}};  // Removed trailing comma

        Solution14121 sol = new Solution14121();
        List<Integer> arr = new ArrayList<>();  // Added generic type
        arr = sol.luckyNumbers(matrix);
        System.out.println(arr);
    }
}

class Solution14121 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<matrix.length;i++){

            int minVal = matrix[i][0];
            int colInd = 0;

            //finding minimum value in row
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j] < minVal){
                    minVal = matrix[i][j];
                    colInd = j;
                }

            }

            boolean IsMaxInCol = true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][colInd] > minVal){
                    IsMaxInCol = false;
                    break;
                }
            }

            if(IsMaxInCol){
                result.add(minVal);
            }
        }
        return result;
       
        
        
    }
}