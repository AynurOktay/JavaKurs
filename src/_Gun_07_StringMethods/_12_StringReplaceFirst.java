package _Gun_07_StringMethods;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
   //bir string icindeki verilen karakterden sadece ilkini degistirir.

        String text="Merhaba Dünya";
        System.out.println("text = " + text);
        System.out.println("text.replaceFirst(a,e)" + text.replaceFirst("a","e"));
        //Merhebe Dünye yazar

        System.out.println("text.replaceFirst(Dunya,Java) = "
                + text.replaceFirst("Dunya","Java"));

        System.out.println("text.replaceFirst(a,' ');"
                +text.replaceFirst("a",""));//ilk a silindi.boslukla replace ettik



    }
}
