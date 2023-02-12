package soruSoru;

public class soruSoru13 {
    public static void main(String[] args) {

        int input=5;

        if (input<15) {
            faktoriyel(input);

        }else System.out.println("sayi istenen aralıkta değil");
    }

    private static void faktoriyel(int input) {
        int carpim=1;

        for (int i = 1; i <=input ; i++) {
           carpim*=i;

        }
        System.out.println(carpim);
    }
}
