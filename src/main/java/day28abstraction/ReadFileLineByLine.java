package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
"throw" ile "throws" arasindaki farklar nelerdir?

1)"throw" method`un body`si icinde kullanilir. "throws" ise method`un ismninden sonra kullanilir.
2)"throw" dan sonra object olusturulur. "throws" dan sonra ise sadece Exception Class`in ismi yazilir.
3)"throw"  method`un icinde istedigimiz yerde Exception uretmek icin kullanilir. "throws" ise var olan checked Exception`i atmak icin kullanilir.
4)"throw" dan sonra sadece bir tane Exception olabilir."throws" dan sonra birden fazla Exception olabilir.




 */
public class ReadFileLineByLine {
    public static void main(String[] args) {

        readFileLineByLine();

    }


    public static void readFileLineByLine(){

//Java dosyalari okumak icin "BufferedReader" adinda bir Class olusturmustur. Bu Class excel ve pdf gibi dosyalarida okumamizi saglar.
//FileReader bir Class Java`da  bu`da obje ile calisir ve dosyanin path`i yani adresi ile caisir.
//"  BufferedReader br = new BufferedReader(new FileReader"Java burda yine sikayet etti.
// Cunku bu adres yanlissa yada o adresde dosya yoksa diye sikayet etti.Bizde burada "try-catch" ile cozum yaptik.
//"br.readLine()" i yazdigimizda da Java`ya satiri oku dedik ama yine sikayet etti. Cunku Java soyle dusunuyor ya o satirda bilmedigim bir karakter varsa
// diye sikayet etti. Bizde yine "catch" kullanarak sikayeti giderdik.
// Asagida da gordugumuz gibi Exception`da basta Child Exception`u akdi sonra Paretn Exception`u  catch ile aldi.
//"br.readLine()" bize bir String dondurcegi icin String bir konteynirin icine attik.
//"readLine()" okunacak olan dosyaya gider ve oradan dosyayi ilk satiri alip okur vve bizim String ifademizin icine koyar.
//Biz de bu dosyada`ki tum satirlari okumak icin bu line`i loop icinde kullanarak dosyanin tamamini okumus oluruz.
//while loop icinde line!=null yapmamizin sebebi dosyadaki cagirdimiz satir null`a esit olmadigi icin kod dogru olacak ve bize ilk satiri verecek.
//En son null olana kadar bu kod calisacak. Ayrica kodun icinde bir kac satir bosluk biraksak bile okur. Cunku Java`da bosluk null degildir.
//Daha sonra biz bu method`u main method`un icinde cagirdigizda biz bu dosyadaki yazanlari consolda gorecegiz.


        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\java1\\day27exceptions\\File1.text"));

        String line = br.readLine();

        while (line!=null){
            System.out.println(line);
            line = br.readLine();
        }


        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis==>"+e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak karakter veya karakterler var==>"+e.getMessage());
        }


    }

}
