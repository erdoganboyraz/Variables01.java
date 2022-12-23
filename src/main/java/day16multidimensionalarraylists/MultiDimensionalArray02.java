package day16multidimensionalarraylists;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {

        //Bir multidimensional array`daki en buyuk ve en kucuk elemanin toplamini veren kullaniniz.

        int arr[][]={{2,5,1},{83,75}};

        int maxElement = arr[0][0];
        int minElement = arr[0][0];

    for (int[] w:arr){

        for (int k:w){
            maxElement=Math.max(maxElement,k);
            minElement=Math.min(minElement,k);

        }
    } System.out.println(maxElement + " " + minElement);
      System.out.println(maxElement  +  minElement);

/*
YUKARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAKI BENIM CANLI DERSTE YAPTIGIM.
 */

        //Bir multidimensional array`daki en buyuk ve en kucuk elemanin toplamini veren kullaniniz.



    int hrr[][]={{5,6,2},{93,75}};

    int maxiEleman =hrr[0][0];
    int miniEleman =hrr[0][0];

    for (int[]w:hrr){
        for (int k : w) {
            maxiEleman = Math.max(maxiEleman, k);
            miniEleman = Math.min(miniEleman, k);
        }


    }
        System.out.println(maxiEleman);
        System.out.println(miniEleman);
        System.out.println(maxiEleman+miniEleman);

















    }

}
