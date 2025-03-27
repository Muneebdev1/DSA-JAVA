import java.util.Scanner;

public class Perm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number of discrete objects: ");
        double n = in.nextDouble();

        System.out.println("Please enter number of discrete objects: ");
        double r = in.nextDouble();

        double minus = n-r;


        double nfact = 1;
        for(double i=n;i>0; i-- ){
            nfact *= i;
        }

        double nminusrfact = 1;
        for(double i=minus;i>0; i-- ){
            nminusrfact *= i;
        }
        System.out.println(nfact);
        System.out.println(nminusrfact);
        System.out.println("Your premutation is: " + (nfact/nminusrfact));
    }
    
}
