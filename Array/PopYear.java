public class PopYear {
    public static void main(String[] args) {
        int[][] logs = {
            {1993,1999},
            {2000,2010}
        };
        Solutiona12 sol = new Solutiona12();
        System.out.println(sol.maximumPopulation(logs)); // Should print 1993
    }
}

class Solutiona12 {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];  // Array to store population changes
        
        // Process each birth and death
        for(int[] log : logs) {
            year[log[0]] += 1;    // Increment at birth year
            year[log[1]] -= 1;    // Decrement at death year
        }
        
        int maxNum = year[0];     // Maximum population
        int maxYear = 0;          // Year of maximum population
        
        // Calculate running population and find maximum
        for(int i = 1; i < year.length; i++) {
            year[i] += year[i-1];  // Running sum of population
            
            if(year[i] > maxNum) {
                maxNum = year[i];
                maxYear = i;
            }
        }
        
        
        return maxYear;
    }
}
