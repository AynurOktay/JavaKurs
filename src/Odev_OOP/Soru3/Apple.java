package Odev_OOP.Soru3;

import java.util.Arrays;

public class Apple extends Phone {
    @Override
    public void options(String str1, String str2) {
        if (str1.contains("64 GB") && str2.contains("5.5 inch")) {
            cart.add("$750");
        } else {
            if (str1.contains("64 GB") && str2.contains("6.5 inch")) {
                cart.add("$850");
            } else {
                if (str1.contains("128 GB") && str2.contains("5.5 inch")) {
                    cart.add("$950");
                } else {
                    if (str1.contains("128 GB") && str2.contains("6.5 inch")) {
                        cart.add("$1200");

                    }}}}}
}
   /* Apple class'ın içinde;
    Phone class'ı extend edin.
    option method'u override edin.
    parametre olarak 2 String vardır.
    Eğer birinci String 64 GB ve 5.5 inch ise
    cart arraylist'ine "$750" ekleyin.
    Eğer birinci String 64 GB ve 6.5 inch ise
    cart arraylist'ine "$850" ekleyin.
    Eğer birinci String 128 GB ve 5.5 inch ise
    cart arraylist'ine "$950" ekleyin.
    Eğer birinci String 128 GB ve 6.5 inch ise
    cart arraylist'ine "$1200" ekleyin.*/




