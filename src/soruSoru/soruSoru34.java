package soruSoru;

public class soruSoru34 {

    // input olarak verilen bir Stringde
    // index'i tek sayi olanlari kucuk harfle
    // index'i cift sayi olanlari buyuk harfle yazdirin
    // ornek : Java  output: JaVa

    public static void main(String[] args) {

        String str="ben de seni adama benzettim.";
        int index;

        for (int i = 0; i <str.length() ; i++) {

            if(i%2==0) System.out.print(str.substring(i,i+1).toUpperCase());

             else System.out.print(str.substring(i,i+1).toLowerCase());
        }


    }
}
