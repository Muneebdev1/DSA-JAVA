public class OddValueMatrix {
    public static void main(String[] args) {
        
        int m=2;
        int n=3;
        int[][] indices = {
            {0,1},
            {1,1}
        };

        Solution123 sol = new Solution123();
        int ans = sol.oddCells(m, n, indices);
        System.out.println(ans);


    }
}

class Solution123 {
   
    public int oddCells(int m, int n, int[][] indices) {
        int finalnum = 0;
        int[][] matrix = new int[m][n];
        
        for(int[] num : indices){
            for(int j=0;j<num.length;j++){
                int row_no_of_matrix_to_increment = num[j];
                int column_no_of_matrix_to_increment = num[j];
                if(j==0){
                    for(int i=0;i<n;i++){
                        matrix[row_no_of_matrix_to_increment][i]++;
                    }

                }else if(j== 1){
                    for(int i=0;i<m;i++){
                        matrix[i][column_no_of_matrix_to_increment]++;
                    }

                }
            }
             
            
        }
        for(int[] num : matrix){
            for(int i=0; i<num.length;i++){
                
                if(num[i]%2 != 0){
                    finalnum++;
                }
            }
        }

        return finalnum;
        
        
    }
}
