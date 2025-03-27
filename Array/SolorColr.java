import java.util.Arrays;
import java.util.Map;

public class SolorColr {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        Solutionlm sol = new Solutionlm();
        sol.sortColors(nums);

        
    }
    
}

class Solutionlm {
    public static void swap(int i, int j, int[] nums1){
        int temp = nums1[i];
        nums1[i] = nums1[j];
        nums1[j] = temp;

    }
    public void sortColors(int[] nums) {
        int z=0;
        int t= nums.length-1;
        int i=0;
        while(i <= t){
            if(nums[i] == 0){
                swap(i,z,nums);
                z++;
                i++;
            }else if(nums[i] == 2){
                swap(i, t, nums);
                i++;
                t--;
            }else i++;

        }

        System.out.println(Arrays.toString(nums));
        
        
    }
}