public class Jumpgame {
    public static void main(String[] args) {
       int[] nums = {2,3,1,1,4};
        Solutionma sol = new Solutionma();
        System.out.println(sol.canJump(nums));
        
    }
    
}

class Solutionma {
    public boolean canJump(int[] nums) {
        int reachable =0;
        for(int i=0;i<nums.length;i++){
            if(i>reachable) return false;
            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;

        
    }
}
