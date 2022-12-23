package day26exceptions;

public class Exceptions01{
    public static void main(String[] args) {

  String str ="123";
  int result = convertStringToInteger(str);//NumberFormatException : Eger icinden rakamdan farkli character barindiran bir Stirng`in
                                           //                        valueOf() kullanarak Integer`e cevirmek isterseniz NumberFormatException alirsiniz.
        System.out.println(result+5);

  String st="1a23";
  int sonuc = convertStringToInteger(st);
        System.out.println(sonuc+10);
        String s="1a2b";
        int sonuc1 = convertStringToInteger(s);
        System.out.println(sonuc1+10);

    }

    public static int convertStringToInteger(String str){
      int i = 0;
       try {
           //Herganbir satirda "Exception" atilirsa Java direk "catch" bolumune gecer try icindeki sonraki kodlari calistirmaz.
           i = Integer.valueOf(str);
           System.out.println("Burasi try bolumu");
       }catch (NumberFormatException e){
           System.out.println("Rakam olmayan karaker iceren String`ler Integer`e cevrilemez==>"+e.getMessage());
       }
        return i;
    }

}
