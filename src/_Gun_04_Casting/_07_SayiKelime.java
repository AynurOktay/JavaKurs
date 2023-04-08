package _Gun_04_Casting;

public class _07_SayiKelime {
    public static void main(String[] args) {
        //sayilari birbirine cevirdik
        //bir de yazilarin rakama,rakamlari yaziya cevrilmesi var

        String ad="ismet";
        String kelimeSayi="65";//bu stringdir.sayiya cevirmek icin int'e cevirmem lazim
                               //string halde isleme giremez.sayiya(int'e )cevirince islem yapabilirim


        int sayiDeger=Integer.parseInt(kelimeSayi);
         int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        //Stringe dönüstürmek icin:

        String strToplam=Integer.toString(toplam);
        System.out.println("strToplam = " + strToplam);
    }
}
