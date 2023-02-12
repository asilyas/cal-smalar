package soruSoru;

import java.util.Scanner;

public class soruSoru14 {

    public static void main(String[] args) {
        // Kullanicidan 2 sayi ve istedigi islemi alin (+ / * -)
        // bir method olusturup sayilara istenen islemi uygulayip
        // sonucu bize dondurun.
        // kullanici islemi yanlis secmisse 0 dondurun

        Scanner scan=new Scanner(System.in);
        System.out.println("1.sayiyi girin: ");
        double sayi1=scan.nextInt();
        System.out.println("2.sayiyi girin: ");
        double sayi2=scan.nextInt();
        System.out.println("istediğinizi işlemi giriniz: +,-,*,/");
        char islem=scan.next().charAt(0);

        System.out.println(hesapla(sayi1,sayi2,islem));


    }

    public static double hesapla(double sayi1,double sayi2,char islem) {

        switch (islem){
            case '+':
                return sayi1+sayi2;
            case '-':
                return sayi1-sayi2;
            case '*':
                return sayi1*sayi2;
            case '/':
                return sayi1/sayi2;
            default:
                return 0;


        }

    }


}
