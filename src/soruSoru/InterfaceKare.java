package soruSoru;

import java.util.Scanner;

public class InterfaceKare implements Interfaceislemler{

    Scanner scan=new Scanner(System.in);

    int kenar=0;

    @Override
    public void alan() {
        System.out.println("Karenin bir kenar uzunluğunu giriniz: ");
        kenar=scan.nextInt();
        System.out.println("Alan= "+kenar*kenar);
    }

    @Override
    public void cevre() {
        System.out.println("Cevre= "+(kenar*4));


    }
}
