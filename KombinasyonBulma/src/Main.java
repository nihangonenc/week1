import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //n elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısını buluyoruz."C(n,r)"

      int n,r;
      int totaln = 1, totalr = 1, total = 1;
      Scanner input = new Scanner(System.in);
      System.out.print("Küme kaç elemanlı?: ");
      n = input.nextInt();

      System.out.print("Grup kaç elemanlı?: ");
      r= input.nextInt();

      for (int i =1; i<=n; i++) { //n!
          totaln *= i;
      }
      for (int i=1; i<=r; i++){ //r!
          totalr *= i;
      }
      for (int i=1; i<=(n-r); i++){ // (n-r)!
          total *= i;
      }

      int kombinasyon = totaln / (totalr * total);   //C(n,r) = n! / (r! * (n-r)!)
      System.out.println(n+ " sayısının " + r + " ile kombinasyonu: " + kombinasyon);

    }
}