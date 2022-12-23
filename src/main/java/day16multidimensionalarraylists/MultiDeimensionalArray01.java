package day16multidimensionalarraylists;

import java.util.Arrays;

public class MultiDeimensionalArray01 {
    public static void main(String[] args) {
/*
Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
Array veya Collection var ama "index" kullanmak zorundasiniz o zaman "for-each-loop" calismaz,
 "for-loop" veya "while-loop" veya "do-while-loop" kullanmalisiniz
 */
     //Bir tane integer MultiDimensionalArray olusturunuz.
     //Bu Array`deki tum sayilarin toplamini verne kodu yaziniz.

     int arr[][]={{2,5,1},{32,75},{13,21,43,56}};

     int sum =0;

     for (int[] w:arr){

        for (int k:w){

            sum=sum+k;
        }

     }
        System.out.println(sum);


     //Example 1 :Bir MultiDimensionalArray`i normal Array`e ceviren kodu yaziniz.
      //{{2,5,1}{32,75}} ==> {2,5,1,32,75}


        int brr[][]={{2,5,1},{32,75}};


     int toplam = 0;

     for (int[] w:brr){

         toplam=toplam+w.length;
         System.out.println(toplam);

     }
     int idx=0;
        int crr[]=new int[toplam];

        for (int[] w:brr){
            for (int k :w){

                crr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));

/*

YKUARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAKI BENIM TEKRARDA YAPTIGIM
 */


        /*
        Bir Intiger MultiDimensional array olusturunuz.
        Bu Array`deki tum elemanlari yazdiriniz.
         */

        int yrr[][]={{4,5,3},{44,74},{11,23,47,58}};


        int toplam1=0;
        int index1=0;

        for (int[] w:yrr){
        for (int k:w){

            toplam1 =toplam1+k;
            index1++;
        }

        }
        System.out.println(toplam1);



/*
Array veya Collection varsa for-each kullanmak ilk tercihiniz olsun.
Array veya Collection var ama "index" kullanmak zorundasiniz o zaman for-each-loop calismaz, "for-loop" veya "while-loop"veya "do-while-loop" kullaniniz.
 */




/*
Bir MultiDimensionalArray`i normal Array`e ceviren kodu yaziniz.
 int yrr[][]={{4,5,3},{44,74}};==> {4,5,3,44,74}
 */
       int frr[][]={{4,5,3},{44,74}};
       int toplam2=0;


       for (int[]w:frr){
           toplam2 = toplam2+w.length;
       }
        System.out.println(toplam2);

     int grr[]=new int[toplam2];
     int idx3=0;

     for (int[] w:frr){

         for (int k:w){
             grr[idx3]=k;
             idx3++;

         }
     }
        System.out.println(Arrays.toString(grr));


    }
}
