package day21accessmodifiersinheritance;

public class AnimalRunner {
    public static void main(String[] args) {
/*
"Inheritance" sayesinde
i)Kod tekrarlarinda kurtuluruz o
ii)Kod tamiri(maintenance) kolay olur
iii)Child Class`lari daha atomic yapmis oluruz.

2)Bir Class`i baska bir Class`in Child Class`i yapmak icin
"extends" keyword kullanilir. Ilk yazilan Child Class, ikinci yazilan Class parent olur

3)Child Class object`leri Parent Class`dan method ve variable`lari kullanilabilir.

4)Parent Class object`leri Child Class`dan method ve variable`leri kullanamaz.

5)Object Class her Class`in parent`idir.
Java da Object Class`in haric her Class`in parent`i vardir.
Java da parent`i olmayan tek Class Object Class`dir.

6)"private" method ve variable`lar Child Class`lar tarafindan kullanilamazlar.
"protected" method ve variable`lar Child Class`lar tarafindan kullanilanilir..
"default" method ve variable`lar ayni package`deki Child Class`lar tarafindan kullanilabilir.
"public" method ve variable`lar Child Class`lar tarafindan kullanilabilir.

Note : Child Class`lar tarafindan kullanilabilir olmak "inherit" edilebilir demektir.
7)4 tip Inheritance vardir.
i)MultiLevel Inheritance : Java bunu kabul eder.
ii)Hierarchical Inheritance : Bir parent icin coklu child,Java bunu kabul eder.
iii)Multiple Inheritance : Bir Child`a coklu Parent , Java bunu desteklemz.(Java does not support Multiple Inheritance).
iv)Single Inheritance : Bir Child Class icin vir Parent Class demektir,Java bunu destekler.
 */
    Cat c1 =new Cat();

    c1.eat();
    c1.drink();
    c1.meow();
    c1.yeme();
    c1.icme();
    c1.miyav();

     Dog d1 = new Dog();
     d1.eat();
     d1.drink();
     d1.bark();
     d1.havlar();
     d1.yeme();
     d1.icme();

/*
Inheritance sayesinde:
Kod tekrarlarindan kurtuluruz.
Kod tamiri(maintenance)kolay olur.
Child Class`lari daha atomik yapmis oluruz.


2)Bir Class`i baska bir Class`in "Child Class" i yapmak icin "extends" keyword kullanilir. Ilk yazilan Class Child, ikinci
yazilan Class parent olur.

3)"Child Class" object`leri Parent Class`dan method ve variable`lari kullanabilirler.

4)Parent Class object`leri Child Class`dan method ve variable`lari kullanamazlar.

5)Object Class her Class`in parent`idir.Java`da Object Class haric her Class`in parent`i vardir.
Java`da Parent`i olmayan tek Class object Class`dir.

6)"Private" method ve variable`ler "Child Class" lar tarafindan kullanilamazlar.
"protected" method ve variable`ler "Child Class" lar tarafindan kullanilabilir.
"default" method ve variable`lar ayni package`deki "Child Class" lar tarfindan kullanilabilir.
"public" method ve variable`lar "Child Class" lar tarfindan kullanilabilir.

Not :"Child Class"lar tarafindan kullanilabilir olmak "Inherit edilebilir" demektir.

7)4 tip Inheritance vardir.
i)"MultiLevel Inheritance" Java bunu kabul eder.
ii)Hierarchical Inheritance" bir parent icin coklu child,Javva bunu kabul eder.
iii)"Multiple Inheritance" bir child`a coklu parent, Java bunu desteklemez.(Java does not support Multiple Inheritance)
iv)"Single Inheritance" bir Child Class`a  bir Parent Class demektir, Java bunu destekler.
 */

    }
}
