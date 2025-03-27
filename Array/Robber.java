public class Robber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        Solutionpo sol = new Solutionpo();
        System.out.println(sol.rob(nums));
        
    }
    
}

class Solutionpo {
    public int rob(int[] nums) {
        int MaxAmountEven =0;
        int MaxAmountOdd =0;
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                MaxAmountEven +=nums[i];
        }

        if(i%2 != 0){
            MaxAmountOdd +=nums[i];
    }
        }
        return Math.max(MaxAmountEven, MaxAmountOdd);
        
    }

    
}
