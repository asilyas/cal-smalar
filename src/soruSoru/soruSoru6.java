package soruSoru;

import java.util.Scanner;

public class soruSoru6 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("cümle giriniz: ");
        String cumle=scan.nextLine();

        System.out.println(sayisalIfadeleriTopla(cumle));

    }
    private static int sayisalIfadeleriTopla(String cumle) {
        int toplam=0;
       String cunleArr[]=cumle.split("");
       /*  for (String each:cunleArr) {
            if(Character.isDigit(each.charAt(0))){
                toplam+=Integer.valueOf(each);
            }
        }
        return toplam;
        */

        for (int i = 0; i < cunleArr.length; i++) {
            if (Character.isDigit(cunleArr[i].charAt(0))){
                toplam+=Integer.valueOf(cunleArr[i]);
            }
        }
        return toplam;
    }
}
