package _Gun_07_StringMethods;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
         //replace gibi calisir,farki Kriter(regex) verilebiliyor
        //regex:regular expression /düzenli ifadeler

        String text ="Merhaba Dunya123";

        System.out.println("text=" +text);
        System.out.println("abn -> _ =" + text.replaceAll("[abn]", "_"));
        // a veya b veya n leri _yap  ->Merh___ Dü_y_123 yazdirir

        System.out.println("A-Z -> =" +text.replaceAll("[a-z]", "_"));

        System.out.println("0-9 ->_=" +text.replaceAll("[0-9]",""));
        System.out.println("0-9 disindakiler="+text.replaceAll("[^0-9]",""));

    }
}
