package soruSoru;

import java.util.Arrays;

public class soruSoru888 {
    public static void main(String[] args) {
        String str = "Java her gecen gun guzellesiyor";

        // str'da kac kelime var ?
        // split method'u istedigimiz String'i, istedigimiz ayirac kullanarak
        // parcalara ayirmamiza imkan verir

        String[] asd = str.split(" ");
        System.out.println(Arrays.toString(asd));


        int[][] arr = {{1, 2}, {3, 4, 5}, {6, 7, 4, 5}, {2}, {1, 2, 3, 4, 5}};

        int top = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                top += arr[j][i];
            }

        }
        System.out.println(top);


        int[][] arr1 = {{3, 1, 2, 4, 5}, {1, 2, 8}, {3, 4, 5}, {10}, {2, 7}, {3, 5, 8}};

        int[] toplamlarArrayi = new int[arr1.length]; // [0, 0, 0, 0, 0]

        int toplam = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {

                toplam += arr1[i][j];

            }
            toplamlarArrayi[i] = toplam;
            toplam = 0;
        }


        System.out.println(Arrays.toString(toplamlarArrayi));



    }

}




