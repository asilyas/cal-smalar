package soruSoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorusoru9999 {
    public static void main(String[] args) {
        List<String> asd = new ArrayList<>();
        asd.add("a");
        asd.add("2");
        asd.add("d");
        asd.add("dfr");
        asd.remove(3);

        // System.out.println(asd);

        // Verilen bir array'deki tekrar eden elementleri silip
        // array'i unique degerlerden olusan bir array haline getirin

        int[] arr = {4, 3, 6, 7, 3, 5, 3, 6, 7, 3, 5, 4, 6, 4, 7, 7, 7, 5};
        List<Integer> benzer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

                if (!benzer.contains(arr[i])) {
                    benzer.add(arr[i]);
                }
            }
            System.out.println(benzer);
            arr=new int[benzer.size()];
        for (int i = 0; i <arr.length ; i++) {
              arr[i]=benzer.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}

