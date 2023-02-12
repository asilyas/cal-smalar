package soruSoru;

public class soru1 {

    public static void main(String[] args) {
        int toplam=0;
        for(int i=100;i>0;i--){
            if (i%13==0){
                System.out.println(i+"sayısı 13 e tama bölünür");
                toplam+=i;
            }

        }
        System.out.println(toplam+"toplamları");
    }

}
