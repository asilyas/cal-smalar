package soruSoru;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class soruSoru8 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Array uzunluğu giriniz:  ");
        int uzunluk=scan.nextInt();
        arrayOlustur(uzunluk);
    }
    private static void arrayOlustur(int uzunluk) {
        int arr[]=new int[uzunluk];
        Random rnd=new Random();
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= rnd.nextInt(100);
            toplam+=arr[i];
        }
        double ortalama=toplam/ arr.length;
        int alt=0,ust=0,esit=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ortalama){
                alt++;
            } else if(arr[i]>ortalama){
                ust++;
            }else {
                esit++;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("ortalama: "+ortalama+"\n"
                +alt+" adet sayı ort küçük\n"
                 +ust+" adet sayı ort büyük\n"
                  +esit+" adet sayı ortlamaya eşit");
    }
}
