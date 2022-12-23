package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
public static void main(String[] args) {

    /*
    Example 1: Size verilen pozitif ve negatif sayilar iceren integer array`daki "en buyuk negatif" ve "en kucuk pozitif" elamani bulunuz.
     */
       int arr[]={-12,18,-5,23,-2,0};
       Arrays.sort(arr);
int mxNegatif=arr[0];
int mnPozitif=arr[arr.length-1];

       for (int w:arr){
           if (w<0){
            mxNegatif = Math.max(mxNegatif,w);
           }
       if (w>0){
        mnPozitif = Math.min(mnPozitif,w);
       }

       }
    System.out.println(mxNegatif+ " " +mnPozitif);





/*
YUKARIDAKI SORUNUN TEKRARI
 */


   /*
   Size verilen pozitif ve negeatif sayilar iceren bir integer Array`daki en buyuk negatif ve en kucuk pozitif elemani bulunuz.
    */

    int srr[]={-15,-17,-1,29,15,0};

    Arrays.sort(srr);

    int numNegatif=arr[0];
    int numPozitif=arr[arr.length-1];

    for (int w:srr){
        if (w<0) {
            numNegatif = Math.max(numNegatif, w);
        }
        if (w>0){
            numPozitif=Math.min(numPozitif,w);
        }
    }System.out.println(numPozitif + " " + numNegatif);












    }
}
