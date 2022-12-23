package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

    //Example 1 : "Anlik tarihi(Current time)" ekrana yazdiran kodu yaziniz.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);


    //Example 2 : "Anlik zamani(Current time)" ekrana yazdiriniz.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

    //Example 3 : "Anlik zamani(Current time)" ve "Anlik tarihi(Current time)"yazdiran kodu yaziniz.

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

    //Example 4 : Japonya`daki "Anlik zamani(Current time)" ve "Anlik tarihi(Current time)"yazdiran kodu yaziniz.

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));//2022-10-22T02:52:40.135562
        System.out.println(currentDateTimeInJapan);

    //Example 5 : Istanbul`daki "Anlik zamani(Current time)" ve "Anlik tarihi(Current time)"yazdiran kodu yaziniz.
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));//2022-10-21T20:52:40.137565700
        System.out.println(currentDateTimeInIstanbul);


    //Example 6 : Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz.

        LocalDate countDate= LocalDate.of(2022,10,21);
        LocalDate retiredDate = countDate.plusDays(789);
        System.out.println(retiredDate);//2024-12-18


    //Example 7 : Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.

        LocalDate dobAli=LocalDate.of(2005,5,17);
        LocalDate dobVeli=LocalDate.of(2013,2,8);

        //between(dobAli,dobVeli); method`u kullanildiginda daha eski olan tarin once yazilmalidir.
       Long diff =  ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff);


    //Example 8 : Istanbul`un fethi ile ,Cumhuruyet`in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.

        //29 Mayıs 1453

        LocalDate istanbulFethi= LocalDate.of(1453,5,29);
        LocalDate cumhuriyetinIlani = LocalDate.of(1923,10,29);

        Long aySayisi =  ChronoUnit.MONTHS.between(istanbulFethi,cumhuriyetinIlani);
        System.out.println(aySayisi);//5645

    //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989, 5, 13);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.yol
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        } else if (day>=21 && month==4){
            System.out.println("Boga");
        } else if (day<=20 && month==5){
            System.out.println("Boga");
        }


    //2.yol
        if((day>=21 && month==3) || (day<=20 && month==4)){
            System.out.println("Koc");
        }else if ((day>=21 && month==4) ||(day<=20 && month==5)) {
            System.out.println("Boga");
        }
        System.out.println();
        System.out.println();
        System.out.println();


/*
YUKARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAKI BENIM DERS TEKRARIM
 */

    //Soru 1 : "Anlik tarihi(current date)" ekrana yazdiran kodu yaziniz.

    LocalDate anlikTarih = LocalDate.now();
        System.out.println(anlikTarih);//2022-10-23

        //Soru 2 : "Anlik zamani(current time)"ekrana yazdiran kodu yazininz.

    LocalTime anlikZaman = LocalTime.now();
        System.out.println(anlikZaman);//09:26:28.823032100

    //Soru 3 : "Anlik tarihi(current date)" ve "Anlik zamani(current time)" ekrana yazdiran kodu yaziniz.

    LocalDateTime anlikTarihveAnlikZaman= LocalDateTime.now();
        System.out.println(anlikTarihveAnlikZaman);//2022-10-23T09:28:50.103848400 .. buradaki /T/ harfi Time kastettigi icin vardir.

    //Soru 4 :Japonya`daki "Anlik tarihi(current date)" ve "Anlik zamani(current time)" ekrana yazdiran kodu yaziniz.

     LocalDateTime anlikTarihveAnlikZamanInJaponya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(anlikTarihveAnlikZamanInJaponya);//2022-10-23T15:35:40.430630300

     //Soru 4 : Istanbul`daki "Anlik tarihi(current date)" ve "Anlik zamani(current time)" ekrana yazdiran kodu yaziniz.
        LocalDateTime anlikTarihveAnlikZamanInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(anlikTarihveAnlikZamanInIstanbul);//2022-10-23T09:37:27.886744600

     //Soru 6 : Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yazininz.

     LocalDate saymayaBasladigimGun = LocalDate.of(2022,10,23);
     LocalDate emeklilikTarihi = saymayaBasladigimGun.plusDays(789);
        System.out.println(emeklilikTarihi);//2024-12-20


    //Soru 7 : 2 cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.

     LocalDate dobAhmet = LocalDate.of(1997,9,19);
     LocalDate dobEfe = LocalDate.of(2012,12,10);

     //between() method`u kullanildiginda daha eski olan tarih once yazilmalidir.
    Long fark =ChronoUnit.DAYS.between(dobAhmet,dobEfe);
        System.out.println(fark);//5561

    //Soru 8 : Istanbul`un Fethi ile Cumhuriyet`in kurulmasi arasinda kac ay oldugunu hosteren kodu yaziniz.

        LocalDate istanbulunFethi1 = LocalDate.of(1453,5,29);
        LocalDate cumhuriyetinKurulus = LocalDate.of(1923,10,29);
        Long fark1 =ChronoUnit.MONTHS.between(istanbulunFethi1,cumhuriyetinKurulus);
        System.out.println(fark1);//5645


    //Soru 9 : Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz.
        LocalDate benimTarihim = LocalDate.of(1989, 5, 13);

        int gun = benimTarihim.getDayOfMonth();
        int ay = benimTarihim.getMonthValue();

        //1.yol
        if(gun>=21 && ay==3){
            System.out.println("Koc");
        }else if(gun<=20 && ay==4){
            System.out.println("Koc");
        } else if (gun>=21 && ay==4){
            System.out.println("Boga");
        } else if (gun<=20 && ay==5){
            System.out.println("Boga");
        }

        //2.yol
        if((gun>=21 && ay==3) || (gun<=20 && ay==4)){
            System.out.println("Koc");
        }else if ((gun>=21 && ay==4) ||(gun<=20 && ay==5)) {
            System.out.println("Boga");
        }
        System.out.println();
        System.out.println();
        System.out.println();






    }
}
