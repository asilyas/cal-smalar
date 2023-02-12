package eskiler;

public class Main {

    public static void main(String[] args) {


        String metin="dede sende gelsene birde dur de";

        System.out.println(metin.contains("birde"));

        char karakter;
        double uzunluk,sayac=0.0;
         uzunluk=metin.length();


        for(int i=0;i<uzunluk;i++){
           // if(karakter==metin.charAt(i)) sayac++;
        }

        System.out.println(uzunluk);
        System.out.println(sayac+"tane");
        double oran=sayac/uzunluk;
        System.out.println(oran);



    }
}