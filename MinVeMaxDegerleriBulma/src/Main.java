import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Girilen sayılar arasındaki en büyük ve en küçük değeri bulur.
        int n;
        int number;
        int max = 0;
        int min = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz?: ");
        n = input.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            number = input.nextInt();

            if ( number < min || min == 0 ){
                min = number ;

            }
            else if ( number > max ) {
                max = number;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}