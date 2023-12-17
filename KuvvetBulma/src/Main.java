import java.util.Scanner;
  //  Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdırıyoruz

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
         n = input.nextInt();

         System.out.println("4'ün kuvvetleri: ");
        for ( int i = 1; i <= n; i*=4){
            System.out.println(i);
        }
         System.out.println("5'in kuvvetleri: ");
        for (int i =1; i<= n; i*=5) {
            System.out.println(i);
        }


    }
}