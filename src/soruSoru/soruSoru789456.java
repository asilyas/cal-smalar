package soruSoru;

import java.util.ArrayList;
import java.util.List;

public class soruSoru789456 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin

       String cumle="seni dusundum sabah olmadan";
       String harf="z";
       String [] arr=new String[cumle.length()];
               arr=cumle.split("");
        List<String> liste=new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if(arr[i].equals(harf))
                liste.add(harf);
        }
        System.out.println("istenen harf cümlede "+liste.size()+" kez geçmektedir.");
    }
}
