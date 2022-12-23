package day32maps;

public class Students {

    public  String name;
    public  String email;
    public  int age;
    public  boolean success;


    public Students(String name, String email, int age, boolean success) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;
    }

    //toString() method`u bu class`dan olusturdugunuz objelerin detaylarini bize yazar.
    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", yas=" + age +
                ", success=" + success +
                ']';
    }
}
