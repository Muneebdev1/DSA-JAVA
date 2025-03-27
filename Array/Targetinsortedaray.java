import java.util.ArrayList;
import java.util.Arrays;

public class Targetinsortedaray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        Solutionna sol = new Solutionna();
        System.out.println(Arrays.toString(sol.searchRange(nums, target)));

        
    }
    
}

class Solutionna {
    public int[] searchRange(int[] nums, int target) {
       // int[] Output = new int[2];
        ArrayList<Integer> arr = new ArrayList<>();

        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                arr.add(i);
            }

            

        }
        if(arr.size() > 0){
            start = arr.get(0);
            end = arr.get(arr.size()-1);
        }else{
            return new int[] {-1, -1};
        }
        

        int[] Output = {start,end};

        return Output;
        
    }
}