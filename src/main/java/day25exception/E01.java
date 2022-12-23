package day25exception;

public class E01 {
    /*
       1) "Exception" (istisnai hata) Java`da kodlarimizi calistirirken meydana gelen beklendmedik durumlardir.
       2) Exceprtion ile calismanin iki yolu vardir.
          a) try-catch block kullanma ve exception olussa bile calismayi devam ettrime
          b) throw exception kullanarak  calismayi  durdurma(yazdigimiz kod geregi bir dosya uzerinden okuma yapmamiz gerekiyor
          ise bu dosyamiz eger silinmisse Java dosyayi bulamaz uygulamanin devam etmesi gerekmez).
       3) Eger exception`i handle etmez  isek (sorunu halletmezsek) Java calismayi durdurur.
       4) try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz.
       5)try catch olmaksizin yalniz kullanilamaz.
       6) Eger yazmis oldugumuz herhangi bir kod satirinda problem olabilecegini dusunuyorsak try-catch block icine koymalisiniz.
       7) catch block parantezi icerisine olmasi muhtemel exception Class ismi yazilir.
       8)e.getMessage(); method`unu kullanarak teknik mesajlar elde edebilirz.
         System.out.println(); burada yzmis oldugum mesajlar benim teknik olmayan aciklamalarimdir.
         e.printStackTrace();method`u  Exception ile ilgili detaylica teknik mesaj verir kod calismaya devam eder.
         System.err.println();  hata mesajini renkli olarak verir , bu sayede konsolda diger mesajlardan ayirmak icin kullaniriz.
       9) Eger try body icindeki sorunsuz calirsa catch blok devereye girmez.

     */
    public static void main(String[] args) {

//    divide(6,2);
//    divide(0,2);
//    divide(6,0);//Matemetikte bir sayi "0" ile bolunemez.

        divide2(5,0);
        divide2(12,3);

    }
    //1.Yol bu yol tavsiye edilmez.
    //Bir devopler icin tum matematik kurallarini ezbere bilmek mumkun degildir.
    public static void divide(int a, int b){
        if (b==0) {
            System.out.println("Bir sayi '0' ile bolunemez.");
        }else {
            System.out.println(a / b);
        }
    }
//2.Yol try-catch kullanarak exception`i handle etmek tavsiye edilir.
    public static void divide2(int a,int b){

       try {
           System.out.println(a/b);
           System.out.println("Hi exception");
           System.out.println("Bye exception");
       }catch (ArithmeticException e){
           System.out.println("Bolme isleminde bir problem olustu==>"+e.getMessage());
           e.printStackTrace();
           System.err.println("Bolme isleminde bir problem olustu");
       }

/*
Java matemetik ile ilgili karilasilmasi muhtemel tum istisnalari , hatalari ArithmeticException Class`ina koymustur.
Matematikdeki tum istisnalari bilmek zorunda degiliz.
 */
    }



}
