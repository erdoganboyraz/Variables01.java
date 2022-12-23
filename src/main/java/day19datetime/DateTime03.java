package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {


//Example 1 : Japonya ile Almanya arasindaki zaman  farkini saat olarak hesaplayan kodu yaziniz.

        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark = ChronoUnit.HOURS.between(germany,japan);
        System.out.println(fark);//6

    //Example 2 : Sabit bir tarih olusturunuz.

        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);//2011-04-13
/*
Java`da sabit data`lari(Gun isimleri,ay isimleri, Amerika`daki eyalet isimleri etc.) depolamak ve gerektiginde
kullanmak icin depolar olustururuz. Bu depolara "Enum" deriz.
 */

     //Example 3 : USA icin "Woow" ,UK icin "Big" , CANADA icin "Cold"  , TURKEY icin "Vatan" y ,"GERMANY" icin "Araba",
     //"RWANDA" icin "Cay" yaziniz.

       Countries country = Countries.RWANDA;


       switch (country){

           case USA:
               System.out.println("Woow!");
           break;

           case UK:
               System.out.println("Big");
           break;

           case  CANADA:
               System.out.println("Cold");
           break;

           case TURKEY:
               System.out.println("Vatan");
           break;

           case GERMANY:
               System.out.println("Araba");
           break;

           case RWANDA:
               System.out.println("Cay");
           break;

           default:
               System.out.println("Tanimlanmamis ulke");
       }


    /*
    YUKARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAKI BENIM DERS TEKRARIM
     */

    //Soru 1 : Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz.

        LocalDateTime japan1 = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany1 = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark1 = ChronoUnit.HOURS.between(germany1,japan1);
        System.out.println(fark1);//7

    //Soru 2 : Sabit bir tarih olusturunuz.

     LocalDate benimZamanim = LocalDate.of(2011,Month.APRIL,13);

        System.out.println(benimZamanim);//2011-04-13



     /*
     Java`da sabit datalari(Gun isimleri, ay isimleri,America`daki eyalet isimleri etc.) depolamak ve gerektiginde kullan
     mak icin depolar olustururuz. Bu depolara "Enum" denir.
      */












    }
}
