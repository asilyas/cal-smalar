package soruSoru;

import java.util.Scanner;

public class soruSoru2 {
    public static void main(String[] args) {
        System.out.println("bir cünle giriniz=  ");
        Scanner scan=new Scanner(System.in);
        String cumle=scan.nextLine().toUpperCase();
        int sayac=0;
        for (int i = 0; i <cumle.length() ; i++) {
              if(cumle.charAt(i)=='A'){
                  sayac++;
              }
            if(cumle.charAt(i)=='C'){
                break;
            }
        }
        System.out.println(cumle+"-->"+sayac+"tane A harfi mevcut");
        }
    }

