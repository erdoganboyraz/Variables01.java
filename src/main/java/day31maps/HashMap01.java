package day31maps;

   /*
   ///Benim notlarim

     Map`ler "key-value" structure`yi kullanirlar.
     "Key" ler unique olmalidir. Yani tekrarsiz data icermelidir.
     "Value" ler ise non-unique olabilir.Yani  tekrarli  data icerebilir.
     "Key" mutlaka olmalidir.(Null olabilir ama bos olamazlar.)
     "Value" ler null olabilir.(Ama bos olamaz.Bos ile null farklidir.)
     "Key-Value" yapisina "EntrySet" denir. Burada List`lerdeki gibi elemani diyemeyiz  "EntrySet" deriz.
     "EntrySet" de "Set" olmasinin sebebi "Set" lerin unique olmasidir. Burada "EnrtySet" ler unique`ler data`lardan olusur.
     "HashMap" ler "EntrySet" leri siralamakla ugrasmazlar. Cunku siralama zaman ister. Bu yuzden "HashMap" ler "super-fast" calisirlar.
   */

/*
///Hocanin notu

   1)Map`ler key-value structure kullanir.
   2)Key`ler unique`dir.
   3)Value`ler tekrarli data icerebilir.
   4)Map`lerde eleman degil "EntrySet" kullaniriz.
   5)Key`lerde null tekrarsiz olarak kullanilir..
   6)Value`ler null kabul eder.
   7)HashMap`ler EntrySet`leri herhangi bir siralamaya tabi tutmaz.Rastgele siralar.
   8)Siralama ile vakit kaybetmedigi icin HashMap`ler cok hizli(super-fast) calisirlar.
 */



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String,Integer> studentAges = new HashMap<>();

        studentAges.put("Ali",13);
        studentAges.put("Tom",21);
        studentAges.put("Brad",12);
        studentAges.put("Ajda",76);
        studentAges.put("Cuneyt",75);

        studentAges.put("Ali",88);//Ayni key degerinin tekrar kullandiginizda hata vermez "overwrite" yapar.

        studentAges.put(null,66);

        studentAges.put("Ayhan Isik",null);

        studentAges.put("Sadri Alisik",null);

        System.out.println(studentAges);//{null=66, Ayhan Isik=null, Sadri Alisik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        //Map`den sadece keyler nasil alinir?

        Set<String> keys = studentAges.keySet();
        System.out.println(keys);//[null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]


        //Map`den sadece value`ler nasil alinir?

        Collection<Integer> values = studentAges.values();
        System.out.println(values);//[66, null, null, 21, 76, 12, 75, 88]

        //Belli bir key`e ait value nasil alinir?

        Integer cuneytAges = studentAges.get("Cuneyt");
        System.out.println(cuneytAges);


        //Example 1 : Tum Integer yaslarin ortalamasini hesaplayan kodu yaziniz.

       Collection<Integer> ages = studentAges.values();

       int sum =0;
       double counter =0;
       for (Integer w :ages){
           if (w!=null){
               sum=sum+w;
               counter++;
           }
       }

        System.out.println("Ortalama Yas Hesaplama :" +(sum/counter));//Ortalama Yas Hesaplama :56.333333333333336


        //Example 2 : "A" ile baslamayan isimlerin sum1 isimlerin icerdigi sum1 karakter sayisini bulan kodu yaziniz.

        Set<String> key = studentAges.keySet();

        int sum1 =0;
        for (String w : key){

            if (w!=null && !w.startsWith("A")){
                sum1=sum1+w.length();
            }

        }
        System.out.println(sum1);//25

        //remove("Ajda",76) key`si "Ajda" ve value`si "76" olan EntrySet`i siler ve size boolean return eder.
        boolean sounc = studentAges.remove("Ajda",76);
        System.out.println(sounc);//66

        Integer result1 = studentAges.remove(null);
        System.out.println(result1);


        //Key varsa value`yi verir, key yoksa sizin istediginiz degeri verir.

        Integer result2 = studentAges.getOrDefault("Bradon",0);
        System.out.println(result2);//12

        //Value null ise ekleme yapar, value null degilse ekleme yapmaz.

        Integer result3 = studentAges.putIfAbsent("Brad",100);
        System.out.println(result3);//12
        System.out.println(studentAges);//{Ayhan Isik=null, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        Integer result4 = studentAges.putIfAbsent("Ayhan Isik",100);
        System.out.println(result4);//null
        System.out.println(studentAges);//{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        //Key yoksa ekleme yapar.
        Integer result5 = studentAges.putIfAbsent("Acun Ilicali",200);
        System.out.println(result5);//null
        System.out.println(studentAges);//{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=200, Ali=88}

        //replace() method`u value`leri key`e bakarak degistirdi.
        studentAges.replace("Acun Ilicali",49);
        System.out.println(studentAges);//{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}

        //replace() method`u value`leri key ve value`yu kontrol ettikden sonra degistiri.
        studentAges.replace("Acun Ilicali",49,53);
        System.out.println(studentAges);//{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=53, Ali=88}

        //Map`teki her bir Entry`i ekrana farkli bir satirda olacak sekilde yazdiriniz.


        //EntrySet() method`u Map`deki elemanleri bir Set`in icine koyarak size verir.
        Set<Map.Entry<String,Integer>> entries = studentAges.entrySet();

        for (Map.Entry<String,Integer> w:entries){
            System.out.println(w);
        }




    }
}
