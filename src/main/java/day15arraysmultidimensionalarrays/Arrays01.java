package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

    /*binarySearch() Method: Bu method`u kullanarak bir elamanin Array`de olup olmadigini anlariz.
    binarySearch() method`unu kullanmadan once mutlaka  Arrays.sort() kullanilmalidir.
    binarySearch() Method`u aradiginiz elaman array`da varsa o elamanin index`ini return eder.
    binarySearch() Method`u aradiginiz eleman Array`de yoksa "-a"seklinde bir negatif sayi alirsiniz.
    Bu sayidaki "-" isaretinin anlami bu elamanin Array`de yok demektir, "a"nin anlami olsaydi kacinci sirada olurdu demektir.
    binarySearch() Method`u  tekrarlayan elamanlar icin kullanilmaz.
        */
        int arr[]={12,31,43,14};


        int sayi=12;

    Arrays.sort(arr);
int idx1=Arrays.binarySearch(arr,sayi);//Ana kodun icine deger yazmamaya calisiriz.Ana kod yazildiktan sonra degistirimez.
        System.out.println(idx1);
int sayi1=17;
int sonuc = Arrays.binarySearch(arr,sayi1);
        System.out.println(sonuc);//Burada "58" sayisini koyunca-5 gorduk.Buradaki "-" eleman yok demek.
                                  // Buradaki "5" sayisi ise olsaydi hangi sirada olurdu.





/*
YUKARIDAKI HOCANIN CANLI DERSTE YAPTIKLARI ASAGIDAKI BENIM TEKRARIM
 */


     /*
     binarySearch|()Method`u kullanarak bir elemanin Array`da olup olmadigini anlariz.
     binarySearch()Method`unu kullanmadan once mutlaka "Arrays.sort()"kullanilmalidir.
     binarySearch()Method`u aradiginiz eleman Array`de varsa o elemanin index`ini return eder.
     binarySearch()Method`u aradiginiz eleman Array`da yoksa "-a"seklinde bir negatif sayi alirsiniz.
     Bu sayidaki "-" isaretinin anlami bu eleman Array`da yok demektir,"a"nin anlami olsaydi kacinci sirada olurdu demektir.

     //binarySearch()Method`u tekrarlayan elemanlar icin kullanilmaz.

      */

     int krr[]={15,35,7,44};
     int num= 7;
        Arrays.sort(krr);
        int result = Arrays.binarySearch(krr ,num);
        System.out.println(result);

     int sayi6=9;
     int idx2=Arrays.binarySearch(krr,sayi6);
        System.out.println(idx2);//-2

















    }
}
