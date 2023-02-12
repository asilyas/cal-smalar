package eskiler;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir yıl girin:");
        int yil=scan.nextInt();


        if((yil%4==0)&&(yil%100==0)&&(yil%400==0)){
            System.out.println(yil + " artık yıldır.");
        }else if((yil%4==0)&&(yil%100!=0)){
            System.out.println(yil + " artık yıldır.");
        }else if(yil%4!=0){
            System.out.println(yil + " artık değildir!");
        }else {
            System.out.println(yil+" artık değildir!");
        }
    }
}
