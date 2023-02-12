package OOP;

public class FDizelCorolla extends ECorolla {


    String motor="1.6 dizel motor";
    String yakit="Dizel";
    String guvenlik="Abs";
    String renk="renk belirtilmedi";

    public static void main(String[] args) {



        FDizelCorolla c1=new FDizelCorolla();

        System.out.println(c1.motor);//DC
        System.out.println(c1.yakit);//DC
        System.out.println(c1.guvenlik);//DC
        System.out.println(c1.renk);//DC

        System.out.println(c1.model);//C
        System.out.println(c1.uretimYeri);//C
        System.out.println(c1.teker);
        System.out.println(c1.vites);

        System.out.println(c1.marka);

    }

}
