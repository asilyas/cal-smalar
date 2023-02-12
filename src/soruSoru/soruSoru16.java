package soruSoru;

import java.util.InputMismatchException;
import java.util.Scanner;

public class soruSoru16 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı girin: ");
        int girilenSayi=scan.nextInt();

        try {
            while (girilenSayi<=1 || girilenSayi>=10){
                System.out.println("Carpım tablosu olusturmak için bir rakam giriniz");
                girilenSayi=scan.nextInt();

                if (girilenSayi>1 && girilenSayi<10){
                    break;
                }
                System.out.println("Carpım tablosu için 1 den buyuk pozitif bir rakam girmelisiniz");
            }
        } catch (InputMismatchException e) {
            System.out.println("pozitif rakam giriniz");
        }

    }

}
