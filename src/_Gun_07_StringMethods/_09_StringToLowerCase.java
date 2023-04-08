package _Gun_07_StringMethods;

public class _09_StringToLowerCase {
    public static void main(String[] args) {

        //kucuk harfe ceviriyor

        String text="Merhaba Dünya";
        System.out.println("text.toLowerCase()=" +text.toLowerCase());

        System.out.println("me ile ME ile basliyor mu="+text.toLowerCase().startsWith("me"));


        System.out.println("text = " + text);//kendisine atama yapmadiysak text degismez



    }
}
