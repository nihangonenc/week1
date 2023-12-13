import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri belirledik.
        int n1,n2, select;
        Scanner input = new Scanner (System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt ();
        System.out.print( "İkinci sayıyı giriniz: ");
        n2 = input.nextInt ();
        //İşlemleri belirledik.
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminizi giriniz: ");
        select = input.nextInt();
        //Seçime göre işlem atadık.Bölme işlemindeki tanımsız durumu belirttik.
        switch (select) {
            case 1 :
                System.out.print("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma: " + (n1 - n2));
                break;
            case 3 :
                System.out.print("Çarpma: " + (n1 * n2));
                break;
            case 4 :
                if (n2 != 0) {
                    System.out.print("Bölme: " + (n1 / n2));
                } else {
                    System.out.print( "Bir sayı 0'a bölünemez.");
                }
                break;
            default :
                System.out.print( "Yanlış seçim yaptınız. Tekrar deneyiniz." );
        }
    }
}