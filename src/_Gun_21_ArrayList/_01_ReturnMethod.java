package _Gun_21_ArrayList;

public class _01_ReturnMethod {
    public static void main(String[] args) {
        //parametreler ayni tip ,sadece miktarlari farkli olan degerlerle islem yapraken farkli metodlar olusturmustuk
        //bu tip durumlar icin bir kolaylik saglanmis.(mesela int... sayilar yazarsak kac deger yazarsak yazalim ayni islemi yapar)
        //bu sekilde yazinca for döngüsüyle metodu bir dizi gibi yazdiriyoruz
        //Bir metodta sadece 1 tane parametre olabilir.
        //Ama bu sekilde yazinca gelen kac sayi olursa olsun hrpsini  dizi seklinde metoda al


        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;

        int sonuc1 = toplamBul(s1, s2);
        int sonuc2 = toplamBul(s1, s2, s3);
        int sonuc3 = toplamBul(s1, s2, s3, s4);


        System.out.println("sonuc1=" + sonuc1);
        System.out.println("sonuc2=" + sonuc2);
        System.out.println("sonuc3=" + sonuc3);
    }
        //gelen kac sayi olursa olsun hepsini  dizi seklind metoda alir
    public static int toplamBul(int... sayilar) { //kac sayi gelirse gelsin onlari dizi haline getirir.isterse 100 sayi olsun toplamBul metoduyla toplar.
                                                  //return kullandigiiz icin sonucu mainde yazdirir
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam = toplam + sayilar[i];
        }

        return toplam;



    }
}