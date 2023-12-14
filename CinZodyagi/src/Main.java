import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year; //Değişken Tanımladık
        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextInt();
        System.out.print("Çin zodyağı burcunuz: "); //Ortak çıktı

        if (year % 12 == 0) {
            System.out.print("Maymun");
        } else if (year % 12 == 1) {
            System.out.print("Horoz");
        } else if (year % 12 == 2) {
            System.out.print("Köpek");
        } else if (year % 12 == 3) {
            System.out.print("Domuz");
        } else if (year % 12 == 4) {
            System.out.print("Fare");
        } else if (year % 12 == 5) {
            System.out.print("Öküz");
        } else if (year % 12 == 6) {
            System.out.print("Kaplan");
        } else if (year % 12 == 7) {
            System.out.print("Tavşan");
        } else if (year % 12 == 8) {
            System.out.print("Ejderha");
        } else if (year % 12 == 9) {
            System.out.print("Yılan");
        } else if (year % 12 == 10) {
            System.out.print("At");
        } else if (year % 12 == 11) {
            System.out.print("Koyun");
        }
    }
}