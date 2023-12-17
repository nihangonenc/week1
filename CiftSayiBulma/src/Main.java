import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        int total = 0;
        int period = 0;

        for (int i = 0; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                total += i; // bölünen sayıları topla
                period++; // bölünebilen sayı adedini bulmak için
            }
        }
        int avarage = ( total / period );
        System.out.println ( "0'dan " + k + " 'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + avarage );
    }
}