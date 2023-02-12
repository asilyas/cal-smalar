package map;

import java.util.Map;

public class Value {
    public static void main(String[] args) {

        Map<Integer,String>ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-han-12-M-MF");

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.keySet());

        System.out.println(ogrenciMap.values());




    }
}
