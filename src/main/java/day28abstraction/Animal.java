package day28abstraction;

public abstract class Animal {

    //body`si olmayan method`lar "abstract method" olarak adlandirilirlar.
    //Bir method`u abstract yapmak icin i)method body`i sil ii)abstract keywrod`u kullan.
    //"abstract method" lar "abstract class" icinde olmalidir.
    //
    public abstract void eat();

    //"abstract class" larda hem "abstract(soyut)" hem de "concrete(non-abstract(somut))" method kullanilabilir.
    public void drink(){
        System.out.println("Animals drink");
    }
    //abstract "move" method olusturunuz.

    public abstract void move();

}
