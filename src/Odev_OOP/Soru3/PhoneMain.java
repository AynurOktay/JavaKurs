package Odev_OOP.Soru3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {
       /* 4 class oluşturulmuştur. Phone, Apple, Samsung, Main

        Main class'ının içinde;
        scanner class object yarat.
        iki adet String oluşturun str1, str2 ve scanner object'ini String'lere atayın.
        apple class'ı için object oluştur.
        options method'unu apple class'ının içine çağır.
                options parametreleri, daha önce oluşturulan iki String'lerdir.
        İki adaet String oluşturun. str3 ve str4, sonra scanner object'i bu String'lere atayın.
        samsung class'ı için object oluşturun.
        options method'unu samsung class'ının içinde çağırın.
                options parametreleri daha önce oluşturulan iki String'dir.
        getSum method'unu Phone class'ının içinden çağırın.
                sonucu yazdırın.*/

        Scanner scan=new Scanner(System.in);

        System.out.println("Apple capacity:");
        String str1=scan.nextLine();
        System.out.println("Apple screen size:");
        String str2=scan.nextLine();

        Apple iphone=new Apple();
        iphone.options(str1,str2);
        iphone.getSum(Phone.cart);
        System.out.println( iphone.getSum(Phone.cart));

        System.out.println("Samsung capacity:");
        String str3=scan.nextLine();
        System.out.println("Samsung screen size:");
        String str4= scan.nextLine();

        Samsung s22=new Samsung();
        s22.options(str3,str4);
        s22.getSum(Phone.cart);
        System.out.println(s22.getSum(Phone.cart));

        System.out.println("Sum:" +iphone.getSum(Phone.cart)+s22.getSum(Phone.cart));

     /*   Scanner oku=new Scanner(System.in);
        System.out.print("Apple için kapasite tercihinizi  giriniz     ( 128-256 (GB) )  = ");
        String cap= oku.nextLine();
        System.out.print("Apple için ekran boyutu tercihinizi giriniz  ( 5.5/6.5 (inch)) = ");
        String size= oku.nextLine();

        apple apple=new apple();
        apple.options(cap,size);

        System.out.print("Samsung için kapasite tercihinizi  giriniz     ( 256-512 (GB) )  = ");
        String capS= oku.nextLine();
        System.out.print("Samsung için ekran boyutu tercihinizi giriniz  ( 5.5/7.5 (inch)) = ");
        String sizeS= oku.nextLine();

        samsung samsung=new samsung();
        samsung.options(capS,sizeS);

        System.out.println("Toplam ödeme = "+phone.getSum(phone.card)+"$");*/



    }
}
