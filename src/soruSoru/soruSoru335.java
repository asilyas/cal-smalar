package soruSoru;

public class soruSoru335 {


    // Soru 8 (interview)- Kullanicidan pozitif bir sayi alin,
    //       1’den baslayarak tum tamsayilari yazdirin, sira
    //	- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
    //	- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
    //	- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

    public static void main(String[] args) {

         int input=28;

        for (int i = 1; i <input ; i++) {


            if (i%3==0&&i%5==0) System.out.println("fizzBuzz");
            else if (i%3==0) System.out.println("fizz");
            else if (i%5==0) System.out.println("buzz");
            else System.out.println(i+" ");

        }

    }
}
