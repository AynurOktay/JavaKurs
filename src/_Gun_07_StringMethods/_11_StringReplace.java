package _Gun_07_StringMethods;

public class _11_StringReplace {
    public static void main(String[] args) {
        //bir string icindeki karakterleri verilenle degistirir

        String text="Merhaba Dünya";
        System.out.println("text = " + text);
        System.out.println("text.replace(a,e)" + text.replace("a","e"));
        //Merhebe Dünye yazar

        System.out.println("text.replace="+text.replace("ba","be"));

        System.out.println("text.replace(Dünya,Java) = "
                + text.replace("Dünya","Java"));
        System.out.println("text.replace(a,' ')=" + text.replace("a",""));





    }

}
