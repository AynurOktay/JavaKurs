package _Gun_26_04_OdevElektrik;

public class ElektrikHesabi {

    int toplamTuketim=0;
    double birimFiyat=0.7;
    double fatura=0;

    public void tuketimEkle(int aylikTuketim){

        toplamTuketim=toplamTuketim+aylikTuketim;
    }

    public void toplamTuketimYaz(){

            System.out.println("toplam Tuketim="+toplamTuketim);

        }



     public void faturaYaz(String isim){

        fatura=toplamTuketim*birimFiyat;
         System.out.println("***************+***+");
         System.out.println("        Faturaniz");
         System.out.println("*********************");
         System.out.println("Musteri="+isim);
         System.out.println("Toplam Tuketim="+toplamTuketim);
         System.out.println("Toplam tutar"+Math.round(fatura));
         System.out.println("**********************");
    }


}
