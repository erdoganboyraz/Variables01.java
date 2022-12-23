package atmproject;
/*
***Uygulamaların 3 özellikli yönü vardır.
1)User Interface / Arayüz ==> Kullanıcının etkileşinde olduğu her yer.
2)Data base / Veri bankası ==> Uygulamada girilen bilgilerin depolandığı yer.
3)API ==> Uygulamalar'ın birbileri arasındaki Ağ'ı kurar
 */
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{

    Scanner input =new Scanner(System.in);
DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");

boolean flag=true;

HashMap<Integer, Integer> data = new HashMap<>();



public void login(){

    System.out.println("Techproed ATM`e hos geldiniz!");

    do {

        data.put(12345,1234);
        data.put(23456,2345);
        data.put(34567,3456);
        data.put(45678,4567);


        try {

            System.out.println("Hesap numarainizi giriniz");
            setAccoutNumber(input.nextInt());
            System.out.println("Pin numaranizi giriniz");
            setPinNumber(input.nextInt());

        }catch (Exception e){
System.out.println("Yanlis karaker girdiniz! Lutfen sadece rakam giriniz veya Q ya basip cikabilirsiniz");

input.nextLine();

String exit =input.next();

if (exit.equalsIgnoreCase("q")){
    flag=false;
 }
   }

     int count=0;

        for (Map.Entry<Integer, Integer> w: data.entrySet()){

            if (w.getKey().equals(getAccoutNumber()) && w.getValue().equals(getPinNumber())){

                getAccountTypes();//heasp islemlerine gidiniz.

            }else {

                count++;
            }
        }

        if (count==data.size()){
            System.out.println("Yanlis hesap numarasini veya pin numarasi giriniz");
        }



    }while (flag);
}





    //Checking hesap islemleri ==>vadesiz hesap islemleri
    public void  checkingOperations(){

        do {
           displayMessage();
            int option = input.nextInt();

            if (option==4){
                break;
            }

            switch (option){
                case 1:
                    System.out.println("Checking hesabinizda kalan bakiye :"+moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("Yanlis secenek! Lutfen 1,2,3 veya dordu kullaniniz");
            }
        }while (true);

        getAccountTypes();

    }


    //Saving hesap islemleri ==> vadeli hesap islemleri
    public void savingOperations(){

do {
displayMessage();

int option =input.nextInt();

if (option==4){
    break;
}
switch (option){
    case 1:
        System.out.println("Saving hesabinizda kalan bakiye: "+ moneyFormat.format(getSavingBalance()));
         break;
    case  2:
        getSavingWithdraw();
        break;
    case 3:
        getSavingDeposit();
        break;
    default:
        System.out.println("Yanlis secenek! Lutfen 1,2,3 veya dordu kullaniniz");
}

}while (true);
getAccountTypes();
    }

    //Ilgili hesabi seciniz.
    public void getAccountTypes(){

        System.out.println("Islem yapmak istediginiz hesabi seciniz");
        System.out.println("1: Checking Account:");//vadesiz hesap
        System.out.println("2: Saving Account");//vadeli hesap
        System.out.println("3: Quit");//cikis

        int option = input.nextInt();

        switch (option){

            case 1:
                System.out.println("Checking/vadesiz hesabindasiniz");
                checkingOperations();
                break;
            case 2:
                System.out.println("Saving/vadeli hesabinsiniz");
                savingOperations();
                break;
            case 3:
                System.out.println("ATM makinemizi kullandiginiz icin tesekkur edeirz.");
                flag=false;
                break;
            default:
                System.out.println("Yanlis secenek! Lutfen 1,2 veya 3`u  kullaniniz");
        }

    }



   //Kisi icin secenekleri goruntule
   public void displayMessage(){
       System.out.println("Option seciniz!");
       System.out.println("1: View balance");//bakiyenizi kontrol ediniz
       System.out.println("2: Withdraw");// para cekme
       System.out.println("3: Deposit");//para yatirma
       System.out.println("4: Exit");//islemi sonlandir
   }

}
