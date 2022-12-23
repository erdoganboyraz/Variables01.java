package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

/*
 Arrays`larin icine sadece primitive data type`lari  ve refence`ler konabilir.
*/

  String str[]=new String[3];
  str[0]="Java";
  str[1]="did";
  str[2]="surprise you";

        System.out.println(Arrays.toString(str));

  /*
  String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz.
   */
  String arr[]={"Jane","Mark","Christopher","Tom","Ali","Rojda"};


  for (String w: arr){
      System.out.print(w+ " ");
      if (w.equals("Tom")){
          break;
      }
  }
        System.out.println();
  /*
  String bir Array olusturunuz."Tom" ve "Jane" haric tum elamanlari ekrana yazdiriniz.
   */
  String brr[]={"Jane","Mark","Christopher","Tom","Ali","Rojda"};
  for (String w:brr){
      if (w.equals("Jane") || w.equals("Tom")){
          continue;
      }
      System.out.print(w + " ");
  }
        System.out.println();
 /*
 Kullaniciyla beraber bir Array olusturunuz ve icine data ekleyiniz.
 Bir ogretmenin sinifindaki ogrenilerin ismilerini application`a yuklemesini saglayan kodu yaziniz.
  */

        Scanner input = new Scanner(System.in);

//        System.out.println("Kac ogrenci ismi gireceksiniz.");
//
//        int numOfStudents =input.nextInt();
//        String names[] =new String[numOfStudents];
//
//        System.out.println("Girisi sonlandirmak icin  Q harfine basiniz.");
//
//        for (int i=1;i<=numOfStudents;i++){
//            System.out.println("Lutfen " + i + ".ogrenci ismini giriniz");
//
//            String stdName=input.next();
//            if (stdName.equalsIgnoreCase("Q")){
//                break;
//            }
//
//            names[i-1] = stdName;
//
//
//        }
//        System.out.println(Arrays.toString(names));



/*
YUKARIDAKILER HOCANIN CANLI DERSTE DEDIKLERI ASAGIDAKILER BENIM TEKRARLARIMDIR.
 */

  /*
  Arrays`larin icine refenceler ve primitive data type`lari konabilir.
   */


String str5[] =new String[3];
str5[0]="Java";
str5[1]="did";
str5[2]="surpise you";
        System.out.println(Arrays.toString(str5));


/*
String bir array olusturunuz ve Tom`dan onceki tum elemanlari ve Tom`u yazdiriniz.
 */
String trr[]={"Jane","Mark","Christopher","Tom","Ali","Rojda"};


for (String w:trr){
    System.out.print(w + " ");

    if (w.equals("Tom")){
        break;
    }
}
        System.out.println();
/*
Example 2 :String bir array olusturunuz Tom ve Jane haric hepsini yazdiriniz.
 */
String yrr[]={"Jane","Mark","Christopher","Tom","Ali","Rojda"};

for (String w : yrr){


    if (w.equals("Jane") || w.equals("Tom")){
        continue;
    }
    System.out.print(w + " ");
}
        System.out.println();

/*
Examle 3 : KUllanici ile beraber array olusturunuz.
Bir ogretmeninin sinifindaki ogrencilerin isimlerin application`a yuklemsini saglayan kodu yaziniz.
 */
        System.out.println("Kac ogrenci ismi gireceksiniz.");
int numOfstd = input.nextInt();

        String isim[]=new String[numOfstd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");

for (int i=1;i<=numOfstd;i++){

    System.out.println("Lutfen " + i+". ogrenci ismini giriniz.");

    String stdIsim =input.next();

    if (stdIsim.equalsIgnoreCase("Q")){
        break;
    }
    isim[i-1]=stdIsim;




}

        System.out.println(Arrays.toString(isim));



    }
}
