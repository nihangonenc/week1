import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //değişkenler tanımlandı
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        double avarage = (mat + fizik + kimya + turkce + muzik) / 5;

        // Herhangi bir ders notunun alabileceği değer aralığı belirlendi
        if ((fizik >= 0 && fizik <= 100) && (mat >= 0 && mat <= 100) && (kimya >= 0 && kimya <= 100) &&
                (turkce >= 0 && turkce <= 100) && (muzik >= 0 && muzik <= 100)) {
            // 0-100 aralığında not girildiğinde ortalama hesaplanmaya başlar.
            System.out.println("Ortalamanız: " + avarage );
            if(avarage< 55){
            System.out.println("Sınıfta kaldınız. Daha çok çalışmanız gerek.");
            }
            else {
            System.out.println("Sınıfı geçtiniz. Tebrikler!");
            }
        }
        else { // 0-100 arasında olmayan not girildiğinde çalışır.
            System.out.print("Geçersiz not girdiniz. Ortalamanız hesaplanamıyor.");
        }
    }
}