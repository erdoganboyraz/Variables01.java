package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    /*
    1)FileInputStream fis = new FileInputStream("src\\main\\java\\java1\\day27exceptions\\File1.text");
      new`den sonraki "FileInputStream" hata verir. Cunku; biz Java`ya verilen adresteki dosyaya git dedik, Java
      iki endiseye kapildi i)Ya adres yanlissa ii)Ya verilen adreste doya yoksa
      Biz "method isminden" sonra "throws FileNotFoundException" yazarak, Java`ya bu iki endise duydugun durum olusursa
      "Exception At" dedik.

    2)while((k=fis.read)!=-1){}yazdigimizda "read" method`u hata verir. Cunku biz Java`ya dosyadaki karakterleri
      oku dedik. Java bir endiseye kapildi i)ya okumasi gereke karakterler Java`nin bilmedigi karakterlerse
      Biz method isminden sonra "throws IOException" yazarak, Java`ya bu durumla karsilastiginda "Exception At" dedik.

    3)Method isminden sonra "throws IOException" yazarsaniz Java "throws FileNotFoundException` i siler. Cunku;
      "IOException" "FileNotFoundException" i kapsar. "IOException" "FileNotFoundException" un parent`idir, onun yaptigi
      herseyi yapabilir  o yuzden "IOExcetion" varken "FileNotFoundException" a gerek yoktur.

      "IOException", "Input Output Exception" demektir.

    4)Gordugunuz gibi "IOException" ve "FileNotFoundExeption" biz kod yazarken , daha "Run" butonuna basmadan ortaya cikti.
      Bu tarz "Exception" lara "Compile Time Exception" denir, diger adlari "Checked Exception" dir.

      "Compile Time Exception" lar kesinlikle halledilidir(Exception Handling), halletmeden code yazmaya devam etmeyiniz.


   */

    public static void main(String[] args) throws IOException {

readTheTextFromTheFile();
readTheText();
    }
    //Bir text file`deki text`i okuyan kodu yazininiz.
    //1.Way
    public static void readTheTextFromTheFile() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\java1\\day27exceptions\\File1.text");
        int k=0;
        while ((k= fis.read())!=-1){
            System.out.print((char)k);
        }
    }
    //2.Way
   public static void readTheText(){

       try {
           FileInputStream fis = new FileInputStream("src\\main\\java\\java1\\day27exceptions\\File1.text");
           int k=0;
           while ((k= fis.read())!=-1){
               System.out.print((char)k);
           }
       } catch (FileNotFoundException e) {
           System.out.println("Dosya`nin adresi veya varligi ile ilgili bir problem var.");
       } catch (IOException e) {
           System.out.println("Dosya`da okunamayan bir karakter var.");
       }


   }




}
