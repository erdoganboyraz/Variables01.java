package day25exception;

public class E03 {
    public static void main(String[] args) {
        String str="Ali";
        getNumOfChars(str);//3

        String s="";
        getNumOfChars(s);//0

        String t=null;

        getNumOfChars(t);//NullPointerException
        //Eger length() method`unda null kullanirsaniz bu exception`i alirsiniz.
    }



    //Bir String`de bulunan character`lerin sayisani bulabilmek icin bir method olusturunuz.
    public static void getNumOfChars(String str){
      try {
          System.out.println(str.length());
      }catch (NullPointerException e){
          System.out.println("length() method`unda bir problem olustu");

          e.printStackTrace();
          //bu method`u kullandigimiz zaman System.out.println; kullanmaniza gerek yok.
      }

    }
}
