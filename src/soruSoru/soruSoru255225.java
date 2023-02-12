package soruSoru;

import java.util.Scanner;

public class soruSoru255225 {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin

        int girilenSayi = -9;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);

        while (girilenSayi != 0) {
            System.out.print("Toplamak için Sayı giriniz: ");
            girilenSayi=scan.nextInt();
            toplam += girilenSayi;
        }
            System.out.println("sayıların toplamı "+toplam);
            if (girilenSayi==0) System.out.println("çıkış yapılıyor");

    }
}