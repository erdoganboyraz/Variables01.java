package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {
    public static void main(String[] args) {

  //Example 1 : Verilen bir List`deki elemanlari tekrarsiz olarak yaziniz.
  //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List <Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

    List <Integer> newList = new ArrayList<>();


    for (Integer w: a){
        if (!newList.contains(w)){
            newList.add(w);
        }
    }
        System.out.println(newList);//[2, 3, 5]


    //Example 2 : Kullanicidan bir harf aliniz. Harf sizdeki List`in icinde varsa o harfi "Bulundu" ya ceviriniz yoksa
        //o harfi List`e ekleyiniz. [A,K,R,S]==>R==>[A,K,Bulundu,S]
        //                          [A,K,R,S]==>X==>[A,K,R,S,X]
        Scanner input = new Scanner(System.in);
//        String harf = "";
//
//        List<String> c = new ArrayList<>();
//        c.add("A");
//        c.add("K");
//        c.add("R");
//        c.add("S");
//
//        do {
//            System.out.println("Lutfen bir harf giriniz");
//            harf = input.next().substring(0, 1);
//
//            if (c.contains(harf)) {
//                c.set(c.indexOf(harf), "Bulundu");
//            } else if(!harf.equals("Q")){
//                c.add(harf);
//            }
//            System.out.println(c);
//        }while(!harf.equals("Q"));




    /*
    YUKARIDAKI HOCANIN CANLI DERSTE YAPTIKLARI ASAGIDAKI BENIM DERS TEKRANINDA YAPTIKLARIMMM
     */


    //Soru 1 : Verilen bir List`deki elemanlari tekrarsiz olarak yaziniz.


        List <Integer> s = new ArrayList<>();
        s.add(2);
        s.add(3);
        s.add(2);
        s.add(2);
        s.add(5);

        List<Integer> b= new ArrayList<>();


        for (Integer w: s){

            if (!b.contains(w))
                b.add(w);
        }
        System.out.println(b);


    //Soru 2 : Kullanicidan bir harf aliniz harf sizdeki list`in icinde varsa o harfi "Bulundu" ya ceviriniz. yoksa o harfi list`e ekleyiniz.

        String harf1 = "";

        List<String> d = new ArrayList<>();
        d.add("A");
        d.add("K");
        d.add("R");
        d.add("S");

        do {
            System.out.println("Lutfen bir harf giriniz");
            harf1 = input.next().substring(0, 1);

            if (d.contains(harf1)) {
                d.set(d.indexOf(harf1), "Bulundu");
            } else if(!harf1.equals("Q")){
                d.add(harf1);
            }
            System.out.println(d);
        }while(!harf1.equals("Q"));











    }

    }

