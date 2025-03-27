import java.util.Arrays;

public class ConcatentationQ2 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        Solution sol = new Solution();
        int[] ans = new int[(2*nums.length)];
        ans = sol.getConcatenation(nums);
        System.out.println(Arrays.toString(ans));

        
    }
    
}

class Solution{
    public int[] getConcatenation(int[] nums){
        int[] ans = new int[(2*nums.length)];
        for(int i=0; i<nums.length;i++)
        {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }

        return ans;

    }

}
