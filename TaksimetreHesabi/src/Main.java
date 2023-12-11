import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, price;

        Scanner input = new Scanner(System.in);
        System.out.print( "Mesafeyi KM cinsinden giriniz: ");
        km = input.nextDouble();

        price = 10 + (km * 2.2) ;
        price = (price < 20) ? 20 : price ;

        System.out.print("Ödenecek Tutar: " + price + " TL");
    }
}