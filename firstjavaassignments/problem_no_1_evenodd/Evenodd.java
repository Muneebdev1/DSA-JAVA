import java.util.Scanner; //importing scanner class to take input


public class Evenodd { // making sure that class is public because this is our main class and also file name is also same. Class name should start with Capital letter.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //creating scanner object to take input.
        System.out.println("Please enter the number that you want to know \"IMPORTANT PLEASE DO NOT PRESS 0 UNLESS YOU MEAN TO EXIT \""); // warning the client to press 0 only if you want to exit.
        while(true){ //infinite loop unless client press 0
          int num = input.nextInt(); // takig input from client using input object.
          if(num == 0){ // if condition to check the edge case of 0 which we are using to close the operation
              break;
          }else if (num % 2 == 0){ // checks whether the number is even.
              System.out.println("The number that you have entered is an Even number: " + num);
          }else{ // else number is odd.
              System.out.println("The number that you have entered is an Odd numebr: " + num);
        }


    }
}
}
