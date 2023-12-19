import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   // Kullanıcıdan veri alıyoruz.

        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = input.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = input.nextDouble();


        double ondalikliSayi2 = tamSayi;         // Tam sayıyı ondalıklı sayı yaptık
        int tamSayi2 = (int)ondalikliSayi;      // Ondalıklı sayıyı tam sayı yaptık


        System.out.println("Tam sayının ondalık sayıya dönşümü: " + ondalikliSayi2);
        System.out.println("Ondalıklı sayının tam sayıya dönüşümü: " + tamSayi2);

    }
}