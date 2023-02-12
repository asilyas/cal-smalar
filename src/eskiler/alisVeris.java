package eskiler;

import java.util.Scanner;

public class alisVeris {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("ürün adedi: ");
        int adet=scan.nextInt();
        System.out.println("liste fiyatı: ");
        double listeFiyati=scan.nextDouble();
        System.out.println("müşteri kartı varsa: E \nmüşteri kartı yoksa:H");
        char musteriKarti=scan.next().charAt(0);


        if(musteriKarti=='E'){
            if(adet>=10){
                listeFiyati=listeFiyati*0.8;
                double indirinliFiyat=adet*listeFiyati;
                System.out.println(indirinliFiyat);
            }else {
                listeFiyati=listeFiyati*0.85;
                double indirinliFiyat=adet*listeFiyati;
                System.out.println(indirinliFiyat);
            }
        }if(musteriKarti=='K') {
            if(adet>=10){
                listeFiyati=listeFiyati*0.85;
                double indirinliFiyat=adet*listeFiyati;
                System.out.println(indirinliFiyat);
            }else {
                listeFiyati=listeFiyati*0.90;
                double indirinliFiyat=adet*listeFiyati;
                System.out.println(indirinliFiyat);
            }
        }
    }
}
