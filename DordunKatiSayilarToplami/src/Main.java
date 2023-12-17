import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tek sayı girilene kadar girilen sayılardan çift ve dördün katı olanları topluyoruz.

        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
           System.out.print("Sayı Giriniz: ");
           n = input.nextInt();
           if( (n % 2 == 0() && (n % 4 == 0)){
               total+= n;
           }
        } while(n % 2 == 0); // tek sayı girilene kadar devam et

       System.out.print("Çift ve 4'ün katı olan sayıların toplamı: " + total );
    }
}