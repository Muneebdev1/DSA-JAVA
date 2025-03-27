public class HighestAlti {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        Solutionas sol = new Solutionas();
        int ans = sol.largestAltitude(gain);
        System.out.println(ans);
        
    }
    
}

class Solutionas {
    public int largestAltitude(int[] gain) {
        int Alti = 0;
        int[] Altiarr = new int[gain.length+1];
        Altiarr[0] = 0;
        Altiarr[1] = gain[0];
        for(int i=1;i<gain.length;i++){
            Altiarr[i+1] = Altiarr[i] + gain[i];
        }

        int max=0;
        for(int i=0; i<Altiarr.length;i++){
            if(Altiarr[i] > max){
                max = Altiarr[i];
            }
        }

        return max;
    }
}
