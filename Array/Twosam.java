import java.util.Arrays;

public class Twosam {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 13;
        Solutionre sol = new Solutionre();
        System.out.println(Arrays.toString(sol.twoSum(nums, target)));

        
    }
    
}

class Solutionre {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        
        for(int j=0;j<nums.length;j++){
            for(int i=0;i<nums.length;i++){
                if(j != i ){
                    if(nums[j]+nums[i] == target){
                        int[] arr1 = {i,j};
                        arr = arr1;

                    }

                }
            }

        }

        return arr;

        
    }
}
