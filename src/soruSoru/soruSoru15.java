package soruSoru;

public class soruSoru15 {
    public static void main(String[] args) {
/*
            Bir arıtma tesisinde arıtılan su miktarı günde 5000 metreküptür.
            Arıtılan her 1 metreküp  suyun birim arıtma bedeli arıtılan su hacmine göre değişmektedir.
            Tarife aşağıdaki gibidir:

            2.5 TL (0 – 30.000 metreküp arası)
            3.0 TL (30.000 – 50.000 metreküp arası)
            3,5 TL ( >50.000 metreküp )

            Buna göre, 1 yıl boyunca gün gün arıtma masraflarını toplam olarak bulan ve aşağıdaki
            ekran görüntüsüne sahip olacak bir program hazırlayınız.

            Arıtma Tesisi Günlük Arıtma Masrafı Listesi
                    ……………………………………………….
            1.Gün Sonunda Masraf = …….. TL
            2.Gün Sonunda Masraf = ………TL
            3.Gün Sonunda Masraf = ………TL

            XX. Gün Sonunda Masraf = ……..TL
         */
        int gun=0;
        double toplamMasraf=0;
        int hacim=0;
        double gunlukMasrak=0;
        for (int i = 1; i <= 365; i++) {
            hacim=i*5000;
            gun++;
            if (hacim<=30000){
                gunlukMasrak=5000*2.5;
                toplamMasraf+=gunlukMasrak;
                System.out.println(gun+". gün sonunda masraf "+toplamMasraf );
            } else if (hacim<=50000) {
                gunlukMasrak=5000*3;
                toplamMasraf+=gunlukMasrak;
                System.out.println(gun+". gün sonunda masraf "+toplamMasraf );
            }else {
                gunlukMasrak=5000*3.5;
                toplamMasraf+=gunlukMasrak;
                System.out.println(gun+". gün sonunda masraf "+toplamMasraf );
            }
        }
        
    }
}
