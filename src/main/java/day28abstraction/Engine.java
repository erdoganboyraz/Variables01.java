package day28abstraction;
/*
    1)Atomic olsun diye "Parent" i parcaladim ama bir "Child Class" in birden fazla "Parent" i oldu. Bu ise Java`da mumkun degildir.
      Cunku Java "Multiplle Inheritancce" i desteklemez.
      "Multiple Inheritance" Class`larda mumkun degildir. Fakat Java "interface" isimli yeni bir yapi olsuturdu. Bu yapida
      "Multiple Inheritance" ye musade etti.

    2)"Interface" lerdeki tum method`lar "abstract" oldugu icin "interface" lere "fully abstraction" denir. "abstract class" larda
      "abstract method" ve "concrete method" bir arada kullanildigi icin "Abstract class" lara "fully abstraction" denmez.


     */
public interface Engine {


//interface`lerdeki tum method`lar "abstract" olmak zorundadir.

//interface`lerde abstract method olustururken "abstract"  keyword kullanmaya gerek yoktur. Cunku Java o method`un abstract oldugunu bildirir.

//interface`lerdeki tum method`lar Java tarafindan otomatik olarak "public" kabul edilir, bu yuzden o method`lar icin "public" yazmaya gerek yoktur.

//"public void eco();" ile "void eco();" ayni anlama gelir.

//
    void eco();

    void gas();

    void tsi();

    //"default" keyword kullanarak interface`lerin icinde body`si olan method`lar uretebilirsiniz.
    //Asagidaki "non-static method" dur.
    public default int add(int a,int b){
        return a+b;
    }
    //"static" keyword kullanarak interface`lerin icinde body`si olan method`lar uretebilirsiniz.
    //Asagidaki method "static method" dur
    public static String update(String str){
        return str+"!";
    }
}
