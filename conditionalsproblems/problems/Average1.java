import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        int average = 0;
        Scanner in = new Scanner(System.in);
        int sum = 0, length = 0;
        
        
        
        while (true){
            int input = in.nextInt();
            if(input > 0){
            
             sum += input;
             length++;
             
             }else{
              break;
           }

        }
        if (length == 0){
            System.out.println("no way");
            return;
        }else{
            average = sum/length;
        }
         System.out.println(average);
    }
    
}
