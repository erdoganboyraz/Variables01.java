package day24statickeywordencapsulation;
    /*
        Encapsulation : "Data Hiding(Data Gizlemek)" demektir.
        Data`yi nicin gizlersiniz? Data`yi dis etkenlerden korumak icin.
        Data`yi nasil gizlesin? Access Modifier`i "private" yaparak gizlerim.

        Data`yi gizledikden sonra baska Class`lardan okumak istersen ne yaparsin?
        "get" method(getters)"lar olusturarak  gizledigimiz Data`lari okunur hale getirebiliriz.

        Data`yi gizledikten sonra baska Class`larden degistirmek istersen ne yaparsin?
        "set method" lar olusturarak gizledigimiz data`lari degistirebiliriz.

        Variable`in "data type" i ile get method`un "return type" i ayni olmalidir.

        get method`lari isimlendirirken "get + <variable name>" ancak variable`in data type`i "boolean" ise "is+<variable name>"
        */
public class Student {

public String stdName="Tom Hanks";
private String stdId ="TH202201";
private double gpa = 3.8;
private boolean retired = false;

        public String getStdId() {
            return stdId;
        }

        public double getGpa() {
            return gpa;
        }

        public boolean isRetired() {
            return retired;
        }


        public void setStdId(String stdId) {
            this.stdId = stdId;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public void setRetired(boolean retired) {
            this.retired = retired;
        }
    }
