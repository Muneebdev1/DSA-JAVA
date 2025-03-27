import java.util.Scanner;

public class Largest1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        
        while (true){
            int number = in.nextInt();
            
            if (number == 0){
                break;
                
            }else{
                max = number;
            }
            
        }
        System.out.println(max);
    }
    
}
