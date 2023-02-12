package map;

import java.util.Map;

public class IsimSoyisimSiraliListe {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.isimSoyisimSiraliListeYazdir(ogrenciMap);
    }
}
