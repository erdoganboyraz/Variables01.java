package day18arraylistspassbyvalue;

public class PassByValue01 {
    /*
   1)Java variable`larin orjinal degerlerini korumak ister.
   2)Variable method`lar icinde kullanildiginda, Java method`un icine orjinal degeri koymaz o degerin kopyasini uretir
   ve methoda o kopyayi yollar.Method kopya ustunde degisiklik yapar dalayisiyla varibale`in orjinal degeri korunmus olur.
   Bu sisteme "Pass By Value" denir.

   Note : Java "Pass By Value" kullanir.Bazi programlama dilleri orjinal degeri koruma altina almamistir. Bu isi developer`lere
   birakmistir. Bu tarz "Pass by Reference" kullanir.
   Note : Java "Pass by Reference" kullanmaz."Pass By Value" kullanir.
     */
    public static void main(String[] args) {

        int x =5;//Gomlek
        System.out.println(x);

        //static method olan "main method" un icindeki hersey static olmalidir.
        change(x);//Ogrenci gomlegi

        System.out.println(x);//Gomlek


        int ucret=100;

//        int kopya =indirim(ucret);
//        System.out.println(kopya); burda sayinin orjinal halini dusmus olarak goreceggiz. burda da orjinal datayi degistirdik ama datayi farkli bir
        // data`nin icine aldik.

        ucret = indirim(ucret);//burda orjinal veriyi degistirdik. orjinal datayi alarak

        System.out.println(ucret);//90


    }
    public static void change(int a){
        System.out.println(a*3);
    }
    //void disindaki "return" type`larda method body`si icinde "return" keyword kullanilmalidir
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti-10;
    }



}