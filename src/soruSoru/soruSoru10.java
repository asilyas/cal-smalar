package soruSoru;

import java.util.Arrays;

public class soruSoru10 {
    public static void main(String[] args) {


    int input1[] = {2, 3, 5, 3, 1,0};
    int input2[] = {5, 2, 7, 1, 4};

        mountainArrayKontrol(input1);
        mountainArrayKontrol(input2);

}
    public static void mountainArrayKontrol( int[]arr) {
      int max=arr[0];  int index=0; boolean result=true;
      for(int i=1;i< arr.length;++i){
          if(arr[i]>max){
              max=arr[i];
              index=i;
          }
      }
        for (int i = 0; i < index; i++) {
            if (arr[i]<arr[i+1]){
                continue;
            }else {
                result=false;
                break;
            }
        }
        if (result){
            for (int i = index; i < arr.length-1 ; i++) {
                if (arr[i]>arr[i+1]){
                    continue;
                }else {
                    result=false;
                    break;
                }

            }
        }
        if (result) {
            System.out.println((Arrays.toString(arr))+ " mountain arraydir." );
        }else {
            System.out.println((Arrays.toString(arr))+ " mountain array değildir.");
        }
    }
}
