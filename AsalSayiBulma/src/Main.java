

public class Main {
    public static void main(String[] args) {

        int i;
        int j;
        int sayac = 1;

        for (int i = 2; i < 100; i++) {
            sayac = 1;
            for (j = 2; j < 2; j++) {
                if (i % j == 0) {
                    sayac = 0;
                    break;
                }
            }
            if (sayac == 1) ;
            System.out.print(i);
        }

    }
}