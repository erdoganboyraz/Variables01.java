package day23inheritancepolymorphism;

public class Animal {

    public void eat(){
        System.out.println("Animal eat");
    }
    public int add(int a,int b){
        return a+b;
    }
    public Integer multiply(int a,int b){
        return a*b;
    }
    //Asagidaki method "Overridden Method"
    public Animal create(){
        return new Animal();
    }
    //"final" method`lar override edilemezler.
public final double divede(int a,int b){
        return a/b;
}

}
