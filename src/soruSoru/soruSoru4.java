package soruSoru;

import java.util.ArrayList;
import java.util.Arrays;

public class soruSoru4 {
    public static void main(String[] args) {

        String[]array1=new String[5];

        array1[0]="john";
        array1[1]="Brad";
        array1[2]="Angel";
        array1[3]="Sofia";
        array1[4]="Emily";

        System.out.println(Arrays.toString(array1));
        
        String[] array2={"sofia","brad","grace","emily","hazel"};
        System.out.println("array2 = " +Arrays.toString(array2));

        ortakElemanlar(array1,array2);


    }

    private static void ortakElemanlar(String[] arr1, String[] arr2) {

       ArrayList <String> arrList=new ArrayList<>();
        for (int i = 0; i <arr1.length ; i++) {

            for (int j = 0; j <arr2.length ; j++) {

               if(arr1[i].equalsIgnoreCase(arr2[j])){
                   arrList.add(arr1[i]);
               }


            }
        }

        System.out.println(arrList);
    }
}
