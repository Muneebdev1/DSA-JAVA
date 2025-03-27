package firstjavaassignments.problem_no_6_CurrencyConverter;

import java.util.Scanner;

public class Currencyconverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount in USD: ");
        int USD = input.nextInt();

        System.out.println("Your Amount in Rupees is: " + (USD * 280));


    }
}