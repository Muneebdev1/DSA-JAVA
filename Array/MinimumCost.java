

public class MinimumCost {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};

        Solutionlpa sol = new Solutionlpa();
        System.out.println(sol.minCostToMoveChips(position));

    }
    
}

class Solutionlpa {
    public int minCostToMoveChips(int[] position) {
        int evencount =0;
        int oddcount =0;

        for(int pos:position){
            if(pos%2 == 0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        return Math.min(oddcount, evencount);
        
        
    }
}
