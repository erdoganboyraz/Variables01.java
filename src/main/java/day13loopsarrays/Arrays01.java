package day13loopsarrays;

import java.util.Arrays;


public class Arrays01 {
    public static void main(String[] args) {

     /*
     1)Ayni data tipinde coklu datayi depolamak icin Java'nin olusturdugu datalar vardir.
     Bu yapiardan biriside "Array"lerdir.
      */
        //Array nasil olusturulur.
int []stdAges  = new int[7];//[0,0,0,0,0,0,0]

        //Array nasil yazdirilir.
        System.out.println(Arrays.toString(stdAges));

//Array'lere elamanlar nasil eklenir.
stdAges[0]=12;
stdAges[1]=11;
stdAges[2]=13;
stdAges[3]=14;
stdAges[4]=10;
stdAges[5]=12;
stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));

//Array`daki herhangi bir elamani nasil yazdirabiliriz.


        System.out.println(stdAges[4]);

        //Array`daki en buyuk ve en kucuk elemaninin toplamini ekrana yazdiriniz.

        Arrays.sort(stdAges);//******

        System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14]
  int ilk = stdAges[0];
//Note : length() parantezli sekilde String`lerde kullanilir."length" Array`lerde parantezsiz sekilde kullanilir.
  int son = stdAges[stdAges.length-1];

        System.out.println(ilk+son);//24



//Example 2 :  stdAges icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
int sum = 0 ;
        for (int i =0;i<stdAges.length;i++){

           sum = sum + stdAges[i];
        }
        System.out.println(sum);//84


        int sum2 = 0;
        int i= 0;
        while (i<stdAges.length) {
            sum2 = sum2 + stdAges[i];
            i++;
        }
        System.out.println(sum2);


        int k = 0;
        int s =0;
        do {
            s= s +stdAges[k];
            k++;
        }while (k<stdAges.length);
        System.out.println(s);

//4.Yol : for-each-loop Array`ler ve Collecions`larda kullanilir.
int h = 0;
        for (int w :stdAges){
        h = h+w;
        }
        System.out.println(h);

//Example 3 : String bir Array olusturunuz.
        //Bu Array`a 5 tane isim yerlestiriniz.Sonra bu isimlerdeki karakter sayilarini toplamini ekrana yazdiriniz.

        String isim[] = new String[5];

        isim[0] ="Ali";
        isim[1] ="Tom";
        isim[2] ="Veli";
        isim[3] ="Kemal";
        isim[4] ="Cem";

int karakterSayilariToplami=0;
for (String w:isim){

karakterSayilariToplami = karakterSayilariToplami+w.length();

}
        System.out.println(karakterSayilariToplami);

//Example 4 : Char bir Array olusturunuz.
        //Bu Array`a 5 elaman eklayiniz.
        //Bu Array`daki sadece buyuk harfleri ekrana yazdiriniz.


        char ch[]= {'A','c','D','k','M'} ;

for (char w :ch){
    if (w>='A' && w<='Z'){
        System.out.print(w);
    }


}






    }
}
