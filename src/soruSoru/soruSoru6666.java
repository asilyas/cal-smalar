package soruSoru;

import java.util.ArrayList;
import java.util.List;

public class soruSoru6666 {
    public static void main(String[] args) {
        //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.

        int[] arr1 = {3,5,6,1,3,7};
        int[] arr2 = {3,8,9,4,5,11};
        List<Integer> ortak=new ArrayList<>();
        for (int each:arr1) {
            for (int eachh:arr2) {
                if(each==eachh&&!ortak.contains(each)){
                    ortak.add(each);
                }
            }
        }
        System.out.println(ortak);
    }
}
