import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        Solutionla sol = new Solutionla();
        sol.rotate(nums, k);
    }
    
}

class Solutionla {
    public static void reverse(int[] num, int i ,int j){
        int li=i;
        int ri=j;
        while(li<ri){
            int temp = num[li];
            num[li] = num[ri];
            num[ri] = temp;

            li++;
            ri--;
        }

    } 
    public void rotate(int[] nums, int k) {
        
            k = k % nums.length;
            if(k<0)
            {
                k+=nums.length;
            }
            reverse(nums, 0, nums.length-1-k);
            reverse(nums, nums.length-k, nums.length-1);
            reverse(nums, 0, nums.length-1);

            System.out.println(Arrays.toString(nums));

    }
}
