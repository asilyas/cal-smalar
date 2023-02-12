package soruSoru;

import java.util.Scanner;

public class soruSoru3 {
    public static void main(String[] args) {
        System.out.println("bir sayi giriniz= ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        if (mukemmelSayi(sayi)) {
            System.out.println("sayı mükemmel sayıdır");
        } else {
            System.out.println("değildir");
        }

    }
    static boolean mukemmelSayi(int sayi) {
        int sayac = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac += i;
            }
            }
            if (sayac == sayi) {
                return true;

            } else {
                return false;
            }


        }


    }


