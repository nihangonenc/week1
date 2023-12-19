

public class Main {
    public static void main(String[] args) {

         //1'den 100'e kadar asal sayıları bulma

        for (int i = 2; i <= 100; i++) { //en küçük asal sayı olan 2'den 100'e kadar olan sayıları tarar.
            boolean asal = true;

            for (int j = 2; j < i; j++) { //2'den kendisine kadar olan sayılarla bölünüp bölünmediğini kontrol eder.
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}