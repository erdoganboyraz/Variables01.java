package day26exceptions;

public class Exceptions03 {
    public static void main(String[] args) {

        double d = divideStringByeTheNumOfChar("124");
        System.out.println(d);
    }
//String`deki character sayisini bulunuz, String`i Integer`e ceviriniz, Integer`i character sayisina bolunuz.

//1.Yol
    public static double divideStringByeTheNumOfChar(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException : "null" String`le "length()" kullanildiginda alinir.
            i = Integer.valueOf(str);//NumberFormatException : Icinde rakamdan farkli character olan String`ler valueOf() ile kullanldiginda
            sonuc = i / length;//ArithmeticException : Bolen sayi 0 oldugunda alinir.
        } catch (NullPointerException e) {
            System.out.println("" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("" + e.getMessage());
        }
        return sonuc;
    }
//2.Yol
    public static double divideStringByeTheNumOfCharacter(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException : "null" String`le "length()" kullanildiginda alinir.
            i = Integer.valueOf(str);//NumberFormatException : Icinde rakamdan farkli character olan String`ler valueOf() ile kullanldiginda
            sonuc = i / length;//ArithmeticException : Bolen sayi 0 oldugunda alinir.
        } catch (Exception e) {
            System.out.println("" + e.getMessage());

        }
        return sonuc;
    }
//3.Yol
    public static double divideStringByeTheNumOfCharacters(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException : "null" String`le "length()" kullanildiginda alinir.
            i = Integer.valueOf(str);//NumberFormatException : Icinde rakamdan farkli character olan String`ler valueOf() ile kullanldiginda

            sonuc = i / length;//ArithmeticException : Bolen sayi 0 oldugunda alinir.
        } catch (NullPointerException e) {
            System.out.println("NullPointer`a ozel ==>" + e.getMessage());

        } catch (Exception e) {
            System.out.println("Diger tum exception`lar icin" + e.getMessage());

        }
        return sonuc;

    }
    /*
    Note 1 : Aralarinda "parent-child" Relationship olan Exception Class`lari multiple catch`lerde kullanmak isterseniz
             "child" olan once kullanilmalidir, aksi takdirde hata verir.
         2 : Aralarinda "parent-child" Relationship olmayan Exception Class`lari multiple catch`lerde kullanamak isterseniz
             siralamanin bir onemi yoktur.



     */
}