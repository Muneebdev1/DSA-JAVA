public class Ngoodpair {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        Solution14 sol = new Solution14();
        int ans = sol.numIdenticalPairs(nums);
        System.out.println(ans);

    }
    
}


class Solution14 {
    public int numIdenticalPairs(int[] nums) {
        int ans =0;
        for(int i=0; i<nums.length; i++){
            int j =0;
            if(nums[i] == nums[j]){
                ans++;
                
            }
            j++;
            
        }

        return ans;
    }
}