import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Girilen sayının basamak sayılarının toplamını hesaplıyoruz.
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int number = input.nextInt();

        int total = 0;
        int lastNumber; //son basamaktaki sayı

        while ( number > 0){ // sayı sıfır oluncaya kadar
            lastNumber = number % 10; // son basamağı bulmak için sayıyı 10'a böl
            total += lastNumber; // son basamakları topla.
            number /= 10; //diğer basamak kontrolü için şart
        }

        System.out.println("Sayının basamakları toplamı: " + total );

    }
}