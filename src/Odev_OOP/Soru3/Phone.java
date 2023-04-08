package Odev_OOP.Soru3;

import java.util.ArrayList;


public abstract class Phone {

    /*Phone'u super class yapın.
    cart isimli ,String'i alarak bir static arraylist oluşturun.
    getSum isimli, arraylist'i parametre aldığınız bir method oluşturun.
    ve return tipi int;
                 arraylist'in içindeki bütün seçenekleri elde edin ve sayısal olmayan karakterleri(a b c... A B C...) ve özel karakterleri (.,!'^+...)
                 sonra bunları int'e çevirin.
                 tüm sayıları toplayın.
                 ismi options olan bir abstract method oluşturun.

    arraylist'in içindeki bütün seçenekleri elde edin ve sayısal olmayan karakterleri(a b c... A B C...) ve özel karakterleri (.,!'^+...)
    sonra bunları int'e çevirin.
    tüm sayıları toplayın.

   ismi options olan bir abstract method oluşturun.*/




 public static ArrayList<String>cart=new ArrayList<>();


     public int getSum(ArrayList<String>toplam) {
           int sum=0;

         for ( String each  :  toplam ) {
             int eachInt=Integer.parseInt(each.substring(1));
             sum+=eachInt;
         }
           return sum;
     }


    public  abstract  void options(String str1, String str2);





}
