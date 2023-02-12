package collections;

import java.util.LinkedList;
import java.util.List;

public class linkList2 {
    public static void main(String[] args) {


        // List data turunde bir Linlklist olusturalım.

        List<String> harfler = new LinkedList<>();

        harfler.add("H");
        harfler.add("K");

        System.out.println(harfler);// H, K

        harfler.add("H");
        System.out.println(harfler);//H,K,H

        System.out.println(harfler.hashCode());


    }
}