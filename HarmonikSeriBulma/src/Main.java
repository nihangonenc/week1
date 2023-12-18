import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Harmonik Seri Buluyoruz. (1+ 1/1 + 1/2 +... 1/n)
        Scanner input = new Scanner(System.in);

        System.out.print( "Sayıyı Giriniz: ");
        int number = input.nextInt();
        double result = 0;

        for (int i=1; i <= number; i++){ //terim sayısı
            result += (1.0/i); //yapılacak işlem
        }
        System.out.println(result);

    }
}