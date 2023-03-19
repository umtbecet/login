import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password,yeniSifre;
        String sifreSifirla;
        String dataBaseUserName="patika";
        String dataBasePassword="java123";
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals(dataBaseUserName) && password.equals(dataBasePassword)) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgileriniz Yanlış");
            System.out.print("Şifrenizi Sıfırlamak İster misiniz? Şifre Sıfırlamak için evet yazınız.");

            sifreSifirla = input.nextLine();
            if (sifreSifirla.equals("evet")){
                System.out.println("Yeni şifre giriniz");
                yeniSifre= input.nextLine();
                if (yeniSifre.equals(dataBasePassword) || yeniSifre.equals(password)){
                    System.out.println("Şifreniz Oluşturulamadı");
                }else {
                    System.out.println("Şifreniz Oluşturuldu");
                }

            }else{
                System.out.println("Çıkış Yapıldı");
            }
        }
    }
}













