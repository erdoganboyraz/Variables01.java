package day20stringbuilderstringbuffer;

import java.time.LocalDate;
import java.time.Month;

public class DateTime01{
    public static void main(String[] args) {


//Example 1 : Tom Ali'den 3 yıl 8 ay 13 gün sonra doğdu. Ali ise Veli'den 1 yıl 15 gün önce doğdu.
// Tom'un doğum tarihi 18 Kasım 2011 ise Veli ve Ali'nin doğum tarihlerini bulunuz.

        LocalDate dobTom = LocalDate.of(2011, Month.NOVEMBER,18);

        LocalDate dobAli = dobTom.minusYears(3).minusMonths(8).minusDays(13);

        LocalDate dobVeli = dobAli.plusYears(1).plusDays(15);


        System.out.println("Ali : " + dobAli);//2008-03-05
        System.out.println("Veli : " + dobVeli);//2009-03-20


/*
YUKARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAKI BENIM DERS TEKRARIM
 */

//Example 1 : Matt Yusuf'dan 3 yıl 8 ay 13 gün sonra doğdu. Yusuf ise Can'dan 1 yıl 15 gün önce doğdu.
// Tom'un doğum tarihi 18 Kasım 2011 ise Veli ve Ali'nin doğum tarihlerini bulunuz.

        LocalDate dobMatt = LocalDate.of(2011,Month.NOVEMBER,18);
        LocalDate dobYusuf = dobMatt.minusYears(3).minusMonths(8).minusDays(13);
        LocalDate dobCan = dobYusuf.plusYears(1).plusDays(15);

        System.out.println("Yusuf : " + dobYusuf);//Yusuf : 2008-03-05
        System.out.println("Can : " + dobCan);//Can : 2009-03-20




























    }
}
