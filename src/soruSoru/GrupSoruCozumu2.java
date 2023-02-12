package soruSoru;

public class GrupSoruCozumu2 {
    /*
         Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
         ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
    Örnek:
    inputarr[]=   {1,2,3,4,5,6,7}
    output:         4
    İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
    Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
     Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
         */

    public static void main(String[] args) {




    }

    public static int ortabulma() {
        int [] arr ={2,3,5,68,7,13,5,6,25,41,5,3,5,2,5};
        int  ortaelemen=arr.length/2;

        System.out.println(arr.length);
        System.out.println(ortaelemen);
        System.out.println(arr[ortaelemen]);

       return  ortaelemen;
    }

}
