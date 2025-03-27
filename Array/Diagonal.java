public class Diagonal {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        Solution132 sol = new Solution132();
        int ans = sol.diagonalSum(mat);
        System.out.println(ans);
        
    }
    
}

class Solution132 {
    public int diagonalSum(int[][] mat) {
        int i = 0;
        int sump =0;
        int sums = 0;
        int end = mat.length - 1;
        for(int[] num : mat){
            sump += num[i];
            

            if(i != end){
                sums +=num[end];
                      
            }
            i++;
            end--;
           

        }

        System.out.println(sump);
        
        return sump + sums;
        
    }
}
