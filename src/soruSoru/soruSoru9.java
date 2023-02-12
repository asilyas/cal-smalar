package soruSoru;

public class soruSoru9 {
    public static void main(String[] args) {

        String strArr[]={"Kemal","Jonathon","Mark","Jackson","Ali"};
        System.out.println(harfKontrol(strArr));

    }

    private static String harfKontrol(String[] strArr) {
        String ilkHarfler="";
        for (int i = 0; i < strArr.length ; i++) {
            if(strArr[i].endsWith("n")||strArr[i].endsWith("k")){
                ilkHarfler+=strArr[i].charAt(0);

            }
        }

        return ilkHarfler;
    }
}
