package day29abstractioncollection;

public class Civic implements Engine,Ac{

    /*
Interface`lerde method`lar abstract oldugu icin method body olmaz. Bu yuzden Interface`leri Parent-Child class yapip ayni simde 2 method yazdigimizda
Java sikayet etmez. Cunku method body`sinde bir seyler olmadigi icin method override edildiginde method`un icine kendi istedigini yapacagi icin
sorun olmaz. Lakin bu abstract method`lar icindir. Concrete method`larda bu olamaz. Cunku conrete method`larda method body vardir.

Interface`de method`lari olustururken ayni isme abstract method olusturabiliriz. Lakin return type`i ayni olmak zorundadir. Farkli olursa Java hata verir.
Bu yuzden ayni isimden method yaparsak return type ayni olan bir method olusturmak zorundayiz. Bu yuzden ayni isimli farkli return type sahip
method olusturamazyiz.

Interface`lerde variable olusturabiliriz. Bu variable`ler otomatik olarak "public" dir. Bu yuzden farkli bir access modifier atayamayiz. Hata verir.
Ayrica bu variable`ler otomatik olarak(default) olarak "final" dir. Son olarak bu variable`ler otomatik olarak(default) olarak "static" dir.

2 farkli "interface" de olusturdugumuz ayni isimde olusturdugumuz variable`i bir Class`da bu iki ayni isimli variable`i calistirir. Hatta ayni
degerleri atasak dahi calisir.(Runner isimli Class`da Interface`in ismiyle cagirdik. Ikiside ayni isimli oldugu halde yazdirdi). Bunlari Java karistirmaz
Java. Cunku ikisinide ayri bir Interface`den cagirdimiz icin. Ayrica farkli data type`larinda ayni isimle cagirsak bile Java hata vermez.

Interface`lerde constructor olmadigi icin OBJECT olusturamayiz

    "abstract method" lar sadece ne yapilacagini soyler(what to do).
    "concrete method" lar ne yapilacagi ile birlikte nasil yapilacaginida soyler(how to do).

    "interface" lar bir yapilacak isler listesidir(To do list).

    "multiple parent interface" kullandigimizda ayni method ismi ile birden fazla method olusturursaniz, bu method`larin return type`lari
    ayni olmalidir. Aksi takdirde hata verir.

    Interface`lerde constructor olmadigi icin "interface" lerden object olusturulamaz.
    "abstract class" larda Class olduklari icin constructor vardir. Ama constructor`lar "abstract class" larda object olusturamazlar.


    Soru : "Abstract Class" ile "Interface" arasindaki farklar nelerdir?
       1)Method;
                "Abstract Class" hem abstract hem de concrete method`lar icerebilir.
                "Interface" ler ise sadece abstract method`lar icerir.
                Ama istersek interface`ler icinde de "default" ve "static" keyword`ler kullanarak concrete method`lar olusturabilirz.

       2)Variable;
                  "Abstract Class" larda normal Class`lardaki gibi her turlu variable olusturulabilir.
                  "Interface" lerde ise variable`ler "public" "static" ve "final" olmak zorundadir.

       3)Inheritance;
                     "Abstract Class" lar Class olduklari icin "multiple inheritance" e musade etmezler.
                     "Interface" ler ise "multiple inheritance" i desteklerler.

       4)Object Creation;
                     "Abstract Class" da "constructor" vardir ama object olusturmada kullanilmazlar.
                     "Interface" lerde ise "constructor" olmadigindan object olusturulmaz.

   Soru : Object-Oriented-Programing-Language prensipleri nelerdir?
          i)Inheritance  ii)Polymorphism  iii)Encapsulation  iv)Abstraction

     */



    @Override
    public void run() {
        System.out.println("Civic runs well");


    }
}
