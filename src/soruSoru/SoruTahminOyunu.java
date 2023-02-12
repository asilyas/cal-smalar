package soruSoru;

import java.util.Random;
import java.util.Scanner;

public class SoruTahminOyunu {
    public static void main(String[] args) {

        Random rnd=new Random();
        int bulunacakSayi=rnd.nextInt(100);

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı tahmin ediniz:  ");
        int tahmin=0;
        int kez=0;
        while (!(tahmin==bulunacakSayi)){
               tahmin=scan.nextInt();
                kez++;
            System.out.println(kez+" .tahmin");
               if (tahmin==bulunacakSayi){
                   System.out.println("DOĞRU TAHMİN !!!");
                   break;
               }if (tahmin<bulunacakSayi){
                   System.out.println("Artırın :(");
               }if (tahmin>bulunacakSayi) {
                   System.out.println("Azaltın:(");
               }

        } if (kez<=3)System.out.println("waouvvv");
        if(((kez>=4) && (kez<=8)))System.out.println("Aferinn");
        if (kez>8) System.out.println("Başarısız :((");


    }
}
