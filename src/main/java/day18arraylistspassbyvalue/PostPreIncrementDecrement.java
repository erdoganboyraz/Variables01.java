package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {

        int a = 5;
        //Post Increment
        int b =a++;//Java burda b` datasina a datasini koyar ve artirmayi daha sonra yapar.Asagidaki gibi b yi yazdirdigimizda a`nin degerini atar.
        //Daha sonra a`yi artirir.
        System.out.println(b);//5

        System.out.println(a);//6

        //Pre Increment
        int c = 10;
        int d =++c;//Java burda d`datasina bakar ilk basta Increment yapar sonra c`yi artirir.Sonra d`nin icine artirilmis degeri koyar.
        //Ayrica Java c`nin degerinide artirir.

        System.out.println(d);//11

        System.out.println(c);//11


        //Post Decrement
        int e= 20;//Java burda f datasina e datasini koyar ve eksiltmeyi daha sonra yapar.Asagidaki gibi f yi yazdirdigimizda e`nin degerini atar.
        //Daha sonra e`yi azaltir.
        int f = e--;
        System.out.println(f);//20

        System.out.println(e);//19

        //Pre Decrement

        int h = 30;//Java burda i`datasina bakar ilk basta Decrement yapar sonra h`yi azaltir.Sonra i`nin icine azaltimis degeri koyar.
        //Ayrica Java h`nin degerinide azaltir.
        int i = --h;

        System.out.println(i);//29

        System.out.println(h);//29



    }
}
