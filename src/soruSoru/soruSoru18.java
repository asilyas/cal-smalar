package soruSoru;

import java.util.Scanner;

public class soruSoru18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("2 basamaklı bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int sayiBir = sayi % 10;
        int sayiOn = sayi / 10;

        switch (sayiOn) {
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("kırk");
                break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("altmış");
                break;
            case 7:
                System.out.println("yetmiş");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;
        }
        switch (sayiBir) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }
    }

}