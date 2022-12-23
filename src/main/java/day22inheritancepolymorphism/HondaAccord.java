package day22inheritancepolymorphism;

public class HondaAccord extends  Honda{

    /*
    1)Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir Cosntructor verir, cunku Java , Class`in
    bir kalip oldugunu ve Object olusturmak icin yaratildigini ve Object olusturmak icin Constructor`in sart oldugunu bilir.

    2)Java`nin otomatik olarak olusturdugu bu gorunmez Constructor`a "Default Constructor" denir.

    3)Siz kendiniz herhangi bir Constructor olusturdugunuzda Java "Default Constructor" i siler.

    4)Bir Class`da birden fazla Constructor olabilir. Fakat bu Constructor`larin parametreleri farkli olmalidir.

    5)"this" keyword "Bu Class" anlamindadir. "this.price" demek bu Class`daki "price" isimli variable demektir.
       "this.price" syntax`i Constructor`larin icinde kullanilir.

       6)Constructor kullanarak variable`lar uzerinde yaptihiniz degisimler sadece Object uzerindeki degerlerini degistirir.
       Class`daki variable degerlerini degistirmez..
     */
public int price;
public int year;
public String make;
public String model;

    public HondaAccord(){

    }

public HondaAccord(int price){this.price=price;}

    public HondaAccord(int price,int year){
        this.price=price;
        this.year=year;
        System.out.println("Honda Accord Constructor");
    }
    public HondaAccord(int price,int year,String make, String model){
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;
    }
}
/*
Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir Constructor verir.
Cunku Java Class`in bir kalip oldugunu ve Object olusturlmak icin yaratildigini ve Object olusturmak ici Constructor`un
sart oldugunu bilir.

Java`nin otomatik olarak olusturdugu  bu gorunmez Constructor`a default Constructor denir.

Siz kendiniz herhangi bir Consturctor olusturdugunuzda Java Default Constructor`u siler.

Bir Class`da birden fazla Constructor olabilir.

Bir Class`da birden fazla Constructor olabilir. Fakat bu Constructor`larin parametre`leri farkli olmalidir.

"this" keyword bu Class anlamindadir."this.price" demek bu Class`daki "price" isimli variable demektir.

"this.price" syntax`i Constructor`un icinde kullanilir.

Constructor kullanarak variable uzerinde yaptigimiz degisimler sadece Object uzerindeki variable`larin degerlerini degistirir.
Class`daki variable degerlerini degistirimez.
 */