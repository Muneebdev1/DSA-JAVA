import java.util.Arrays;

public class SmallerCurrentNum {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        Solution15 sol = new Solution15();
        int[] ans = sol.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
        
    }
    
}

class Solution15 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] countarray = new int[nums.length];
        for(int i=0; i <nums.length; i++){
            int count =0;
            
            for(int j=0; j<nums.length; j++){

                if(nums[i] > nums[j]){
                    countarray[i]++;
                }
                countarray[i] = count;
            }
        }
        return countarray;
            

        }
        
        
        
    }

