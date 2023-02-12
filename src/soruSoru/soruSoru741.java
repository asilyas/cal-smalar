package soruSoru;

import java.util.Arrays;

import java.util.Scanner;

public class soruSoru741 {
   static int count=1;
    public static void main(String[] args) {
        String[] isimlr={"Ali","Veli","Cem"};
        elemanEkle(isimlr);

    }

    public static void elemanEkle(String[] isimlr) {

        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < isimlr.length+count; i++) {

            String []yeniArr =new String [isimlr.length+count];
            System.out.print("Eklenecek elemanı giriniz: ");
            String eklenecek=scan.nextLine();
            yeniArr[i]=isimlr[i];
            yeniArr[yeniArr.length-1]=eklenecek;
            count++;
            System.out.println(count);
            System.out.println(Arrays.toString(yeniArr));
        }



    }
}
