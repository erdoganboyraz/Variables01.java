package day26exceptions;

public class Exceptions02 {
    public static void main(String[] args) {

       char ch1= getCharFromString("Java",2);
        System.out.println(ch1);

        char ch2 = getCharFromString("Selenium",8);
        System.out.println(ch2);//StringIndexOutOfBoundsException : Eger bir String`den character/ler alirken olmayan bir index kullanlirsa
                                //StringIndexOutOfBoundsException alinir.
    }
    public static char getCharFromString(String str,int idx){
        char i=' ';

        try {
            i = str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index ile ilgili bir problem olustu ==> "+e.getMessage());//w.getMessage()mesaji verir.

            e.printStackTrace();//Dteayli "log(akisi takip etmek)" icin
        }
        return i;

    }

}
