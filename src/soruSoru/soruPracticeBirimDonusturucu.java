package soruSoru;

import java.util.Scanner;

public class soruPracticeBirimDonusturucu {
    public static void main(String[] args) {

        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("dönüştürmek istediğiniz birimi giriniz:\n=>saat\n=>mil\n=>kilogram");
        String birim = scan.nextLine().toLowerCase();

        System.out.println("dönüştürmek istediğiniz brim miktarı girin: ");
        double miktar = scan.nextDouble();

        donusturucu(birim, miktar);
        donusturucu("saat", 65);
        donusturucu("mil", 89);
        donusturucu("kilogram", 32);
    }

    private static void donusturucu(String brm, double mktr) {

        switch (brm) {

            case "saat":
                System.out.println(mktr+" saat "+ mktr * 60 * 60 + " saniyedir.");
                break;
            case "mil":
                System.out.println(mktr+ " mil " + mktr * 1.6 + " kilometredir.");
                break;
            case "kilogram":
                System.out.println(mktr + "kilogram " + mktr * 1000 + " gramdır.");
            default:
                System.out.println("saat-mil-kiogram dışında bir değer girdiniz!!!");

        }
    }
}