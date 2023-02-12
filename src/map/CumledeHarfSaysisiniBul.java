package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CumledeHarfSaysisiniBul {

    public static void main(String[] args) {
        String cumle="Java candir";

        cumle=cumle.replaceAll("\\W","");

        String[]cumleArr=cumle.split("");
        Map<String,Integer> kullanimSayilariMap=new TreeMap<>();

        for (int i = 0; i < cumleArr.length; i++) {

            if (!kullanimSayilariMap.containsKey(cumleArr[i])){
                kullanimSayilariMap.put(cumleArr[i],1);

            }else{
                int eskiValue=kullanimSayilariMap.get(cumleArr[i]);
                kullanimSayilariMap.put(cumleArr[i],eskiValue+1);
            }

        }
        System.out.println(kullanimSayilariMap);

    }
}
