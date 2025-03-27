import java.util.Arrays;

public class ProuctOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Solution141 sol = new Solution141();
        int[] ans = sol.productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
        
    }
    
}

class Solution141 {
    public int[] productExceptSelf(int[] nums) {
        int[] result  = new int[nums.length];

        int pre = 1, post = 1;

        for(int i=0;i<nums.length;i++){
            result[i] = pre;
            pre = pre*nums[i];
        }

        for(int i=nums.length-1; i>=0;i--){
            result[i] = result[i]*post;
            System.out.println(post);
            post = post*nums[i];

        }

        return result;
        

       

        
    }
}
