package map;

import java.util.Locale;

public class mapMethodlari {
    public static void main(String[] args) {

        int x=3;
        int y=5;
        int z=8;

        int max;
        int min;

        String str="ben bu yollari coktan gectim";
        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase().charAt(str.length()-3));

        String input = "1-48 of 49 results for \"nutella\"";

        int indxof=input.indexOf("of");
        int indxres=input.indexOf("result");

        String fark=input.substring((indxof+3),(indxres-1));
        int ffark=Integer.parseInt(fark);

        if(ffark>50) System.out.println("sonuç "+ffark+" test başarılı");
        else System.out.println("sonuç "+ffark+" test başarısız!!");

        System.out.println(str.replace("a","A"));
        System.out.println(str.replaceAll(" ",""));;
        
        
        System.out.println(str.length());

    }
}
