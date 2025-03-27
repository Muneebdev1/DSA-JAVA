public class MaxSubArrray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Solutionlk sol = new Solutionlk();
        System.out.println(sol.maxSubArray(nums));
        
    }
    
}
class Solutionlk {
    public int maxSubArray(int[] nums) {
        int CS =0;
        int maxSum = 0;
        for(int i=0;i<nums.length;i++){
            CS += nums[i];
            maxSum = Math.max(CS, maxSum);

            if(CS < 0){
                CS =0;
            }
        }

        return maxSum;
    }
}