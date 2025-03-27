public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        Solution sol = new Solution();
        int ans = sol.maximumWealth(accounts);
        System.out.println(ans);
        
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max=0;
        
        for(int i=0;i<accounts.length;i++){
            
            
            int ans=0;
            for(int j=0;j<accounts[i].length; j++){
                
                ans += accounts[i][j];

            }
            
            if(ans > max){
                max =ans;
            }
        }
        return max;
        
    }
}