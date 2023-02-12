package soruSoru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soruSoru25468 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Tamsayi Giriniz: ");
        int sayi=scan.nextInt();
        // Soru 6- Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.
        System.out.println(bolenMetod(sayi));

    }

    public static List<Integer> bolenMetod(int sayi) {

        List<Integer> bolenList=new ArrayList<>();
        for (int i = 1; i <=sayi ; i++) {
            if(sayi%i==0){
                bolenList.add(i);
            }
        }
       return bolenList;
    }
}
