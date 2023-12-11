import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvTutar, kdvliTutar, kdvOran;

        Scanner input = new Scanner (System.in) ;
        System.out.print("Ücret tutarını giriniz : ") ;
        tutar = input.nextDouble () ;

        kdvOran = tutar <= 1000 && tutar > 0 ? 0.18 : 0.08 ;
        kdvTutar = tutar * kdvOran ;
        kdvliTutar = tutar + kdvTutar ;

        System.out.println ("KDV'siz tutar: " + tutar);
        System.out.println ("KDV Oranı: " + kdvOran);
        System.out.println ("KDV Tutarı: " + kdvTutar );
        System.out.println ("KDV'li Tutar: " + kdvliTutar );
    }
}