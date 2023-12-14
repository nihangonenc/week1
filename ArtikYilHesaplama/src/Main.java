import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int year ; //değişken tanımladık
        System.out.print("Yıl giriniz: "); //veri aldık
        year = input.nextInt();

        if (year % 4 == 0 ) {
            if (year % 100 == 0) {
                if (year % 400 == 0) { // hem 100e hem 400e bölünürse artık yıl
                    System.out.println(year + " bir artık yıldır! ");
                } else {
                    System.out.println(year + " bir artık yıl değildir! ");
                }
            } else {
                System.out.println(year + " bir artık yıldır! ");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir! ");
        }
    }
}