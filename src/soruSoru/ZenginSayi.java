package soruSoru;

public class ZenginSayi {
    public static void main(String[] args) {

         int k=0;

        for (int i = 1; i < 50; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%j==0){
                    k+=j;
                }
            }
            if(k>(2*i)){
                System.out.println(i+"zengin sayi");
            }
            k=0;
        }
    }
}
