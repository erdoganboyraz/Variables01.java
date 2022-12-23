package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

//Example 1 : Java`dan aldiginiz Date`yi "ay/gun/yil" olarak yaziniz.

        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = dtf1.format(currentDate);
        System.out.println(formattedDate1);//10/21/2022


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");//"MM" 10`dan kucuk aylari 01,02,03 etc seklinde yazar.
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2);//Oct/21/2022



        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3);//October/21/2022




        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");//"M" 10dan kucuk aylari 1,2,3 etc seklinde yazar.
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate4);//10/21/2022



        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("M/dd/yy");
        String formattedDate5 = dtf5.format(currentDate);
        System.out.println(formattedDate5);//10/21/22


        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("M/d/yy");//"d" 10`dan kucuk gunleri 1,2,3 etc seklinde yazar.01,02,03 seklinde kullanmaz.
        String formattedDate6 = dtf6.format(currentDate);
        System.out.println(formattedDate6);//10/21/22

    //Example 2 : Java`dan aldiginiz Time`in formatini degistiriniz.

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime);//16:23:54.000002345


    DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");//"HH" 24 saat sistemini,"hh" 12 saat sistemini kullanir.
    String formattedMyTime1 =  dtf7.format(myTime);
        System.out.println(formattedMyTime1);//16:23


        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2 =  dtf8.format(myTime);
        System.out.println(formattedMyTime2);//04:23 PM

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
/*
YUKARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAKI BENIM TEKRARIM
 */


    //Soru 1 : Java`dan aldiginiz Date`yi "ay/yil/gun" olarak yaziniz.

    LocalDate anlikTarih = LocalDate.now();

        DateTimeFormatter dtf9 = DateTimeFormatter.ofPattern("MM/dd/yyyy");//"MM" 10`dan kucuk aylari 01,02 ve 03 etc. seklinde yazar.
        String formattedDate10 = dtf9.format(anlikTarih);
        System.out.println(formattedDate10);//2022-10-23



        DateTimeFormatter dtf10 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate11 = dtf10.format(anlikTarih);
        System.out.println(formattedDate11);//Oct/23/2022



        DateTimeFormatter dtf11 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate12 = dtf11.format(anlikTarih);
        System.out.println(formattedDate12);//October/23/2022


        DateTimeFormatter dtf12 = DateTimeFormatter.ofPattern("M/dd/yyyy");//"M" 10`dan kucuk aylari 1,2 ve 3 etc. seklinde yazar
        String formattedDate13 = dtf12.format(anlikTarih);
        System.out.println(formattedDate13);//10/23/2022



        DateTimeFormatter dtf13 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDate14 = dtf13.format(anlikTarih);
        System.out.println(formattedDate14);//10/23/22


        DateTimeFormatter dtf14 = DateTimeFormatter.ofPattern("MM/d/yy");//"d" 10`dan kucuk gunleri 1,2, ve 3 etc. seklinde yazar ,01,02 ve 03 kullanmaz.
        String formattedDate15 = dtf14.format(anlikTarih);
        System.out.println(formattedDate15);//10/23/22


    //Soru 2 : Java`dan aldiginiz time`in formatini degistiriniz.

      LocalTime benimZamanim = LocalTime.of(16,23,54,2345);
        System.out.println(benimZamanim);//16:23:54.000002345

        //"HH" 24 saat sistemi, "hh" 12 saat sistemini kullanir.
      DateTimeFormatter dtf15 =  DateTimeFormatter.ofPattern("hh:mm");
      String formattedMyTime =  dtf15.format(benimZamanim);
      System.out.println(formattedMyTime);//04:23


        DateTimeFormatter dtf16 =  DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyTime3 =  dtf16.format(benimZamanim);
        System.out.println(formattedMyTime3);//16:23



        DateTimeFormatter dtf17 =  DateTimeFormatter.ofPattern("hh:mm a");//buraya a koyarsak java saati am yada pm olarak cevirir.
        String formattedMyTime4 =  dtf17.format(benimZamanim);
        System.out.println(formattedMyTime4);//04:23 PM









    }
}
