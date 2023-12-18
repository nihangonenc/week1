import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan alınan basamak sayısı büyüklüğünde yıldızlarla ters üçgen oluşturur.

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        for (int i = n; i>=0; i--) {        //Basamak sayısı kadar dönmeli
            for (int j = 1; j <= (n - i); j++) {       //Boşluk için döngü
                System.out.print(" ");
            }
            for (int k=1; k<= (2*i-1); k++){        //Yıldız için döngü
                System.out.print("*");
            }
            System.out.println(" ");       //Boşluk yıldız bloklarını alt alta yazdırır.

        }

    }
}