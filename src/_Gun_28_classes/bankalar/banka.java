package _Gun_28_classes.bankalar;

public class banka {// Bir banka class ı tanımlayınız.
   // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
   // 3 adet constructor ekleyin.
   // toString metodu oluşturun.
   // 3 tane nesne oluşturup mainde yazdırıN


   String adi;
   int subeSayisi;
   int kurulusYili;

   public banka(String adi, int subeSayisi, int kurulusYili) {
      this.adi = adi;
      this.subeSayisi = subeSayisi;
      this.kurulusYili = kurulusYili;
   }

   public banka() {
   }

   public banka(String adi, int subeSayisi) {
      this.adi = adi;
      this.subeSayisi = subeSayisi;
   }

   @Override
   public String toString() {
      return "banka{" +
              "adi='" + adi + '\'' +
              ", subeSayisi=" + subeSayisi +
              ", kurulusYili=" + kurulusYili +
              '}';
   }
}