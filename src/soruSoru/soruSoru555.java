package soruSoru;

public class soruSoru555 {


    public static void main(String[] args) {

        System.out.println(asalMi(32));

        toplama(8, 9);
    }

    private static void toplama(int a, int b) {
        System.out.println(a + b);

    }

    public static boolean asalMi(int a) {
       boolean asalMi=true;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("asal değil");
                asalMi=false;
                break;

            }


        }
        return asalMi;
    }
}