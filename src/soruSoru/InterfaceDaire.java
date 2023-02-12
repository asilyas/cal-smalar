package soruSoru;

import java.util.Scanner;

public class InterfaceDaire implements Interfaceislemler{
    Scanner scan=new Scanner(System.in);
    int r=0;


    @Override
    public void alan() {
        System.out.println("Daireinin yarıçapını giriniz: ");
        r=scan.nextInt();
        System.out.println("Alan: "+(r*r*3.14));
    }

    @Override
    public void cevre() {
        System.out.println("çevre: "+(2*r*3.14));

    }
}
