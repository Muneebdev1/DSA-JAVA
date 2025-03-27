import java.util.ArrayList;

import java.util.List;

public class KidCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        ArrayList<Boolean> arraylest = new ArrayList<>();

        Solution12 sol = new Solution12();
        arraylest = (ArrayList<Boolean>) sol.kidsWithCandies(candies, extraCandies);
        System.out.println(arraylest);

        


        
    }
    
}

class Solution12 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         ArrayList<Boolean> arraylest = new ArrayList<>();
         int max=0;
         for(int i=0;i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
         }
         System.out.println(max);
         for(int i=0; i<candies.length;i++){    
            if ((candies[i]+extraCandies) >= max){
                arraylest.add(true);
            }else{
                arraylest.add(false);
            }                     //[2,3,5,1,3]
             
         }

         return arraylest;
        
    }
}
