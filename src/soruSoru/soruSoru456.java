package soruSoru;

import java.util.Scanner;

public class soruSoru456 {


    public static void main(String[] args) {

        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        // sifre kontrolunu bir method'da yapip true / false dondurun
        // main method'da donen sonucu kontrol edip
        // "basari ile olusturuldu" yazincaya kadar
        // sifreyi tekrar tekrar isteyin

        Scanner scan =new Scanner(System.in);

        String sifre="";
        boolean kontrol=true;


        while (kontrol) {
            System.out.println("Lütfen şifre giriniz: ");
            sifre=scan.nextLine();
            if(sifreOlustur(sifre)){
                System.out.println("başarı ile oluşturuldu");
                kontrol =false;
            }
        }
    }

    public static boolean sifreOlustur(String sifre) {
        int flag = 0;

        if (!(sifre.length() >= 10)) {
            System.out.println("şifre uzunluğu 10 karakter olmalı!!");
            flag++;
        }
        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("şiferini ilk harfi küçük olmalı");
            flag++;
        }
        if (((sifre.charAt(sifre.length() - 1)) < 10 && (sifre.charAt(sifre.length() - 1)) >= 0)) {
            System.out.println("son karakter rakam olmalı!");
            flag++;
        }
        if (sifre.contains(" ")) {
            System.out.println("sifre boşluk içermemeli!");
            flag++;
        }
        if (flag == 0) {
            System.out.println("şifre başarılı bir şekilde oluşturuldu");
            return true;

        } else return false;

    }

}
