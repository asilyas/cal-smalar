package soruSoru;

public class soruSoru4321 {
    public static void main(String[] args) {

        String str="11111";
        String tersten=soruSoru222.tersStr(str);
        System.out.println(tersten);
        if (str.equals(tersten)) {
            System.out.println("polindrom");
        }else System.out.println("pol değil");

        fibonacciSayi(16);
    }
    public static void fibonacciSayi(int adet) {

        if (adet<=0){
            System.out.println("Gecersiz giris");
        } else if (adet==1) {

            System.out.println("0");
        } else if (adet==2) {
            System.out.println("0 1");
        }else {
            int sayi1 = 0;
            int sayi2 = 1;
            int sayi3 = 0;
            System.out.print("0 1 ");

            for (int i = 3; i <=adet ; i++) {
                sayi3=sayi1+sayi2;
                System.out.print(sayi3+" ");
                sayi1=sayi2;
                sayi2=sayi3;
            }
            System.out.println("");
        }


    }
}
