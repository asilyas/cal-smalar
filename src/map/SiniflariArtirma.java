package map;

import java.util.Map;

public class SiniflariArtirma {

    public static void main(String[] args) {

        Map<Integer,String>ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap=MapMethodDepo.siniflariArtir(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);
    }




}
