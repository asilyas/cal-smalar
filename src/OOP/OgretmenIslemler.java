package OOP;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgretmenIslemler implements IIslemler {
    Scanner scan = new Scanner(System.in);
    int sicilNo=1000;
    ArrayList<Ogretmen>ogretmenList=new ArrayList<>();
    void ogrtMenu() {
        System.out.println(" ====================================\n" +
                "    ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "   ====================================\n" +
                "    1- ÖĞRENCİ İŞLEMLERİ\n" +
                "    2- ÖĞRETMEN İŞLEMLERİ\n" +
                "    Q- ÇIKIŞ\n" +
                "     SEÇİMİNİZ:  ");
        try {
            int secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    ekleme();
                }
                case 2: {
                    arama();
                }
                case 3: {
                    listeleme();
                }
                case 4: {
                    silme();
                }
            }
        } catch (InputMismatchException e) {
            String secim = scan.next();
            if (secim.equalsIgnoreCase("q")) {
                AnaMenu anaMenu = new AnaMenu();
            } else {
                System.out.println("hatalı giriş yapıldı");
                ogrtMenu();
            }
        }
    }

        @Override
        public void ekleme () {
            System.out.print("ogretmen adnı girin: ");
            String ad=scan.nextLine();
            System.out.print("öğretmen soyadını girin: ");
            String sAd=scan.nextLine();
            System.out.print("öğretmen tc no girin: ");
            String tcNo=scan.nextLine();
            System.out.print("öğretmen yaşını girin: ");
            int yas=scan.nextInt();
            System.out.print("öğretmen bölümünü girin: ");
            String bolum=scan.nextLine();
            Ogretmen ogretmen=new Ogretmen(ad,sAd,tcNo,yas,bolum,sicilNo++);
            ogretmenList.add(ogretmen);
        }

        @Override
        public void arama () {
            System.out.println("aranacak kişinin tc nosunu giriniz: ");
            String tcNo=scan.next();
            int kontrol =0;
            for (Ogretmen each:ogretmenList) {
                if (each.getTcNo().equals(tcNo)){
                    System.out.println(each);
                    kontrol=1;
                }

            }
           if (kontrol==0){
               System.out.println(tcNo+" nolu kişi bulunmamaktadır!");
           }
           ogrtMenu();
        }

        @Override
        public void listeleme () {
            for (Ogretmen each:ogretmenList) {
                System.out.println(each);
            }
        }

        @Override
        public void silme () {
            System.out.println("silinecek kişinin tc nosunu giriniz: ");
             String tcNo=scan.next();
             boolean kontrol=false;
            for (int i = 0; i < ogretmenList.size(); i++) {
                if (ogretmenList.get(i).getTcNo().equals(tcNo)){
                    System.out.println("silinen kişi: "+ogretmenList.get(i));
                    ogretmenList.remove(i);
                    kontrol =true;
                }
            }
         if (!kontrol) {

         }
    }

    }


