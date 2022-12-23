package day29abstractioncollection;

public interface Engine extends Vehicle {

    /*
         Child          Parent
        Class  =======>   Interface ===> implements
        Class  =======>   Class     ===> extends
        Interface =====>  Interface ===> extends
        Interface =====>  Class     ===> mumkun degil
     */


    //Interface`lerdeki tum variable`ler otomatik olarak(default) "public" dir.
    //Interface`lerdeki tum variable`ler otomatik olarak(default) "final" dir.
    //Interface`lerdeki tum variable`ler otomatik olarak(default) "static" dir.
    int price = 2000;

    double weight=23.5;

    void run();



}
