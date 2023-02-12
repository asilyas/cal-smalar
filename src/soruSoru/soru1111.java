package soruSoru;

public class soru1111 {
    public static void main(String[] args) {

        int ahmet=5;
        int mehmet=6;
        int bos=0;
        bos=mehmet;
        mehmet=ahmet;
        ahmet=bos;
        System.out.println(ahmet+" "+ mehmet);

        char car='b',car1='b'+3;

        System.out.println(Character.valueOf(car1));
        System.out.println(Double.valueOf((ahmet+mehmet+bos)/3));
        System.out.println(ahmet+" "+mehmet+" "+bos);



        double[] fiyatlar={23, 34.5, 42.1, 5.7, -13.4, 23.5};

        enYuksekEnDusukFiyatYazdir(fiyatlar);


    }

    public static void enYuksekEnDusukFiyatYazdir(double[] fiyatlar) {
            double min=fiyatlar[0], max=fiyatlar[0];

        for (double each:fiyatlar) {
            if (each<min){
                min=each;
            }

            if (each>max){
                max=each;
            }

        }System.out.println("en küçük eleman: "+min);
        System.out.println("en büyük eleman: "+max);



    }
}
