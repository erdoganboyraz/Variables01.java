package day18arraylistspassbyvalue;

public class Varargs01{

    /*
    1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz,"varargs" kullanmalisiniz.
    2)"varargs" arka tarafta "Array" kullanir. Bu yuzden "varargs"larla calisirkan "Array"lerle calisyormus gibi davranabilirsiniz.
    3)"varargs" olusturmak icin "<data type>... <varargs ismi>" veya  "<data type> ...<varargs> ismi>" ya da  "<data type> ... <varargs ismi>"
    4)Bir method`da "varargs"in yaninda baska bir parametre kullanilabilir mi ?
    "varargs" en sona olmak sarti ile kullanilir.
    5)Bir method`da birden fazla  "varargs" kullanilabilir mi?
    "varargs" en sonda olmak zorunda oludugundan birden fazla kullanirsaniz en az biri en sonda olmayacaktir. Bu da 4. kural ile celisir.
     */
    public static void main(String[] args) {

    int r1 = add(2,3);
    System.out.println(r1);//5

    int r2 = add(2,3,4);
    System.out.println(r2);//9

    int r3 = add(2,3,4,5,6,7,8,9);
    System.out.println(r3);//44
    }
//    public static int add(int a , int b) {
//         return a + b;
//    }
//    //Uc sayinin toplamini return eden bir method olusturunuz.
//
//    public  static  int add2(int a , int b , int c){
//        return a + b + c;
//    }
//    //Dort sayinin toplamini return eden bir method olusturunuz.
//
//    public  static  int add4(int a , int b , int c, int d){
//        return a + b + c + d;
//    }
    //Istedigimiz kadar sayiyi toplayabilcegimiz bir method olusturalim.
    public  static int add(int ... a){
        int sum=0;
        for (int w :a){
            sum=sum+w;
        }
        return sum;
    }



}
