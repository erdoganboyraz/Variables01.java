package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Example : Iterators kullanarak List elemanlarini tersten console`a yazdiriniz.


        ListIterator<String> itr = myList.listIterator();

//hashNext() method`u pointer`dan sonra eleman varsa "true" yoksa "false" return eder.
//next()methodu ise pointeri bir sonraki elemanin onune koyar ve ustunden atladigi elemani return eder
        while (itr.hasNext()){
            itr.next();
        }
//hashPrevius() method`u pointer`dan once eleman varsa "true" yoksa "false return eder.
//previous() method`u pointer`i bir onceki elemanin sonuna koyar ve ustunden atladigi elemani return eder.

        while (itr.hasPrevious()){//itr.hasPrevious() senden once eleman var mi diye sorar.

           String el = itr.previous();

            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println(myList);
//Example 2 : List`teki tum elemanlari siliniz.

      while (itr.hasNext()){

          itr.next();
          itr.remove();

      }
        System.out.println(myList);

      /*
      ListIterator da i)hasNext() ii)next() iii)hasPrevious() iv)previous() v)set() vi)remove method`lari vardir.
      Iterator da i)hasNext() ii)next iii)remove method`lari vardir.
       */


        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");
//Eger iki tarafli haraket etmek istemiyorsan Iterator
//Eger list elemanlarinin degistirilmesini istemiyorsak Iter
//Eger sadece silmek istemiyorsani Iterator
        Iterator<String> iterator = yourList.listIterator();

        while (iterator.hasNext()){

            String el = iterator.next();
            System.out.print(el + " ");
        }








    }
}
