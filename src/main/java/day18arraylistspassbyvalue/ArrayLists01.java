package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        //Example 1 : Bir Integer  Arraylist`teki  7 haric tum elemanlari 2 artiriniz.

        List<Integer>  ages  = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w :ages){
            if (w==7){
                continue;
            }
          // w=w+2;==>List`ler boyle update edilemezler.
            ages.set(ages.indexOf(w),w+2);
        }
        System.out.println(ages);



//Example 2 : Size verilen Arraylist`te 8(inclusive) ve 8`den onceki tum elemanlari 2 katina cikariniz.

        List<Integer>  nums  = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);


        for (Integer w :nums){
            nums.set(nums.indexOf(w),w*2);

            if (w==8){
                break;
            }
        }
        System.out.println(nums);


/*
YUKARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAKI BENIM TEKRARIM
 */


//Soru 1 : Bir Integer Arraylist`teki 7 haric tum elemanlari 2 artiriniz.



        List<Integer>  yaslar  = new ArrayList<>();
        yaslar.add(12);
        yaslar.add(7);
        yaslar.add(21);
        yaslar.add(78);
        yaslar.add(9);
     for (int w : yaslar){
         if (w==7){
             continue;
         }
         yaslar.set(yaslar.indexOf(w),w+2);
     }
        System.out.println(yaslar);

        //Example 2 : Size verilen Arraylist`te 8(inclusive) ve 8`den onceki tum elemanlari 2 katina cikariniz.

        List<Integer>  numaralar  = new ArrayList<>();
        numaralar.add(12);
        numaralar.add(7);
        numaralar.add(21);
        numaralar.add(8);
        numaralar.add(9);


     for (int w :numaralar){
         numaralar.set(numaralar.indexOf(w),w*2);

         if (w==8){
             break;
         }
     }         System.out.println(numaralar);











    }
}
