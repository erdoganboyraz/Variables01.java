package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {

/*
   1)StringBuilder Java`da bir Class`dir.
   2)StringBuilder, String olusturmaya yarar.
   3)"String" Class varken nicin StringBuilder`a ihtiyac duyariz?
   Cunku "String" Class "Immutable Class" dir, aa biz bazen "Mutable" "String" lere ihtiyac duyariz.
   StringBuilder bize "Mutable" String verir.
   4)"Immutable Class" larda var olan deger degistirilemez. Siz varolan bir degeri degistirmek istediginizde;
    i)Memory`de yeni bir variable yeni degerle olusturulur.
    ii)Eski variable`nin pointer`i yeni variable`a dondurulur.
    iii)Eger bir variable`i hicbir pointer gostermiyorsa o variable "Garbage Collector" tarafinda silinir.

    "Mutable Class" larda var olan deger degistirilebilir. Orjinal deger korunmaz.
5)"String Class" larin "Immutable" yapisi "security" icin onemlidir.
   Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni degere sahip String`lerin bu container
   kullanmasini temin eder. Bu memory`i kullanmak icinm iyidir,ancak container`deki degeri bir varible icin degistirdigimizde
   tum variable`larin etkilenmesi tehlikesi vardir. Bu tehlideken kurtulmak icin Java String`leri "Immutable (degismez)" yapmistir. Fakat
   herhangi bir variable`nin degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni container olusturur
   ve variable`nin pointer`ini yeni variable`a yonlendirir. Boylelikle hem degisim saglamis hem de digerleri etkilenmemis olur.
*/

String str = "Java";
str="Super Java";
System.out.println(str);

//StringBuilder nasil olusturur?
//1.Yol :
StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);

//2.Yol :
StringBuilder  strb2 = new StringBuilder();
//Yol a :
strb2.append("Java");
strb2.append(" is easy");
strb2.append("!!!");
System.out.println(strb2);//Java
//Yol b :
strb2.append(" Learn").append(" Java earn").append(" money.");//Method Chain
        System.out.println(strb2);

//StringBuilder`larda character sayisi nasil bulunur.==>length() method`u ile bulunur.

StringBuilder strb3 = new StringBuilder();
strb3.append("Car");
strb3.append("xxxxxxxxxxxxxxx");

int numbOfChar= strb3.length();//3,18
        System.out.println(numbOfChar);
//Capacity asimlarinda capacity var olanin iki katinin iki fazlasina cikar
int capacity1 =strb3.capacity();
        System.out.println(capacity1);//16,34

strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
int capacity2 = strb3.capacity();
    System.out.println(capacity2);//70==>34*2+2

//setCharAt(2,'r'); ==>Index 2`deki character`i "r" ye cevirir.
    strb3.setCharAt(2,'r');
        System.out.println(strb3);//Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

    //delete(3,18);==> Index 3(dahil) de index 18(haric) e kadar tum character`leri siler.
        strb3.delete(3,18);
        System.out.println(strb3);//Carmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

    //deleteCharAt(2);==?Index 2`deki character`i siler.
     strb3.deleteCharAt(2);
        System.out.println(strb3);//Cammmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

    //reverse(); method`u StringBuilder`i ters cevirir. Ali=>ilA
    //"mutable" larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir.
     strb3.reverse();
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

    //"Immutable" larda orijinal degeri degistrimek icin mrthod`u kullanmak yeterli olmaz bir de "atama islemi" yapmalisiniz.
     String abc ="Java";
     abc = abc.replace("a","i");
        System.out.println(abc);//Jivi

     //toString() method`u StringBuilder`lari String`e cevirir.
      String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

     //String`den de StringBuilder`a  asagidaki gibi gecebilirsiniz.
    StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

     //(3,"XXXX"); 3. character`den sonra "XXXX"leri koyar.
    strb4.insert(3,"XXXX");
        System.out.println(strb4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

    //(3,"KLMOPQRSTU",5,8);==>3. character`den sonra "KLMOPQRSTU" String`inin index 5, 6, 7`deki character`lerini yerlestirir.
    strb4.insert(3,"KLMOPQRSTU",5,8);
        System.out.println(strb4);//mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

     StringBuilder a = new StringBuilder("Iava");
     StringBuilder b = new StringBuilder("Java");

     //compareTo()method`u i)StringBuilder`lar tamamiyle ayni ise 0 verir.
       //                  ii) "a" alfabetik sirada "b"den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir.
        //                 iii) "a" alfabetik sirada "b"den sonra gelirse negatif olarak aradaki alfabetik siralama farkini gosterir.
     int sonuc = a.compareTo(b);
        System.out.println(sonuc);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
/*
YUKARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAKI BENIM DERS TEKRARIM
 */

     /*
     1)"StringBuilder" Java bir Class`dir.
     2)"StringBuilder", String olusturmaya yarar.
     3)"String" Class varken nicin "StringBuilder"a ihtiyac duyariz.

     Cunku "String" Class "Immutable Class" dir, ama biz bazen "mutable" String`lere ihtiyac duyariz.
     "StringBuilder" bize "Mutable" String verir.

     4)"Immutable Class"larda var olan deger degistirilemez. Siz var olan bir degeri degistirmek istediginizde
        i) Memory`de yeni bir variable yeni degerle olusturulur.
        ii)Eski variable`in pointer`i yeni variable`a dondurulur.
        iii)Eger bir variable`i hicbir pointer gostermiyorsa, o variable "Garbage Collector" tarafindan silinir.

        "Mutable Class"larda var olan deger degistirilebilir. Orijinal deger korunmaz.

        5)"String Class" larin "Immutable" yapisi "security" icin onemlidir.
           Ayni degere sahip birden fazla String oldugunda Java bir tane container olusturur ve ayni degere sahip String`lerin bu container`i
           kullanmasin temin eder. Bu memory`i kullanmak icin iyidir. Ancak container`deki degeri bir variable `icin degistirdigimizde
           tum variable`lerin etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java String`leri "Immutable(Degismez)" yapmistir.
           Fakat herhangi bir variable`in degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir
           container olusturur ve variable`in pointer`ini bu yeni variable`a yonlendirir. Boylelikle hem degisim saganmis hem de digerleri etkilenmemis
           olur.
      */
      String string = "Java";
      string = "Super Java";
        System.out.println(string);
     //StringBuilder nasil olusturulur?

      StringBuilder stringBuilde1 = new StringBuilder("Java");
        System.out.println(stringBuilde1);

    //2.yol

     StringBuilder stringBuilde2 = new StringBuilder();
    //Yol a :
     stringBuilde2.append("Java");
     stringBuilde2.append(" is easy");
     stringBuilde2.append("!!!");
        System.out.println(stringBuilde2);//Java is easy!!!

    //Yol b :

      stringBuilde2.append(" Learn").append(" Java earn").append(" money.");//Method Chain
        System.out.println(stringBuilde2);//Java is easy!!! Learn Java earn money.

      //StringBuilder`larda character sayisi nasil bulunur.==>length() method`u ile bulunur.

      StringBuilder stringBuilde3 = new StringBuilder();
      stringBuilde3.append("Cat");
      stringBuilde3.append("xxxxxxxxxxxxxxx");

     int karakterSayisi = stringBuilde3.length();
        System.out.println(karakterSayisi);//3

      //Capacity asimlarinda capacity var olanin iki katinin iki fazlasina cikar.
     int kapasite = stringBuilde3.capacity();
        System.out.println(kapasite);//16

     stringBuilde3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmm");
     int kapasite1 = stringBuilde3.capacity();
        System.out.println(kapasite1);//70

        //setCharAt(2,'r');Index 2`deki character`i "r" ye cevirir.
     stringBuilde3.setCharAt(2,'r');
        System.out.println(stringBuilde3);//Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //delete(3,18);==> Index 3(dahil) index 18(haric) e kadar tum character`leri siler.
     stringBuilde3.delete(3,18);
        System.out.println(stringBuilde3);//Carmmmmmmmmmmmmmmmmmmmmmmmmmmm

     //deleteCharAt(2);==>Index 2`deki character`i siler.
     stringBuilde3.deleteCharAt(2);
        System.out.println(stringBuilde3);//Cammmmmmmmmmmmmmmmmmmmmmmmmmm

        //reverse();==> method`u StringBuilder`i ters cevirir.
    stringBuilde3.reverse();
        System.out.println(stringBuilde3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmaC


    //"mutable"larda sadece method kullanmak orijinal degeri degistirmek icin yeterldir.
    //"Immutable" larda orijinal degeri degistirmek icin method`u kullanmak yeterli olmaz bir de "atama islemi" yapmalisiniz.

     String def ="Java";
      def =  def.replace("a","i");
        System.out.println(def);//Java//Jivi

     //toString()method`u StringBuilder`lari String`e cevirir.
    String stringStringBuild1 = stringBuilde3.toString();
        System.out.println(stringStringBuild1);//mmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //String`den de StringBuilder`a asagidaki gibi donebilirsiniz.
     StringBuilder stringBuilde4 = new StringBuilder(stringBuilde3);
        System.out.println(stringBuilde4);//mmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3,"XXXX");==>3. character`den sonra "XXXX" leri koyar.
     stringBuilde4.insert(3,"XXXX");
        System.out.println(stringBuilde4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3,"KLMOPQRSTU",5,8);==> 3. character`den sonra "KLMOPQRSTU" String`inin index 5,6,7 deki character`lerini yerlestirir.
     stringBuilde4.insert(3,"KLMOPQRSTU",5,8);
        System.out.println(stringBuilde4);//mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmmaC

      StringBuilder c =new StringBuilder("Java");
      StringBuilder d =new StringBuilder("Java");
//c.compareTo(d) method`u i)StringBuilder`lar tamamiyle ayniysa 0 verir.
//                       ii)a alfabetik sirada b`den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir.
//                      iii)a alfabetik sirada b`den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir.
      int compareTo =  c.compareTo(d);
        System.out.println(compareTo);//0
    }
}
