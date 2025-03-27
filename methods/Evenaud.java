import java.util.Scanner;

public class Evenaud {
    public static void main(String[] args) {
        
        fun();

        
    }
    static void fun(){
        
        while(true){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if(n == 0){
                break;
            }else if(n%2 == 0){
               
                System.out.println("Number is Even");

            }else{
                System.out.println("Number is Odd");
            }

        }
        
    }
    
}
