package map;

import java.util.Map;

public class NumaraIleSubeGuncelleme {
    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap,104,"Q");
        System.out.println(ogrenciMap);
    }
}
