package _Gun_27_StaticMethods;



public class Static_ornek {
    public static void main(String[] args) {

        int sayi=345;
        String strSayi=String.valueOf(sayi);   //bu metodlar static oldugu icn direk calisiyor.kendi olusturdugumuz metodlar gibi onceden tanimlamammiz gerekmiyor
        int intSayi=Integer.parseInt(strSayi);


        Utility ut=new Utility();
        //
        String strSayi2=ut.getString(sayi);
        String strSayi3=Utility.getString2(sayi);
    }
}
