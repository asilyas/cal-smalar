package soruSoru;

import java.util.Scanner;

public class soruSoru3214 {
    public static void main(String[] args) {

        // Kullanicidan toplamak uzere sayi alin
        // girilen sayilarin toplami 500 olur veya gecerse
        // " Bu kadar sayi yeter" deyip toplami yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("toplanmak üzere sayı girin:  ");
        int sayi=0;
        int top=0;

        while (top<500){
            int girilen=scan.nextInt();
                top+=girilen;
                sayi++;
            if(top>=500) System.out.println("bu kadar sayı yeter!");

            System.out.println("toplam "+top+" girilen "+sayi+" .sayı");
        }


    }
}
