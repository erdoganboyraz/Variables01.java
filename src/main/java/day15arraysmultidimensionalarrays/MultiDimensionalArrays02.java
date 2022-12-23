package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {

        //MultiDimensionalArray kisa yoldan nasil olusturulur.

        char arr[][]={{'a','b'},{'C','D','E'},{'?'}};

        System.out.println(Arrays.deepToString(arr));//[[a,b],[C,D,E],[?]]

    //Bir String MultiDimensionalArray`de icinde 'a' olan elemanlari console`a yazdiriniz.


        String brr[][] ={{"learn","java","it"},{"is","easy"}};


        for (String[] w:brr){

            for (String k:w){

                if (k.contains("a")){
                    System.out.print(k + " ");
                }

            }


        }



/*
YUKARIDAKI HOCANIN CANLI DERSTE YAPTIKLARI ASAGIDAKI BENIM YAPTIKLARIM.
 */



    char prr[][]={{'a','b'},{'C','D','E'},{'?'}};

        System.out.println(Arrays.deepToString(prr));//{{'a','b'},{'C','D','E'},{'?'}}

        //Bir String MultiDimensionalArray`de icinde "a" olan elemanlari konsala yazdiriniz.


        String vrr[][] ={{"learn","java","it"},{"is","easy"}};

       for (String[] w:vrr){

          for (String k:w){

              if (k.contains("a")){
                  System.out.println(k + " ");
              }


          }


       }














    }
}
