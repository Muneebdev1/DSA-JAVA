import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int sum=0;
        while(true){
            int number = in.nextInt();
            if(number == 0){
                break;

            }else{
                sum += number;
            }
            
            
        }
        System.out.println(sum);
    }
    
}
