import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        int total = 0;

        for(int i=1; i<n; i++){ //1'den yazdığımız sayıya kadar dönecek.
            if (n % i ==0) {
                total += i;
            }
        }
         if ( total == n) { // pozitif tam bölenlerinin toplamı kendisine eşitse
             System.out.println( n + " sayısı mükemmel bir sayıdır.");
         }else {
             System.out.println( n + " sayısı mükemmel bir sayı değildir.");
         }
    }
}