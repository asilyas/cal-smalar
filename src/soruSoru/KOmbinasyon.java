package soruSoru;

import java.util.Scanner;

public class KOmbinasyon {
    public static void main(String[] args) {
        /*
        N elemanlı bir kümenin elemanları ile oluşturulacak
        r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Kombinasyon formülü:        C(n,r)=n!/r!*(n-r)!

        Bu formüle göre kullanıcıdan n ve r sayılarını isteyip
        hepsinin ayrı ayrı faktöriyellerini hesaplayarak kodlarımızı oluşturacağız.

     */

        Scanner scan =new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        int n=scan.nextInt();
        System.out.print("r değerini giriniz: ");
        int r =scan.nextInt();
        int fakn=1;
        int fakr=1;
        int konbi=1;
        int ffak=1;

        for (int i = 1; i <=n ; i++) {
            fakn*=i;

        }
        System.out.println("n!= "+fakn);
        for (int j = 1; j <=r ; j++) {
             fakr*=j;

        }
        System.out.println("r!= "+fakr);
        for (int k = 1; k <=(n-r) ; k++) {
            ffak*=k;

        }
        konbi=fakn/(fakr*ffak);
        System.out.println("konbinasyon= "+konbi);


        }
    }

