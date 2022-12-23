package day28abstraction;

public class Cat extends Mammal{


    /*
       Bir method Parent Class`da "abstract method" ise;
       Child Class o method`u override edip kullanmak zorundadir.Bu yuzden herhangi bir fonksiyonu "Child Class" icin mecburi
       yapamk isterseniz o method`u "abstract" yapmalisiniz.
     */

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");
    }
}
