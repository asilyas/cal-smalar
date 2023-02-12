package soruSoru;

import java.util.Arrays;

public class grupSoruCozumu {
    public static void main(String[] args) {
       /* Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
                --> toCharArray() yöntemini kullanmayın
        Örnek:
        String isim:    Yakup
        char arr[]:     [Y,a,k,u,p]
        İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak, her bir harfi,
         Arraye yerleştirin

        */

        String isim="yakup";
         ismiCharDondur(isim);
    }

     private static void ismiCharDondur(String isim) {

        char[]arr=new char[isim.length()];
         for (int i = 0; i < arr.length; i++) {
             arr[i]=isim.charAt(i);
         }
         System.out.println(Arrays.toString(arr));

    }
}
