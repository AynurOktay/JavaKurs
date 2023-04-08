package _Gun_07_StringMethods;

public class _10_StringToUpperCase {
    public static void main(String[] args) {

        //stringi buyuk harfe cevirir

        String text="Merhaba Dunya";
        System.out.println("orjinal hali= "+text);
        System.out.println("text.toUpperCase()= " + text.toUpperCase());

        System.out.println("me veya ME ile basliyor mu?=" +text.toUpperCase().startsWith("ME"));


    }
}
