public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        Solutionm sol = new Solutionm();
        int ans =sol.findNumbers(nums);
        System.out.println(ans);
        
    }
    
}

class Solutionm {
    public int findNumbers(int[] nums) {
        int NumberOfDig = 0;
        for(int i=0;i<nums.length;i++){
            int number = Integer.toString(nums[i]).length();
            if(number % 2 == 0){
                NumberOfDig++;
            }
        }
        return NumberOfDig;
        
    }
}
