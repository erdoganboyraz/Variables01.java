package day16multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
/*
Interwiew sorusu ===Array'lerin sinirliliklari?===Ekleme cikarma yapamazsiniz
 */

/*
ArrayList`ler ayni data type`ine sahip birden fazla data`yi depolamak icin kullanilir.
Array ile ArrayList`in farki?
1)Array olustururken Array`in icine kac tane eleman koymamiz gerektigini soylemeliyiz,soyledigimiz eleman sayisindan fazla eleman koyamayiz.
Array`ler eleman sayisinda "fixed" dirler.
ArrayList`leri olusturken eleman sayisini soylemeye gerek yok.Cunku ArrayList`ler eleman sayisinda "flexible(esnek)" dirler.
2)Array`lerin icine "primitive" ve "reference"ler konabilir.
ArrayList`lerin icine ise "non-primitive"ler konulabilir.
3)Array`ler super fast yani cok hizlidir.Array`ler memory`i cok az kullanir.

Note:Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz.Ama eleman sayisi degisken olan coklu
datalar icin Array kullanma riskini almayin.
 */

//ArrayList nasil olusturrlur.
        //1.yol
        ArrayList<Integer> ages= new ArrayList<Integer>();

        //2.yol
        ArrayList<Integer> heights= new ArrayList<>();

        //3.yol
        List<Integer> nums= new ArrayList<>();

    //ArrayList`ler nasil yazdirilir.

        System.out.println(nums);//[]

    //ArrayList`lere nasil eleman eklenir.
   //aad() her zaman elemani en sona ekler. (insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);//[21, 18, 20]

        nums.add(1,50);
        System.out.println(nums);//[21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);

        System.out.println(nums);//[21, 50, 18, 20, 23, 185]

        nums.addAll(2,prices);
        System.out.println(nums);//

    //ArrayList`lerin eleman sayisi nasil bulunur.

        int elemanSayisi =nums.size();
        System.out.println(elemanSayisi);//8

    //ArrayList`lerde herhangi bir eleman nasil secilir.

     //get() method`u istenen bir index`deki elemani verir.
    int eleman1 = nums.get(3);
    System.out.println(eleman1);

   //ArrayList`in bos olup olmadigini nasil anlariz.
    boolean bos1 = nums.isEmpty();
    System.out.println(bos1);

    boolean bos2 = ages.isEmpty();
    System.out.println(bos2);

     //ArrayList`de bir eleman nasil degistirilir.

      nums.set(3,200);
        System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]

//Example 1 : nums ArrayList`indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        for (int w :nums){
            if (w%2!=0){
            nums.set(nums.indexOf(w),w+11);
               // System.out.println(nums.get(nums.indexOf(w+11))); Burada sadece tek sayilarin artmis halini yazdirdik.

            }
        }
        System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]

//remove() method`unun icene tamsayi koyarsaniz Java onu index olarak kabul eder.

//Example 2 :ArrayList`den 34 elemanininin ilk gorunumu  silinz.
/*
Note : Tum tamsayilar Java icin aksi soylenmedikce "primitive"dir.Yani "int" olur.
Note 2 :"Primitive"ler ArrayList`lerin elemani olamazlar.
Note 3 : "Primitive" i wrapper class`a cevirirseniz, "non-primitive" olur ve "non-primitive"ler ArrayList`lerin elemani olur,index olamaz.
 */
        Integer sayi =34;
      nums.remove(sayi);

      //nums.remove(new Integer(200));bunu burdan cikarinca Integer`in ustu cizili olur.
        // Bu eskiden kullaniyordu.Hala kullaniliyor.Ama artik kullanilmasini istemiyor.
        // Yakinda kaldiralacak demek.Ustu cizili integer.
        System.out.println(nums);//[32, 50, 200, 18, 20, 34, 196]



/*
YUKARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAGI BENIM DERS TEKRARI YAPTIGIMDA YAZDIKLARIM YERLER.
 */

     /*
     ArrayList`ler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir.

                                   Array ile ArrayList`in Farklari

      1)Array olustururken Array`in icine kac tane eleman koymamiz gerektigini soylemeliyiz ve soyledigimiz eleman sayisindan fazla eleman koyamayiz.
        Array`ler eleman sayisinda "fixed" dirler.

        ArrayList`leri olustururken eleman sayisi soylemeye gerek yok.Cunku ArrayList`ler eleman sayisinda "flexixle(esnek)" dirlar.

        2)Array`lerin icine "primitive" ve "reference" ler konabilir.

        ArrayList`lerin icine ise sadece "non-primitive"ler konulur.

        3)Array`ler "super-fast(cok-hizli)" dir.Array`ler memory`i cok az kullanir.

        Note : Eleman sayisi kesin belli olan coklu data`lari depolamak icin Array kullaniriz, ama eleman sayisi degisken
               olan coklu data`lar icin Array kullanma riskini almayin.
      */

        //ArrayList nasil olusturulur.
        //1.yol
        ArrayList<Integer> yas = new ArrayList<Integer>();

        //2.yol
        ArrayList<Integer> uzunluk = new ArrayList<>();

        //3.yol
        List<Integer> numaralar = new ArrayList<>();


        //Yukaridaki yollardan genellikle 2. ve 3. yol kullanilir. 3.yol daha kisa oldugu icin 3. yol kullanilir.


        //ArrayList`ler nasil yazdirilir.
        System.out.println(numaralar);//[]

        //ArrayList`lere nasil eleman eklenir.
        //add()method`u her zaman elemani en sona ekler. ( insertion order)

        //add()method`u boolean return eder."True" demek gorev tamamlandi demek."False" demek yerlestirilemedi demek.

        numaralar.add(21);
        numaralar.add(18);
        numaralar.add(20);
        System.out.println(numaralar);//[21, 18, 20]

        //add()method`unda icinden void yazanda hic bir sey return etmez.

        numaralar.add(1,50);
        System.out.println(numaralar);//[21, 50, 18, 20]


        List<Integer> fiyatlar =new ArrayList<>();
        fiyatlar.add(23);
        fiyatlar.add(185);


      numaralar.addAll(fiyatlar);
        System.out.println(numaralar);//[21, 50, 18, 20, 23, 185]
        System.out.println(fiyatlar);//[23, 185]

        numaralar.addAll(2,fiyatlar);
        System.out.println(numaralar);//[21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList`lerin eleman sayi nasil bulunur.

        int elemansayisi1=numaralar.size();
        System.out.println(elemansayisi1);//8


        //ArrayList`ler de herhamgi bir eleman nasil secilir.

        //get()method`u istenen bir index`deki elemani verir.
      int eleman11 =  numaralar.get(3);
        System.out.println(eleman11);//185



      //ArrayList`in bos olup olmadigini nasil anlariz.

      boolean emptyMi =numaralar.isEmpty();
        System.out.println(emptyMi);//false
        boolean emptyMI=yas.isEmpty();
        System.out.println(emptyMI);//true


//ArrayList`te bir eleman nasil degistirilir.

      numaralar.set(3,200);
        System.out.println(numaralar);//[21, 50, 23, 200, 18, 20, 23, 185]


        //Example 1: numaralar ArrayList`indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        for (int w:numaralar){

            if (w%2!=0){
              numaralar.set(numaralar.indexOf(w),w+11);
//                System.out.println(numaralar.get(numaralar.indexOf(w+11))); sadece degisen elemanlari yazdirdirdik
            }

        }System.out.println(numaralar);

//remove()method`un icine tamsayi koyarsaniz Java onu index olarak kabul eder.
        //Ustu cizili bir sey gorursek Java bunu suan da kullaniyor ama yakinda kaldiracak demektir.Kullanma demek istiyor Java.
        //Example 2 : ArrayList`den 34 elemanini ilk gorunumunu siliniz.
        //Note 1 : Tum tam sayilar Java icin aksi soylenmedikce primitive`dir,yani "int"dir.
        //Note 2 : "Primitive"ler ArrayList`lerin elemani olamazlar.
        //Note 3 : "Primitive"i "Wrapper Class"a cevirirseniz, "non-primitive" olur ve "non-primitive"ler ArrayList`lerin elemani olur,index olamaz.
        Integer sayii=34;
        numaralar.remove(sayii);
        System.out.println(numaralar);






}
}
