package soruSoru;

import java.util.Scanner;

public class InterefaceRunner {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("========İŞLEMLER========\n"+
                "\t\t1-KARE\n"+
                "\t\t2-DİKDÖRTGEN\n"+
                "\t\t3-DAİRE\n+" +
                "\n"+
                "\tSEÇİMİNİZ: ");
        int secim=scan.nextInt();
        switch (secim) {
            case 1: {
                InterfaceKare kare=new InterfaceKare();
                kare.alan();
                kare.cevre();
            }
            case 2: {
                InterfaceDikdörtgen dikdörtgen=new InterfaceDikdörtgen();
                dikdörtgen.alan();
                dikdörtgen.cevre();
            }
            case 3: {
                InterfaceDaire daire=new InterfaceDaire();
                daire.alan();
                daire.cevre();
            }

        }
    }
}
