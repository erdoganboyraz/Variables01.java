package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //while-loop icin loop body'si icindeki kodun hic calistirilmama ihtimali vardir.
        //zero execution mumkundur
        int i = 1;
        while(i<1){
            System.out.println("While loop");
            i++;
        }
        //do-while loop'un body'si icindeki kod her halikarda en az bir kere calisir
        //zero execution mumkun degildir
        int k = 1;
        do{
            System.out.println("do-while loop");
            k++;
        }while(k<1);

        //Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //           24.5673 ==> 5+6+7+3 = 21
        double num = 24.5673;
        System.out.println(num);//24.5673

        //String.valueOf() methodu parantezin icine konulan data nin tipine String yapar
        String str = String.valueOf(num);
        System.out.println(str);//24.5673

        //Regex icin nokta kullandiginizda onune "\\" koyunuz. Yani nokta "\\." seklinde kullanilir
        String decimalPart = str.split("\\.")[1];


        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);//5673

        int sum = 0;

        do{

            sum = sum + decimalInt%10;

            decimalInt = decimalInt/10;

        }while(decimalInt>0);

        System.out.println(sum);




        /*
        Hocanin yaptiklari yukarida benimkiler asgida.
         */
         /*
         While=loop bazi durumlarda hic salimayabilier.Yani while-loop icin "zero execution"mumkundur.
         Dusunerek is yapar.Cunku once dusunur sonra hareket eder.Yani once kodun yapilip yapilmadigina bakar,yapilamazsa
         calismaz.While-loop icin loop body`si icindeki kodun hic calistirilmamam ihtimali vardir.
          */
        int s =1;

        while (s<1){
            System.out.println("While Loop");
            s++;

        }

    int g = 1;
        do {
            System.out.println("do-while-loop");
            g++;
        }while (g<1);
/*
do-while-loop kullandigimizda loop body`si icindeki kod en az bir kere calisir.Yani do-while-loop icin "zero execution"
mumkun degilir.
Dusunmeden calisir.Once isi yapar sonra isin yapilip yapilmadigina bakar.Do-while loop`un boddy`si icindeki kod her halukarda en az bir kere calisir.
 */





    //Exampe s : Bir ondalik sayinin ondalik kismindaki  rakamlarinin toplamini bulunuz.
        //24.5673==>5+6+7+3==>21

         double ondalik =24.5673;
        System.out.println(num);
       String str1 = String.valueOf(ondalik);//Bu method parantezin icine konulan datanin tipini String yapar.
        System.out.println(str1);
//regex icin nokta kullanidiginiz zaman onune "\\" koyunuz.Yani nokta "\\."seklinde kullaniniz.
   String decimalPart1 = str1.split("\\.")[1];
        System.out.println(decimalPart1);

   int newDecimalPart = Integer.valueOf(decimalPart1);
        System.out.println(newDecimalPart);


    int sum2 = 0;


   do {

       sum2 =sum2+newDecimalPart%10;
      newDecimalPart = newDecimalPart/10;


   }while (newDecimalPart>0);

        System.out.println(sum2  );





    }

}

