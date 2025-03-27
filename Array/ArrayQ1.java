import java.util.Arrays;

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}

public class ArrayQ1 {
    public static void main(String[] args) {
        int[] nums = {5, 0, 1, 2, 3, 4};
        Solution solution = new Solution();
        int[] ans = solution.buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
