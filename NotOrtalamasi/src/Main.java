import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt() ;

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt ();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt ();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt ();

        int toplam = ( mat + fizik + kimya + muzik + turkce + tarih );
        double sonuc = toplam / 6.0 ;
        System.out.println( "Ortalamanız: " + sonuc);
        String str = sonuc >= 60.0  ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println (str);
    }
}