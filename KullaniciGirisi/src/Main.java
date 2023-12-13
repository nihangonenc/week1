import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişken tanımladık
        String userName, password, answer, newPassword;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();


        if (userName.equals("patika") && password.equals("java123")) { // Bilgiler doğruysa giriş yapılır.
            System.out.print("Başarılı Giriş");
        } else  {
            System.out.println("Yanlış şifre. Şifrenizi sıfırlamak ister misiniz? evet/hayır");
            answer = input.nextLine();
            switch (answer) {
                case "evet" : //Şifre oluşturmaya başlanır.
                    System.out.print("Yeni şifre giriniz: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals("java123")) {
                        System.out.println("Şifre bir önceki şifrenizle aynı. Farklı şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;

                case "hayır" :
                    System.out.println("Giriş sonlandırıldı.");
                    break;
                }
            }
        }
    }
