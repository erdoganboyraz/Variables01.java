package day31maps;

import java.util.HashMap;

public class HashMap02 {

    /*
       1)Siz "HashMap<String,Double> salaries = new HashMap<>();"kodu yazdiginizda Java memory`de 16 kutu(bucket) iceren bir yapi olusturur.
         Ve bu yapidaki her bir kutuya index verir. Index`ler 0`dan 15`e kadardir.
       2)Siz "salaries.put("QA",110000.000);" kodunu yazdiginizda Java key icin bir HashCode olusturur. Bu HashCode`u 16`a boler ve
         kalani index olarak kullanir ve bu elemani o index`e yerlestirir.
       3)Yerlestirirken 4`lu bir yapi olusturur, bu yapinin ilk bolumune "HashCode" u ,ikinci bolumune "Key" i,ucuncu bolumune "Value" i
         ve dorduncu bolumune "Pointer" i koyar. Bu cok bolumlu yapi LinkedList`lerdeki "Node" dur. Yani HashMap bucket`lara koydugu data`yi
         LinkedList olarak depolar.
       4)Java "null" icin hep HashCode olarak "zero" uretir. O yuzden  key null oldugunda eleman ilk bucket`e yerlestirilir. Bundan dolayi
         key`si null olan elemanlar Map`in icinde genellikle ilk sirada gozukurler.
       5)Java normalde Hashode`lari unique yapar. Ama bazen trafik kazasi gibi farkli iki eleman icin ayni HashCode uretebilir. Buna Hash Collision"
         denir. Hash Collision meshur bir Java Development problemidir. Bu problemle karsilasildiginde Developer`ler bu problemi cozmek icin
         kodlar yazarlar, ama bu Core Java`nin konusu degildir.
     */
    public static void main(String[] args) {

        HashMap<String,Double> salaries = new HashMap<>();

        salaries.put("QA",110000.000);
        salaries.put("Dev",130000.000);
        salaries.put("SaleForce",125000.000);



    }
}
