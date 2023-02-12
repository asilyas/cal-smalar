package immutableClassese;

import java.util.ArrayList;
import java.util.List;

public class passByValue {
    public static void main(String[] args) {

         // verilen bir List'de degisiklik yapan 2 method olusturun
         // 1.method list'in elementlerine yeni deger atayip yazdirsin
         // 2.method, list'e yeni bir list degeri atayip, yeni list'e
         //   elementler ekleyip yazdirsin
         // her iki method'u cagirdiktan sonra main method'daki list'i yazdiralim

        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);
        System.out.println(sayilar);

        elemanlariDegistir(sayilar);
        System.out.println("1. method call dan sonra: "+sayilar);

        yeniListAta(sayilar);
        System.out.println("2.method call den sonra"+sayilar);//bu yöntemde main method daki array değişmiyor.

    }
    public static void elemanlariDegistir(List<Integer>sayilar){
        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("elemanları değişrtir  metodu: "+sayilar);
    }
    public static void yeniListAta(List<Integer>sayilar){
        sayilar=new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);
        System.out.println("yeni list atadığımız yöntem: "+sayilar);
    }
}
