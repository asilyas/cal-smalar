package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraydekiTekrarEdenElemetlerdenKurtulma {
    public static void main(String[] args) {

        int []arr = {1,2,4,2,3,5,6,2,4,5,1,2,4,5,3,5,6,1,2,5,4,3,2};
        Set <Integer>arrSet=new HashSet<>();

        for (int each:arr
             ) {
            arrSet.add(each);

        }
        System.out.println(arrSet);

        arr=new int[arrSet.size()]; //[0,0,0,0,0,0]

        int index=0;
        for (int each:arrSet
             ) {
            arr[index]=each;
            index++;

        }
        System.out.println("Arrayin son hali = " + Arrays.toString(arr));
    }
}
