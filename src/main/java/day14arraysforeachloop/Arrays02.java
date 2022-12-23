package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
//Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz.
        //   [2, 3, 12, 0,  0,  0]


   int original[]={0, 2, 3, 0, 12, 0};

   int yeni[]=new int[original.length];

   int idx =0;
   for (int i=0;i<original.length;i++){

       if (original[i]!=0){
           yeni[idx]=original[i];
           idx++;
       }
   }
        System.out.println(Arrays.toString(yeni));





//Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
//[2,1,2,-3,2]==> Kullanici 2`yi sordu==> 2 elamani var ve 3 kere tekrarlandi
//                Kullanici 6`yi sordu==> 6 elamani yok ve 0 kere tekrarlandi

   int arr[]={5,1,5,-3};
   int eleman= 5;

   int counter = 0;//"flag".Bazi durumlarin olup olmadigini kontrol etmek icin "flag" kullanilir.

   for (int w:arr){

       if (w==eleman){
           counter++;
       }


   }
if (counter>0){
    System.out.println(eleman +" array`de " + counter + " defa var");
}else {
    System.out.println(eleman + " array`da yok");
}

//Example 3 : Size verilen cumledeki en uzn kelimeyi bulunuz.
        //"Java kolaydir calisana,ne kolay ki calimayana"==>"calismayana"

String sentece="Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println(sentece);

sentece=sentece.replaceAll("\\p{Punct}","");
        System.out.println(sentece);

String words[] = sentece.split(" ");

Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));

        System.out.println(words[words.length-1]);

/*
YUKARIDAKILER HOCANIN CANLI DERSTE YAPTIKLARI ASAGIDAKILER BENIM TEKRARDA YAPTIKLARIM...................................
 */

 /*
 SORU 1: [0,2,3,0,12,0] sifirlari en sona koy.
         [2,3,12,0,0,0]
  */
      int orijinal[]={0,2,3,0,12,0};

      int neW[]=new  int[orijinal.length];

      int index =0;

        for (int i = 0; i<orijinal.length; i++){

            if (orijinal[i]!=0){
                neW[index]=orijinal[i];

                index++;
            }

        }
        System.out.println(Arrays.toString(neW));

/*
Soru 2:Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
[2,1,2,-3,2]==> Kullanici 2`yi sordu==> 2 elamani var ve 3 kere tekrarlandi
                Kullanici 6`yi sordu==> 6 elamani yok ve 0 kere tekrarlandi
 */


      int grr[]={2,1,2,-3,2};

      int eleman1=7;

      int counter1=0;//"flag"Bazi durumlarin olup olmadigini kontrol etmek icin "flag kullanilir."

      for (int w:grr){
          if (w==eleman1){
              counter1++;

          }

      }
        if (counter1>0){
            System.out.println(eleman1 +" array`de " + counter1 + " defa var.");
}else System.out.println(eleman1 + " array`da yok");


/*
//Example 3 : Size verilen cumledeki en uzn kelimeyi bulunuz.
        //"Java kolaydir calisana,ne kolay ki calimayana"==>"calismayana"
 */
String klm="Java kolaydir calisana, ne kolay ki calimayana";

klm = klm.replaceAll("\\p{Punct}","");
        System.out.println(klm);
String newKlm[] =klm.split(" ");
        System.out.println(Arrays.toString(newKlm));
Arrays.sort(newKlm,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(newKlm));


        System.out.println(newKlm[newKlm.length-1]);
    }
}
