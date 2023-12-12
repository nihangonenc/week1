import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c, sonuc ;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");
        a = input.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        b = input.nextInt();

        System.out.print("3. Sayıyı Giriniz: ");
        c = input.nextInt();

        sonuc = (a + b) * c - b ;
        System.out.print( "(" + a + "+" + b + ")" + "*" + c + "-" + b + "=" + sonuc );
    }
}