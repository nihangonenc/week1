import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ebob ve ekok bulma

        Scanner input = new Scanner(System.in);
        int n1, n2;
        int ebob = 1;
        int i = 1;

        System.out.print("1. Sayıyı Giriniz: ");
        n1 = input.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        n2 = input.nextInt();

        if (n1<=n2){ //girilen ilk sayı küçükse veya sayılar eşitse bu döngü çalışır.
            while (i <= n1){
                if ( (n1 % i == 0) && (n2 % i == 0)){
                    ebob = i;
                }
                i++;
            }
            System.out.println(n1 + " ile " + n2 + " sayılarının EBOB'u: " + ebob);
            //ebob'u bilenen sayıların ekok'unu bulma formülü:
            System.out.println(n1 + " ile " + n2 + " sayılarının EKOK'u: " + (n1 * n2) / ebob);


        }  else { //girilen  ikinci sayı büyükse bu döngü çalışır.
            while (i <= n2) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                }
                i++;
            }
            System.out.println(n1 + " ile " + n2 + " sayılarının EBOB'u: " + ebob);
            System.out.println(n1 + " ile " + n2 + " sayılarının EKOK'u: " + (n1 * n2) / ebob);
        }

        /* formülsüz ekok bulma:
        for(int i=1; i<=(n1*n2);i++) {
        if (i % n1 == 0 && i% n2==0) {
        system.out.print(i); */
    }
}