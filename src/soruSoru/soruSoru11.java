package soruSoru;

import java.util.Scanner;

public class soruSoru11 {
    public static void main(String[] args) {

        System.out.println("bir tamsayı giriniz: ");

        int[] arr=new int[5];

        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();


        for (int i = 0; i < args.length; i++) {


            arr[i]=input;
        
        }
        for (int number:arr) {

            System.out.println(number + " ");

        }


    }
}
