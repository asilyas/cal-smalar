package soruSoru;

import java.util.Scanner;

public class deneme333 {
    public static void main(String[] args) {

        // Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin


        System.out.print("lüffen bir gün ismi giriniz: ");

        Scanner scan=new Scanner(System.in);
        String girilenGun=scan.next();


        if(girilenGun.equalsIgnoreCase("pazartesi")||girilenGun.equals("salı" )||girilenGun.equals( "çarşamba")||girilenGun.equals("perşembe")
            ||girilenGun.equals("cuma")){
            System.out.println("çalışma zamanı!!!");
        }if (girilenGun.equals("cumartesi")||girilenGun.equals("pazar")){
            System.out.println("dinlenme zamanı!!!");
        }else {
            System.out.println("yanlışş giriş!");


        }
    }
}
