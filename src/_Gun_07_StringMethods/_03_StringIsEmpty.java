package _Gun_07_StringMethods;

public class _03_StringIsEmpty {
    public static void main(String[] args) {

        //bir stringin icinde bisey var mi yok mu diye soruyor
        //boolean verir


        String s1="Merhaba";
        System.out.println("s1.isEmpty()=" + s1.isEmpty());// false

        String s2=" ";
        System.out.println("s2.isEmpty()=" + s2.isEmpty()); //false .arada bosluk var.Bosluk ta bir karakterdir
                                                            //bu yuzden bos degil,sonuc false

        String s3="";
        System.out.println("s3.isEmpty()=" + s3.isEmpty());//true.burda tirnagin icinde bisey yok
    }
}
