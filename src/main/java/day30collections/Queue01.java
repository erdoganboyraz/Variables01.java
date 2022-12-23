package day30collections;

import java.util.LinkedList;
import java.util.Queue;
/*
Ilk giren elemani ilk kullanmaniz(First In First Out ===>FIFO) gerektiginde Queue en iyi secenektir.

Queue elemanlar insertion order`a gore diziller.

Queue da peek(), poll(), element(), remove() gibi ilk elemani ilgilendiren bir cok method vardir.
offer() method`u capacity kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir.
 */
public class Queue01 {
    public static void main(String[] args) {


        Queue<String> wareHouse = new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Honey, Tomatoes]


    /*
    Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
    When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
    Returns: true if the element was added to this queue, else false
    Throws:
    ClassCastException – if the class of the specified element prevents it from being added to this queue
    NullPointerException – if the specified element is null and this queue does not permit null elements
    IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */
        wareHouse.offer("Potatoes");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Honey, Tomatoes, Potatoes]




    }
}
