

public class Pangram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        Solutiona sol = new Solutiona();
        boolean ans = sol.checkIfPangram(sentence);
        System.out.println(ans);
        
    }
    
}

class Solutiona {
    public boolean checkIfPangram(String sentence) {
        
        String alphabet = "abcdefghijklmopqrstuvwxyz";
        boolean[] ans = new boolean[alphabet.length()];
        for(int i=0;i<alphabet.length(); i++){
            boolean res=false;
            for(int j=0; j<sentence.length();j++){
                if(alphabet.charAt(i) == sentence.charAt(j)){
                    res = true;
                }
                
            }
            ans[i] = res;
            
        }
        boolean finale = true;
        for(int i=0; i<ans.length;i++){
            if(ans[i] != true){
                finale = false;
            }
        }


        return finale;
        
    }
}
