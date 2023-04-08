package Odev_OOP.Soru3;

public class Samsung extends Phone {
    /*Samsung class'ın içinde;
    Phone class'ı extend edin.
    option method'u override edin.
    parametre olarak 2 String vardır.
    Eğer birinci String 256 GB ve 5.5 inch ise
    cart arraylist'ine "$1000" ekleyin.
    Eğer birinci String 256 GB ve 7.5 inch ise
    cart arraylist'ine "$1200" ekleyin.
    Eğer birinci String 512 GB ve 5.5 inch ise
    cart arraylist'ine "$1300" ekleyin.
    Eğer birinci String 512 GB ve 6.5 inch ise
    cart arraylist'ine "$1400" ekleyin.*/


    @Override
     public void options(String str1, String str2) {
        if (str1.contains("256 GB") && str2.contains("5.5 inch")) {
            cart.add("$1000");
        } else {
            if (str1.contains("256 GB") && str2.contains("6.5 inch")) {
                cart.add("$1200");
            } else {
                if (str1.contains("512 GB") && str2.contains("5.5 inch")) {
                    cart.add("$950");
                } else {
                    if (str1.contains("512 GB") && str2.contains("6.5 inch")) {
                        cart.add("$1200");

    }}}}}





}
