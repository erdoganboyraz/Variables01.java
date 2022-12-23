package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List <String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println(names);

        List <String> cities = new ArrayList<>();

        cities.add("Trump");
        cities.add("Tom");
        cities.add("Tacaeddin");

//removeall()method`u ilk ArrayList`den ikinci ArrayList`in icindeki  ayni olan elemanlari siler.
        //removeAll()kullandiginizda sadece ilk list degisir.Parantezin icindeki list degismez.
    names.removeAll(cities);

        System.out.println(names);//[Thomas, Tahsin, Taceddin]

        List <String> myNames = new ArrayList<>();

        myNames.add("Thomas");
        myNames.add("Tahsin");
//Bir list`in icinde coklu elemanlarin var olup olmadidigini kontrol eder.Hepsi varsa  true en az biri yok sa false verir.
    boolean sonuc1 = names.containsAll(myNames);

        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
    //Example 1 : "a" list`inde "Shoes" elemaninin ilk gorunumu siliniz.
        System.out.println(a);
    a.remove("Shoes");
        System.out.println(a);
    //Example 2 : "a" list`inde "Shoes" elemaninin tum gorunumlerini siliniz.

     List<String> silinecekler = new ArrayList<>();

     silinecekler.add("Shoes");

    a.removeAll(silinecekler);
        System.out.println(a);


    //Example 3 : Bir tane "salary" list`i olusturun,eger "salary" 10000`den az ise %20 10000 ve 10000`den cok ise %10 zam yapiniz.

    List<Double> salary = new ArrayList<>();
salary.add(12345.00);
salary.add(8674.50);
salary.add(15000.75);
salary.add(9500.00);
salary.add(20500.00);
        System.out.println(salary);
for (Double w : salary){

    if (w<10000){

        salary.set(salary.indexOf(w),w*1.2);

    }else{
        salary.set(salary.indexOf(w),w*1.1);
    }

}
        System.out.println(salary);


//Example 4 : Iki array`in esit olup olmadigini kontrol eden kodu yaziniz.

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
//        m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
//2 arraylist`in esit olabilmesi icin elemanlar esit olmali ve ayni elemanlar ayni index`te olmali.

int counter=0;
for (int i = 0; i <m.size();i++){
if (m.size()!=n.size()){
    counter++;
    System.out.println("List`ler esit degildir.");
    break;
}else if(m.get(i)!=n.get(i)){
        counter++;
        System.out.println("List`le esit degildir.");
        break;

    }
}
if (counter==0){
    System.out.println("List`ler esittir.");
}

boolean esitmI= m.equals(n);

if (esitmI){
    System.out.println("List`ler esittir.");
}else {
    System.out.println("List`ler esit degildir.");
}


/*
YUKARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAKI BENIM TEKRARIM.
 */



   List<String> isimler=new ArrayList<>();

   isimler.add("Ahmet");
   isimler.add("Aroan");
   isimler.add("Aslan");
   isimler.add("Artemis");
   isimler.add("Asi");

   System.out.println(isimler);
        List<String> sehirler=new ArrayList<>();

   sehirler.add("Ahmet");
   sehirler.add("Aroan");
   sehirler.add("Aslan");
        System.out.println(sehirler);

   isimler.removeAll(sehirler);//removeAll()method`u kullandiginizda sadece ilk list degisir, parantezin icindeki list degismez.
        System.out.println(isimler);

        List<String>benimisimlerim =new ArrayList<>();

        benimisimlerim.add("Artemis");
        benimisimlerim.add("Asi");


   boolean vArMI =isimler.containsAll(benimisimlerim);//Bir list`in icinde coklu elemanlarin olup olmadignini kontrol eder.
        System.out.println(vArMI);                    //Hepsi varsa true, en az biri yoksa false verir.


        List<String> c = new ArrayList<>();
        c.add("Shoes");
        c.add("TV");
        c.add("Radio");
        c.add("Laptop");
        c.add("Shoes");
        c.add("Book");
        c.add("Shoes");

        //Example 1 : "c" listinde  "Shoes" elemaninin ilk gorunumunu siliniz.

       c.remove("Shoes");
        System.out.println(c);//[TV, Radio, Laptop, Shoes, Book, Shoes]

//Example 2 :  "c" listinde  "Shoes" elemaninin tum gorunumlerini siliniz.

        List<String> deleted = new ArrayList<>();
        deleted.add("Shoes");


        c.removeAll(deleted);
        System.out.println(c);//[TV, Radio, Laptop, Book]

        //Example 3  : Bir tane maas list`i olusturun, eger maas 10000 az ise %20 10000 ve 10000 cok ise %10 zam yapiniz.


        List<Double> maas = new ArrayList<>();

        maas.add(15000.00);
        maas.add(7674.25);
        maas.add(14000.87);
        maas.add(7500.00);
        maas.add(20500.00);

for (Double w:maas){

    if (w<10000){

        maas.set(maas.indexOf(w),w*1.2);

    }else {
        maas.set(maas.indexOf(w),w*1.1);
    }

}
        System.out.println(maas);

//Example 4 : Iki array`in esit olup olmadigni kontrol eden kodu yaziniz.
//2 array2in birbirine esit olabilmesi icin, elemanlar esit olmali ve ayni elemanlar ayni index`te olmali.

        List<Character> h = new ArrayList<>();
        h.add('x');
        h.add('y');
        h.add('z');
//        h.add('t');

        List<Character> u = new ArrayList<>();
        u.add('x');
        u.add('y');
        u.add('z');



        int counter1=0;
        for (int i = 0; i <h.size();i++){
            if (h.size()!=u.size()){
                counter++;
                System.out.println("List`ler esit degildir.");
                break;
            }else if(h.get(i)!=u.get(i)){
                counter++;
                System.out.println("List`le esit degildir.");
                break;

            }
        }
        if (counter==0){
            System.out.println("List`ler esittir.");
        }

        boolean esitmO= m.equals(n);

        if (esitmI){
            System.out.println("List`ler esittir.");
        }else {
            System.out.println("List`ler esit degildir.");
        }













    }
}
