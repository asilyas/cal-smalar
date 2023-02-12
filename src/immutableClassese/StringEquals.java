package immutableClassese;

import java.time.LocalDate;


public class StringEquals {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Java";

        String str3=new String("Java");

        String a="Ja";
        String b="va";

        String str4=a+b;
        String str5=a.concat(b);

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfYear());

    }
}
