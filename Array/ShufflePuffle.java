import java.util.Arrays;

public class ShufflePuffle {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
      
        Solution2 sol = new Solution2();
        int[] ans = new int[nums.length];
        ans = sol.shuffle(nums, (nums.length/2));
        System.out.println(Arrays.toString(ans));
        
    }
    
}
class Solution2 {
    public int[] shuffle(int[] nums, int n) {
         int[] ans = new int[nums.length];
         int numa =n;
         int j =0;
        for (int i=0; i< nums.length/2;i++)
        {
            ans[j] =nums[i];
            ans[j+1] = nums[numa];
            j+=2;
            numa++;
            
           
        }
        return ans;
        
        
    }
}
