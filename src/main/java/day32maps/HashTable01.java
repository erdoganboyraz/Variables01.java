package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
    1)HashTable bir map`dir.
    2)HashTable entrySet`leri herhangi bir siralamaya tabi tutmaz.
    3)HashTable HashMap`lerden daha yavastir. Cunku HashTable`ler thread-safe ve synchronized`dir.
    4)Hashtable`lerde key null olamaz.Key`i null yaparasaniz NullPointerException atar.
    5)Hashtable`lerde value null olamaz.Value`yu null yaparsaniz NullPointerException atar.

    HashMap ile HashTable arasindaki 2 fark?

    1)Hashtable thread-safe ve synchronized calisir. HashMap rastgele siralar.Bu yuzden HashMap hizli Hashtable yavastir.
    2)Hashtable null`i hem key`de hem de value`de kullanamaz hata verir. HashMap ise null key`de ve value`de de kullanir.

     Note : toString() method`u objeleri console`de detaylari ile gorebilmek icin class`larin icinde olusturulur.
            toString() method`unu olusturmadan object`i console`e yazdirirsaniz Java o objenin adresini yazdirir.

    //Su ana kadar map`lerde Java`nin olusturdugu Class`lari kullandik. Asagidaki ornekte gordugumuz gibi kendimiz bir class olusturup icindekilere
    eklemeler yaptik.

    //Kendi Class`larimizi Java Class`lari gibi kullanabiliriz. toString() method`u varsa bir Class`da olusturdugumuz objeleri istedigimiz formatta
    yazdiririz . toString olmazsa obje`nin Stack memory`deki reference`ni gorurduk.
     */

    public static void main(String[] args) {

        Hashtable<String,Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",83000000);
        countryPopulations.put("Turkey",90000000);

        System.out.println("countryPopulations = " + countryPopulations);

        //countryPopulations.put(null,90000000);//Hashtable`lerde key null olamaz.NullPointerException atar.
        //countryPopulations.put("France",null);//Hashtable`lerde value null olamaz.NullPointerException atar.

        Hashtable<String,Students> myStudents = new Hashtable<>();

        myStudents.put("Math",new Students("Tom Hanks","th@gmail.com",21,true));//{Math=[name='Tom Hanks', email='th@gmail.com', yas=21, success=true],
        myStudents.put("Science",new Students("Mary Star","ms@gmail.com",32,false));//Science=[name='Mary Star', email='ms@gmail.com', yas=32, success=false]}

        System.out.println("myStudents = " + myStudents);



        String name = myStudents.get("Math").name;
        System.out.println("name = " + name);//name = Tom Hanks

        int age = myStudents.get("Math").age;
        System.out.println("age = " + age);//age = 21


    }
}
