package _Gun_06_StringMethods;

public class _08_StringContains {
    public static void main(String[] args) {
        //contains:bir stringin icerisinde karakterlerin var olup
        //olmadigini boolean cinsinen soyler-true flase

        String cumle="Merhaba Dunya";

        boolean varMi=cumle.contains("a");

        System.out.println("varMi=" + varMi);

        //direkt te yapabiliriz
        System.out.println("varMi=" +  cumle.contains("a"));

        System.out.println("ya Varmi=" + cumle.contains("ya"));
    }
}
