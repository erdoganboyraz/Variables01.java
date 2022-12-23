package day30collections;

import java.util.HashSet;

public class HashSet01 {
    /*
Hash bir tekniktir,birbirine benzemeyen kodlar üretir bu kodlar datayi unique sağlar.
Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)


HashSet`ler eklenen elemanlarin siralamasi ile ugrasmaz. Siralama ile alakali zaman harcamaz bu yuzden cok hizli calisir.
HashSet`ler index kullanmazlar. Cunku siralama rastgele yapildigi icin index manali olmaz.
HashSetler:
1)tekrarsiz elemanlarda  2)sırlama onemli degilse  3)hız cok önemliyse  4)İndeks kullanmazlar


    */
    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        //Varolan elemani eklreseniz hata vermez son ekleneni var olan data`nin ustune yazar.(Overwrite)
        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]



    }
}
