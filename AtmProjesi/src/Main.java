import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 1500;
        int price;

        while(right>0){
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();
            if(userName.equals("patika") && password.equals("dev123")){
               System.out.println("Merhaba, Kodluyoruz Bankasına Hoş Geldiniz!");
               do {
                   System.out.println("1-Para yatırma\n" +
                           "2-Para Çekme\n" +
                           "3-Bakiye Sorgula\n" +
                           "4-Çıkış Yap");
                   System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                   select = input.nextInt();
                   switch (select) {
                       case 1:
                           System.out.print("Yatıracağınız para miktarını giriniz: ");
                           price = input.nextInt();
                           balance += price;
                           System.out.println("Bakiyeniz: " + (balance) + " TL");
                           break;

                       case 2:
                           System.out.print("Çekmek istediğiniz para miktarını giriniz: ");
                           price = input.nextInt();
                           if (balance < price) {
                               System.out.println("Bakiyeniz yetersiz!");
                           }else{
                           balance -= price;
                           System.out.println("Bakiyeniz: " + (balance) + " TL");
                           }
                           break;
                       case 3:
                           System.out.println("Bakiyeniz: " + balance + " TL");
                           break;
                   }
               }while(select!=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Tekrar deneyiniz.");
                System.out.println("Kalan hakkınız: " + right);
                if(right==0) {
                    System.out.print("Hesabınız bloke oldu. Lütfen banka ile iletişime geçiniz.");
                }
            }
        }
    }
}