package _Gun_33_Inheritance._02_Inheritance;

public class HayvanatBahcesi {
    public static void main(String[] args) {
//    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.

        Kopek kopek1=new Kopek("beyaz",50,"kangal");
        Kedi kedi1=new Kedi("siyah",6,"Tekir");
        Yilan yilan1 =new Yilan("Kirmizi" ,20,"Kobra",5);
        Ordek ordek1=new Ordek("Siyah",3,"gövel",3);
        kopek1.konustu();
        kedi1.konustu();
        ordek1.konustu();
        yilan1.konustu();
        System.out.println("ordek1 = " + ordek1);
        System.out.println("yilan1 = " + yilan1);
        System.out.println("kedi1 = " + kedi1);
        System.out.println("kopek1 = " + kopek1);
    }
}
