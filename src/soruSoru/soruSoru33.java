package soruSoru;

import java.util.Scanner;

public class soruSoru33 {
    public static void main(String[] args) {

        // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan =new Scanner(System.in);

        System.out.print("başlangıç: ");
        int baslangic=scan.nextInt();

        System.out.print("bitiş: ");
        int bitis =scan.nextInt();
        int count=0;
        int toplam=0;

        for (int i = baslangic; i <=bitis ; i+=7) {
            toplam+=i;
            count++;
            System.out.println("aradaki sayıların 7 şer 7 şer artmış hali: "+i);
        }

            System.out.println("sayıların toplamı: "+toplam);
            System.out.println(count+" tane sayı vardır!");
    }
}
