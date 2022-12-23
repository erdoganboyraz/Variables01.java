package day15arraysmultidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {
       /*
       Bir Array`in elemanlari Array ise bu Array1lar "Multidimensional" dir.
        */

        //Multidimensional Array nasil olusturulur.

        int arr[][]= new int[3][2];
        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]] normal Array`lardaki gibi default olan "0" dan baslar.

        //Multidimensional Array`lere elaman ekleme nasil yapilir.

        arr[0][0]=3;
        arr[0][1]=-4;
        arr[1][0]=6;
        arr[1][1]=18;
        arr[2][0]=-7;
        arr[2][1]=0;

//Multidimensional Array nasil yazilir.
        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]]


    //Multidimensional Array`larde Array elemanlarindan biri nasil yazdirilir.
        System.out.println(Arrays.toString(arr[1]));//[6, 18]

        //Multidimensional Array`larde ic Array`lerdeki elemanlar nasil yazdirilir.
        System.out.println(arr[1][0]);

    //Example 1: String bir Multidimensional Array olusturunuz.
        //Elamanlari ekleyiniz.
        //Sonrada toplam elaman sayisini ekrana yazdiran kodu yaziniz.

        String brr [][]=new String[4][3];

        brr[0][0]="A";
        brr[0][1]="B";
        brr[0][2]="C";

        brr[1][0]="D";
        brr[1][1]="E";
        brr[1][2]="F";

        brr[2][0]="G";
        brr[2][1]="H";
        brr[2][2]="I";

        brr[3][0]="J";
        brr[3][1]="K";
        brr[3][2]="L";

        System.out.println(Arrays.deepToString(brr));

     int sum =0;

    for (String[] w :brr){

      sum=sum + w.length;



    }
        System.out.println(sum);



    /*
    YUKARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAKI BENIM TEKRARDAN YAPTIGIM
     */
/*
Bir Array`in elemanlari Array ise bu Array`ler MultiDimensionalArray`dir.
 */
        int jrr[][]=new int[3][2];


    jrr[0][0]=1;
    jrr[0][1]=2;
    jrr[1][0]=3;
    jrr[1][1]=4;
    jrr[2][0]=5;
    jrr[2][1]=6;

        System.out.println(Arrays.deepToString(jrr));

        System.out.println(Arrays.toString(jrr[1]));

        System.out.println(jrr[1][0]);


/*
Soru 2: String bir MultiDimensionalArray olusturunuz.
Elemanlari ekleyiniz.
Sonrada toplam eleman sayisini ekrana yazdiran kodu yaziniz.
 */

String lrr[][]=new String[4][3];

        lrr[0][0]="A";
        lrr[0][1]="B";
        lrr[0][2]="C";

        lrr[1][0]="D";
        lrr[1][1]="E";
        lrr[1][2]="F";

        lrr[2][0]="G";
        lrr[2][1]="H";
        lrr[2][2]="I";

        lrr[3][0]="J";
        lrr[3][1]="K";
        lrr[3][2]="L";

        System.out.println(Arrays.deepToString(lrr));

        int result = 0;

        for (String[] w:lrr){

        result= result+w.length;
}
        System.out.println(result);






    }
}
