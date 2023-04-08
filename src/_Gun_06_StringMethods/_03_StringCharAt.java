package _Gun_06_StringMethods;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // istenilen noktadaki karakteri verir
        // karakterlerin sirasi 0`dan baslar ve buna index denir

        String cumle="Merhaba Dunya";//length 13 ama karakterler 0-12 arasi

        char ilkHarf=cumle.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);

        char Harf=cumle.charAt(10);
        System.out.println("Harf = " + Harf);
    }
}
