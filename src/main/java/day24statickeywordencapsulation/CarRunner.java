package day24statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2= new Car();
        Car car3= new Car();
        Car car4= new Car();

        //static variable`lara objjeleri kullanarak ulasmak mumkun ama tavsiye edilmez
        System.out.println(car1.counter);
        //static variable`lara  class ismi kullanarak ulasilmalidir.
        System.out.println(Car.counter);
        System.out.println(car1.price);

        System.out.println(Car.counter);
        System.out.println(car2.price);

        System.out.println(Car.counter);
        System.out.println(car3.price);

        System.out.println(Car.counter);
        System.out.println(car4.price);

        //STACTIC KEYWORD CLASS`A BAGLANMIS CLASS ELEMANLARIDIR. STACTIC CLASS ELAMANLARI BUTUN OBJELERIN ORTAK ELEMANLARIDIR.
          /*
          STACTICLER UZERINDEN YAPILAN  HER DEGISIKILIK BUTUN OBJELERI ETKILER TUM OBJELERDE GORULUR.
          STACTIC CLASS ELEMANLARINA CLASS UZERINDEN ULASIRILIR. OBJE UZERINDEN ULASILMAZ. KULLANIRSAN HATA VERMEZ AMA
           */

/*
static keyword nedir?
static keyword class'a baglanmis class elemanlaridir
static class elemanlari butun Object'lerin ortak elamanidir.
static ler uzerinde yapilan her degisiklik butun objeleri etkiler tum objelerde gorunur.
static Class elemanlarina Class uzerinden ulasilir.
 */
        /*
        Static keyword classa baglanmıs class elemanlaridir
    Static class elemanlari butun objelerin ortak elemanidir(Gokteki ay gibi)
        Staticler uzerinde yapilan her degisiklik butun obeleri etkiler, butun objeler tarafindan gorulur.
                Static class elemanlarina class uzerinden ulasilir. Objeler staticlere ulasmak icin kullanilmaz.
                kullanimda hata vermez ama tavsiye edilmez.
                */
        /*
        1) Static keyword, class'a bağlanmış class elemanlarıdır.
        static variable/method class'a bağlıdır.
2) Static class elemanları, tüm objelerin ortak elemanıdır.
3) Static'ler üzerinde yapılan her değişiklik, tüm objeleri etkiler ve tüm objeler tarafından görülür.
4) Static class elemanlarına, class üzerinden ulaşılır. Objeler, static'lere ulaşmak için kullanılmaz.
        Kullanılırsa hata vermez, fakat tavsiye edilmez.
         */
    }
}
