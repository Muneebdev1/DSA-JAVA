import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = new int[nums.length];
        Solution1 sol = new Solution1();
        ans = sol.runningSum(nums);
        System.out.println(Arrays.toString(ans));

        
    }
    
}

class Solution1 {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i=1; i<nums.length;i++){
            
            
            ans[i] = ans[i-1] + nums[i];
        }

        return ans;
    }
}