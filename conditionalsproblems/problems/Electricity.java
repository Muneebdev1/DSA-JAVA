import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("You may please enter the number of units whose bill you want to calculate: ");
        int unit = in.nextInt();
        double price = 0;
        
            if(unit <= 100){
                price = unit * 2.5;
               
            }else if(unit > 100 && unit < 200){
                int temp =0;
                temp = unit - 100;
                price = (100*2.5) + (temp *3.5);
               
            }else if(unit >= 200){
                price = unit * 5;
                
            }
            

        
        System.out.println(price);

    }
    
}
