import java.util.Scanner;


public class Casecheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       
        System.out.println("Please enter a valid character");
        char ch = in.next().trim().charAt(0);


        if (Character.isUpperCase(ch)){
            System.out.println("Provided character is uppercase");
        }else if(Character.isLowerCase(ch)){
            System.out.println("Provided character is not upper case");
        }else{
            System.out.println("You have placed invalid character.");
        }

    }
}
