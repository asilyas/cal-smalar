package soruSoru;

import java.util.Scanner;

public class soruSoru222 {
    public static void main(String[] args) {
        System.out.println(tersStr("ilyas benim adım"));

    }
    
        public static String tersStr (String str){
            String yeniStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                yeniStr += str.charAt(i);
            }
            return yeniStr;
        }


    }

