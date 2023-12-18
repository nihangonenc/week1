import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı giriniz: ");
        int n = input.nextInt();

        // Elmasın üst kısmı için;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for( int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // ELmasın alt kısmı için;
        for(int i= n-1 ; i>=0;  i--) { // i=n dersek ortası kalın olur, istemiyoruz.
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }


    }
}