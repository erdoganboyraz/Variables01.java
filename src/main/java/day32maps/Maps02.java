package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        //Size verilen bir kelimede kullanilan haflerin kacar kere kullanildigini gosteren kodu yaziniz.
//abbcaa==> a=3 ,b =2 ,c=1

        String kelime="abbcaa";
        HashMap<String,Integer> gorunum = new HashMap<>();


        String[] harfler=kelime.split("");
        System.out.println("harfler = " + Arrays.toString(harfler));//harfler = [a, b, b, c, a, a]

        Integer gorunumSayisi=0;
        for (String w:harfler){

            gorunumSayisi = gorunum.get(w);


            if (gorunumSayisi==null){
                gorunum.put(w,1);
            }else {
                gorunum.put(w,gorunumSayisi+1);
            }
        }
        System.out.println("gorunum = " + gorunum);//gorunum = {a=3, b=2, c=1}

    }
}
