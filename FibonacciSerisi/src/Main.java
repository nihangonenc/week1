import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fibonacci serisi: 0 1 1 2 3 5 8 13 21 34

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi kaç elemanlı olsun?: ");
        int number = input.nextInt(); //kullanıcıdan veri aldık
        int n1 = 0; //ilk değer
        int n2 = 1; //ikinci değer
        int nTotal;

        for( int i=1; i<=number; i++){ //kullanıcıdan aldığımız sayı kadar döngü oluşturur.
            System.out.print (n1+ ",");
            nTotal = n1 + n2; //yeni sayı için yapılacak işlem
            n1 = n2; // bir önceki sayıları güncelle
            n2 = nTotal;
        }
    }
}