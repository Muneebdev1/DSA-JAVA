import java.util.Scanner;

public class Primitives {
    public static void main(String[] args){
       int rollno = 64; 
       String name = "Muneeb";
//       System.out.println(name);
       char letter = 'm';
       float marks = 98.3f;
       double largeDecimalNumbers = 234234.234234;
       long largeintegers = 23434234234234L;
       boolean check = true;
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter new number: ");
       int rolno = input.nextInt();
       System.out.println("Your roll number is: " + rolno);
    }
}
