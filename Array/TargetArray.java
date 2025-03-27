import java.util.Arrays;
import java.util.ArrayList;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        Solution16 sol = new Solution16();
        int[] ans = sol.createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
        
    }
    
}

class Solution16 {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> Target = new ArrayList<>();
        int[] Target1 = new int[nums.length]; 
        
        
        for(int i=0; i< nums.length; i++){
            Target.add(index[i], nums[i]);

        }
        int i=0;
        for (int tar : Target){
            Target1[i] = tar;
            i++;
        }

        return Target1;
 
    }
}
