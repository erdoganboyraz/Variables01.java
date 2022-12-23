package day12loops;

import java.util.Scanner;

public class NestedForLoops01 {
    public static void main(String[] args) {

        //Example 1: Asagidaki sekli ekrana yazdiran kodu yaziniz
        //          ****
        //          ****
        //          ****
        Scanner input = new Scanner(System.in);

        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = input.nextInt();

        System.out.println("Karakter seciniz");
        char ch = input.next().charAt(0);

        for(int i=1; i<satir+1; i++){
            for(int k=1; k<sutun+1; k++){
                System.out.print(ch);
            }
            System.out.println();
        }
        /*
                Example 2: Asagidaki sekil cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */
        for(int i=1; i<3; i++){
            for(int k=1; k<=i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        /*
                Example 3: Asagidaki sekil cizen kodu yaziniz

                            * * * *
                            * * *
                            * *
                            *
         */
        int row = 2;
        for(int i=1; i<=row; i++){
            for(int k=row; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }


        //Yukaridaki hocanin buradaki benim

        //Asagidaki sekli yazan kodu yaziniz.
        /*
        ****
        ****
        ****
         */
        System.out.println("Satir sayisini giriniz.");
int satir3 = input.nextInt();
        System.out.println("Sutun sayisini giriniz.");
int sutun3 = input.nextInt();
        System.out.println("Karakteri giriniz.");
        char ch1 = input.next().charAt(0);

        for (int k=1;k<=sutun3;k++){
    for ( int i=1 ;i<=satir3;i++){



            System.out.print(ch1);
        }
        System.out.println();
    }

/*
                Example 2: Asagidaki sekil cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */


for (int i =1;i<6;i++){


    for (int k=1;k<=i;k++) {
        System.out.print(k + " ");

    }
    System.out.println();
}

/*
                Example 3: Asagidaki sekil cizen kodu yaziniz

                            * * * *
                            * * *
                            * *
                            *
         */

int wor =4;
for (int i=1;i<=wor;i++){

    for (int k=wor;k>=i;k--){
        System.out.print("* ");
    }
    System.out.println();
}









    }
}

