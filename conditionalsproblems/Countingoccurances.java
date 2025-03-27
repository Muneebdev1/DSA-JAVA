import java.util.Scanner;

public class Countingoccurances {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String number = in.next();
        char[] CharacterArray = number.toCharArray();

        int[] ArrayInteger = new int[CharacterArray.length];
        
        for(int i = 0; i<CharacterArray.length; i++){
            ArrayInteger[i] = (CharacterArray[i]-'0');

        }
        int targer = in.nextInt();

        int count=0;
        for(int digit : ArrayInteger){
            if(digit == targer){
                count++;
            }
        }
        System.out.println("The number of occurances of targer number in given large number is: " + count);
       

        

    }
}
