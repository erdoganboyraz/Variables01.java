package day21accessmodifiersinheritance;

public class Student{

    /*
    Access Modifier
    1)public         2)protected          3)default(Access Modifier`i default yapmak icin access modifier yazmayiz)           4)private

Note : Access Modifier`leri genisden dara dogru sayiniz.
public>protected> default>private

Note : Access Modifier`leri birer birer aciklayiniz.
public, her classdan kullanilabilir.
//protected olanlar baska package`lerden kullanilamaz,ancak baska package`de "child class" icinden kullanulabilir.
//default olanlar baska package`den kullanilamazlar.
//Private olanlar sadece olusturulduklari Class icinde kullanilabilirler.

Note : Protected ile default`un farkini soyleyiniz.
//default olanlar baska package`den kullanilamazlar.
//Private olanlar sadece olusturulduklari Class icinde kullanilabilirler.

Note : Class`lar icin hangi Access Modifier`lar kullanilabilir.
public, default`da kullanilir ama protected ve private kullanilamaz.





     */
//public her Class`da kullanilabilir.
public String stdName = "TomHanks";
//protected olanlar baska package`lerden kullanilamaz,ancak baska package`de "child class" icinden kullanulabilir.
protected String address = "Miami";
//default olanlar baska package`den kullanilamazlar.
 String email ="th@gmail.com";

 //Private olanlar sadece olusturulduklari Class icinde kullanilabilirler.
private  String stdId = "20206517004";


/*
YUKARIDAKI HOCANIN CANLI DERSTE YAPTIGI ASAGIDAKI BENIM DERS TEKRARIM.
 */

/*
Not 1 :Access Modifier`i genisden dara dogru siralayiniz.
public > protected > default > private

Not 2 : Access Modifier`i birer birer acikalyiniz.
public olanlar her class`da kullanilabilr.
protected olanlar baska package`den  kullanilamazla ancak Child Class icinden kullanilabilirler.
default olanlar baska package`lerden kullanilamazlar.
private olanlar sadece olusturduklari class icinden kullanilabilirler.

Not 3 : "Protected" ile "Default" `un farkini soyleyiniz.
protected olanlar baska package`den  kullanilamazla ancak Child Class icinden kullanilabilirler.
default olanlar baska package`lerden kullanilamazlar.

Not 4 : Class`lar icin hangi "Access Modifier" lar kullanilabilir.
public,default kullanilir ama protected ve private kullanilamaz.

 */





//public her class`dan kullanilabilir.
public String ogrenciIsmi = "HenrtCavill";
//protected olanalar baska package`lerden kullanilamazlar, ancak baska package`de Child Class icinden kullanilabilir.
protected  String adres = "London";
//Access Modifier`i default yapmak icin access modifier yazmayiz.
//default olanlar baska package`den kullanilamazlar
String gmail = "hc@gmail.com";
//private olanlar sadece olusturulduklari Class icinde kullanilabilir.
private String ogrenciNo = "15020511008";









}
