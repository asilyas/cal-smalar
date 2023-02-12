package map;

import com.sun.source.doctree.SeeTree;

import java.util.Map;
import java.util.Set;

public class EntrySet {

    public static void main(String[] args) {

        Map<Integer,String> ogreciMap=MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogreciMap);

        System.out.println("NO  OGRENCI  BILGILERI");
        System.out.println("======================");

        Set<Integer> ogrenciNoSeti=ogreciMap.keySet();

        for (Integer eachKey:ogrenciNoSeti) {

            System.out.println(eachKey+"="+ogreciMap.get(eachKey));
        }

        Set<Map.Entry<Integer,String>>ofreciEntrySet=ogreciMap.entrySet();
        System.out.println("NO  OGRENCI  BILGILERI");
        System.out.println("======================");



    }
}
