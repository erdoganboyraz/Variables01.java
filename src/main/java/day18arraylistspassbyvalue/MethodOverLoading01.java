package day18arraylistspassbyvalue;

public class MethodOverLoading01 {

    /*
    Method Overloading nasil yapilir?
    1)Method isimleri ayni olmalidir.
    2)Method parametreleri farkli olmalidir.
     i)Parametre sayilari degistirebilir.
     ii)Parametrelerin data type`larini degistirebilirsiniz.
     iii)Parametrelerin yerlerini degistirebilirsiniz.
     iv)Parametrelerin yerlerini degistirebilirsiniz.Ancak data type`lari farkli ise.
     3)Method Ismi + Parametreler = Method Signature
     i)Method Signature disinda  ne degistirirsek degistirelim Java method`lari farkli kabul etmez.
     */
    public static void main(String[] args) {

add(3,5);

add(3,5.0);

    }
    public static void add(int a ,int b){
        System.out.println(a+b);
    }
    public static void add(int a ,int b ,int c){
        System.out.println(a+b+c);
    }
    public static void add(int a ,double b){
        System.out.println(a+b);
    }
    public static void add(double a ,int b){
        System.out.println(a+b);
    }

}