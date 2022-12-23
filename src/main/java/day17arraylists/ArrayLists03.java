package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {


  //Example 1 : Bir List`deki elemanlardan birbirine en yakin olan ikisini bulunuz.
  //            [12,19,30,15,21] ==> 19 ve 21

        List<Integer>a=new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);
        Collections.sort(a);//List`deki elemanlari kucukten buyuge dizebilmek icin kullanilir.
        System.out.println(a);

  int minFark=Integer.MAX_VALUE;


   for (int i=1;i<a.size();i++){

       minFark = Math.min(minFark,a.get(i) - a.get(i-1));

   }
        System.out.println(minFark);





/*
DERS TEKRARI
 */

//Soru 1 : Bir List`deki elemanlardan birbirine en yakin olan ikisini bulunuz.
        //            [12,19,30,15,21] ==> 19 ve 21

        List<Integer>e=new ArrayList<>();
        e.add(12);
        e.add(19);
        e.add(15);
        e.add(30);
        e.add(21);
        System.out.println(e);
        Collections.sort(e);//List`deki elemanlari kucukten buyuge dizebilmek icin kullanilir.
        System.out.println(e);

        int minFarki=Integer.MAX_VALUE;


        for (int i=1;i<e.size();i++){

            minFarki = Math.min(minFarki,e.get(i) - e.get(i-1));
            System.out.println(minFarki);

        }
        System.out.println(minFarki);












    }
}
