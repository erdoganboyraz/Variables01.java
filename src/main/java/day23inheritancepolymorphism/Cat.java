package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cat meow");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }
//Asagidaki method "Overriding Method"
    @Override
    public Mammal create() {
        return new Mammal();
    }
    /*
    @Override annotation`ini kullanarak, Java`nin yaptigimiz Override islemini kontrol etmesini saglariz.
    1)Override yaparken "method`un body"si degistirilir.
    2)Override yaparken asla "method signature`a(isim ve parametre)" degsitirilemez.
    3)Override yaparken "Inheritance" olmak zorundadir.
    4)Override yaparken "Access Modifier"lar belli kurallara gore farklilastirilabilirler.
           i)Private method`lar override edilemezler.
           ii)Child Class`daki "override edilen" method`un access modifier`i Parent Class`daki method`un access modifier`i
           ile ayni veya genis olmalidir.
           Note: Child Class`daki method`un access modifier`i daha dar olamaz.
           iii)"Default method"lar ayni package icindeyse override edilebiler. Farkil package`den override edilemezler.
    5)Parent Class`daki method`un "return type"i void ise "return type" degistirilemez.
    6)Parent Class`daki method`un "return type"i primitive ise "return type" degistirilemez.
    7)Parent Class`daki method`un "return type"i wrapper ise "return type" degistirilemez.
    8)Parent Class`daki method`un "return type"i Parent Class ise "return type"i child`lardan biri olabilir.
    Note : Child Class`daki return type Parent Class`dakinden genis olamaz.
    Note : Aralarinda "Parent Child" iliskisi olmayan Class`lar overriding`de Return Type degisiminde kullanilamazlar.
           Mesala "Short" , "Integer"den kucuktur, fakat aralarinda "Parent Child" iliskisi olamdigindan "Integer" yerine
           "Short" kullanamazsiniz.
    Note : Child`daki method`un Return Type`indan Parent`daki method`un Return Type`ina gidiste "IS-A" Relationship olmali.
           Bunun tam tersi "HAS-A" dir.
    Note : Aralarinda "IS-A" Relationship Data Type`lara "Covariant" denir.
    9)Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
    HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
    10)"final" method`lar Override edilemezler,cunku Overriding`de method body degistirilir,
    fakat "final method body degistirilmesine musade etmez.
    11)Polymorphism = Overloading + Overriding
    Note : Polymorphism nedir? derlerse Overloading ve Overriding anlatin.
    12)Overloading ve Overriding arasindaki farklar nelerdir?
       i)Overloading icin Inheritance gerekmez fakat Overriding icin gerekir.
       ii)"private" method`lar Overload edilebilir,Override edilemezer.
       iii)"final" method`lar Overload edilebilir, Override edilemezler.
       iv)"Overloading" "static polymorphism" olarak, Overriding "dynamic polymorphism" olarak adlandirilir.
           Cunku static method`lar Overload edilebilir, Override edilemezler.
       v)"Overloading" de method signature degisir ama Overriding`de method signature`a dokunulmaz.
     */
}
//Polymorphism) kavramı birçok türe sahip olmak anlamına gelmektedir.
// Gerçek hayattan örnek vermemiz gerekirse; bir
// kişinin birden fazla görevi yapması, misal erkek olan biri,
// bir koca, bir çalışan veya bir baba olabilir.