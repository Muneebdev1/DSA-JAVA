import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String naam = in.next();
        String name = greating(naam);
        System.out.println(name);



    }

    static String greating(String naae){
        String message = "Hello "+ naae; 
        return message;

    }
    
}
