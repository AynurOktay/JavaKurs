package _Gun_33_Inheritance.soru;

public class SirketMain {
    public static void main(String[] args) {


        /*Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
        consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.
                GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
        GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
        SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
        maaşları hesaplatıp, bordroyu yazdırınız.  */


        Calisan calisan1 = new Calisan("Aynur", "Oktay", 3000, 3);
        System.out.println("calisan1 = " + calisan1);

        GenelMudur GenelMdr = new GenelMudur("Ahmet", "Yilmaz", 5000, 5, 2000);
        System.out.println("GenelMdr = " + GenelMdr);



    }
}