package _Gun_29_AccessModifiers.Soru;

public class Banka {
    public static void main(String[] args) {
        // Hesap (yatan(int), cekilen(int), bakiye(int))
        // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
        // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
        // bakiyeye direk para atanamadıgını kontrol ediniz.

        Musteri musteri1=new Musteri();

         musteri1.ad="Aynur ";
         musteri1.soyad="Oktay";
         musteri1.musteriNo=1;

         musteri1.musteriHesap.paraYatir(100);
         musteri1.musteriHesap.paraYatir(200);
         musteri1.musteriHesap.paraCek(50);

        System.out.println(musteri1.musteriHesap);
    }
}
