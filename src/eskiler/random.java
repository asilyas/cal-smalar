package eskiler;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rdn = new Random();
        int tutulanSayi = rdn.nextInt(100);
        System.out.println("bilmeniz gereken sayı: " + tutulanSayi);


        int tahmin = 0;
        int sayac = 0;

        while (tahmin != tutulanSayi) {
            System.out.print("bir tahminde bulunun: ");
            tahmin = input.nextInt();


            if (tahmin < tutulanSayi) {
                System.out.println("artırın");
                ++sayac;

            }
            if (tahmin > tutulanSayi) {
                System.out.println("azaltın");
                ++sayac;

            }
            if (tutulanSayi == tahmin) {
                System.out.println(sayac + "  tahminde bildiniz...");

                if (sayac <= 3) {
                    System.out.println("waovv");

                }
                if (sayac >= 4 && sayac <= 8) {
                    System.out.println("Aferin");
                }
                if (sayac > 8) {
                    System.out.println("başarısız...!");
                }

            }
        }
    }
}