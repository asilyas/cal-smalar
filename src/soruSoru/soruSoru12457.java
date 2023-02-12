package soruSoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soruSoru12457 {
    public static void main(String[] args) {
        Integer[] arr ={2,3,4,6,3,4,6,1,8,5,4};
        //Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip, tum elemanlardan  sadece 1 tane yapip
        // eski array’e yeni halini atayip yazdirin.

           List<Integer>yeniList=new ArrayList<>();
        for (Integer each:arr) {
            if(!yeniList.contains(each)){
                yeniList.add(each);
            }
        } System.out.println(yeniList);

        arr=new Integer[yeniList.size()];
        for (int i = 0; i <yeniList.size() ; i++) {
               arr[i]=yeniList.get(i);

            }Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        }

    }



