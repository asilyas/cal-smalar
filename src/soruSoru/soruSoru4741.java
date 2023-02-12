package soruSoru;

import java.util.Arrays;
import java.util.Scanner;

public class soruSoru4741 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        //	Ornek :  input : 16, output: 4

       /* Scanner scan=new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int tamKare=scan.nextInt();
        int sayi=1;
        boolean sonuc=false;
        while (sayi*sayi<=tamKare){

            if(sayi*sayi==tamKare){
                System.out.println(tamKare+" karekökü: "+sayi);
               sonuc =true;
                break;
            }else sayi++;
        }
        System.out.println(sonuc);
     */



        int[] arr2 = {3,4,5,6,7,8};
        System.out.println(arr2[2]); // 5
        System.out.println(Arrays.toString(arr2));

        String[] isimler= {"Huseyin","Yusuf","Mehmet","Akile","Said"};
        System.out.println(Arrays.toString(isimler));
        for (int i = 0; i <isimler.length ; i++) {
            System.out.print(isimler[i]+" ");
        }
        System.out.println("");
        int[] arr3 = {3,4,5,6,7,8};
        for (int i = 0; i < arr3.length; i++) {

            System.out.print(arr3[i] + 3 + " ");
        }
            System.out.println(" ");

            String[] isimler2={"ali","Yusuf","Mehmet","Akile","Said"};

        for (int i = 0; i <isimler2.length ; i++) {

            if(isimler2[i].contains("u")){
                isimler2[i]=null;

            }
            System.out.print(isimler2[i]+" ");
        }
        int[] sayilar= {3,7,1,9,-3,-11,-50};

        System.out.println(verilenArrayiTopla(sayilar));

    }

    private static int verilenArrayiTopla(int[] sayilar) {
             int topArr=0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]>0){
                topArr+=sayilar[i];
            }
        }
        return topArr;
    }

}