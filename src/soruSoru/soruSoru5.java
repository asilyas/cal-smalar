package soruSoru;

public class soruSoru5 {
    public static void main(String[] args) {

        //float []numbers=new float[5];

        float[] numbers={1.1f,2.0f,3.2f,5.0f,7.5f};

        float toplam=0;

        for (int i = 0; i < numbers.length ; i++) {

            toplam+=numbers[i];

        }
        System.out.println("toplam"+toplam);
    }
}
