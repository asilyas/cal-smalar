package eskiler;

import java.lang.reflect.Array;
import java.util.Arrays;

public class yaziIleyazma {
    public static void main(String[] args) {

        int [] arr={1,3,99,35,98,-68};
       // System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,99));
        String str="ali coş ortada,koş";
        String[] arrVirgul=str.split(" ");
        System.out.println(Arrays.toString(arrVirgul));
        for(int i=0;i<arr.length;i++){
            arr[i]+=2;
        }
        String[] isimler= {"Huseyin","Yusuf","Mehmet","Akile","Said"};
        String silinecekHarf= "u";


    }
}
