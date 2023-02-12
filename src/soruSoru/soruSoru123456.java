package soruSoru;

import java.util.ArrayList;
import java.util.List;

public class soruSoru123456 {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("cherry");
        inputList.add("date");
        inputList.add("elderberry");

        List<String> outputList = new ArrayList<>();
        for (String s : inputList) {
            if (!s.contains("c")) {
                outputList.add(s);
            }
        }

        System.out.println(outputList);
    }
}
