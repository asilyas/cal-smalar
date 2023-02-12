package collections;

import java.util.Deque;
import java.util.LinkedList;

public class DEuque1 {
    public static void main(String[] args) {
        Deque<String>harfler= new LinkedList<>();
        harfler.add("J");
        harfler.add("L");

        System.out.println(harfler);
        harfler.addFirst("B");
        System.out.println(harfler);


    }
}
