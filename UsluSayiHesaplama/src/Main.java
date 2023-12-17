import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Üslü Sayı Hesaplama
        int n,k;
     Scanner input = new Scanner(System.in);

     System.out.print("Üssü alınacak sayıyı giriniz: ");
     n = input.nextInt();

     System.out.print("Üs giriniz: ");
     k = input.nextInt();

     int total = 1;

     for (int i =1; i<=k; i++){
      total *= n;
     }
     System.out.print(n + " üssü " + k + ": " + total );

    }
}