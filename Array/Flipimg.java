import java.util.Arrays;

public class Flipimg {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        Solutiona1 sol = new Solutiona1();
        int[][] ans = sol.flipAndInvertImage(image);
        for (int[] an : ans){
            System.out.println(Arrays.toString(an));
        }
        
    }
    
}

class Solutiona1 {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] Output = new int[image.length][image.length];
        System.out.println(image.length);
        int i=0;
        for(int[] row : image){
             int end = row.length - 1;
            for(int j=0;j<row.length;j++){
                
                if(row[end] == 0){
                    Output[i][j] = 1;
                }else{
                    Output[i][j] = 0;
                }
                
                end--;
            }
            i++;
        }
        return Output;
        
    }
}
