package soruSoru;
import java.util.Arrays;
import java.util.Scanner;

public class soruSoru12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç eleman gireceksiniz? ");
        int eleman_sayisi = scanner.nextInt();

        // elemanları saklamak için bir array oluşturun
        int[] elemanlar = new int[eleman_sayisi];


        for (int i = 0; i < eleman_sayisi; i++) {

            System.out.print("Bir eleman girin: ");
            int eleman = scanner.nextInt();

            elemanlar[i] = eleman;
        }



        System.out.println(Arrays.toString(elemanlar));


        int[] arr = {2, 3, 4, 2, 5, 2, 6, 7, 4, 5, 1, 2, 4, 6, 3, 1, 9};

        olupOlmadigi(arr);
       sagaKaydir(arr);
    }

    public static void sagaKaydir(int[] arr) {
        int temp=arr[arr.length-1];
        for (int i = arr.length-1 ; i>= 1;i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));

    }


    public static void olupOlmadigi(int[] arr) {
           int aranan=-86;
           int count=0;
        for (int each : arr) {
             if (each==aranan){
                 count++;
             }
        }
        System.out.println("aranan "+aranan+" sayısı "+count+" kez kullanılmış");


    }
}