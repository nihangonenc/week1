import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r, pi = 3.14 ,alan, aci;

        Scanner input = new Scanner (System.in) ;
        System.out.print("Yarı çap ölçüsünü CM cinsinden giriniz: ") ;
        r = input.nextDouble();

        System.out.print("Daire diliminin açısının ölçüsünü giriniz: ");
        aci = input.nextDouble ();

        alan= (pi* (r*r) * aci) / 360;

        System.out.println( "Dairenin alanı: " + alan );
    }
}