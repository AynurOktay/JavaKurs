package _Gun_34_Inheritance.Inheritance_soru1;

public class AracPark {
    public static void main(String[] args) {
        // 1- Arac isimli bir superclass olusturunuz, fields : renk, motorHacmi, marka olsun.
        // 2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
        // 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuKapasitesi field ını ekleyiniz.
        // 4- Bir AracPark isimli içinde main olan bir sınıf olucturunuz ve Otobus ten
        //    nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.

        Otobus bus =new Otobus("mavi",1.8,"BMW",40);
        System.out.println("bus = " + bus);

        //ya da;
        System.out.println("Renk="+bus.getRenk());
        System.out.println("Marka="+bus.getMarka());
        System.out.println("Motor hacmi="+bus.getMotorHacmi());
        System.out.println("Yolcu kapasitesi="+bus.getYolcuKapasitesi());


    }
}
