package _Gun_36_Interface.Interface_Soru;

public class Main {
    public static void main(String[] args) {
        /*Kare, Dikdortken sınıflarından oluşacak bir geometri programı
        yapılmak isteniyor.bunların ayrı ayrı , fakat ortak metodlarının
        (cevresi() ve alani() )zorunlu olabilmesi için gerekli yapıyı kurunuz ve yazınız.*/

         Dikdortgen d=new Dikdortgen();
        System.out.println(d.alan(4,5));
        System.out.println(d.cevre(4,5));


        Kare k=new Kare();
        System.out.println(k.cevre(5));
        System.out.println(k.alan(5));


    }
}
