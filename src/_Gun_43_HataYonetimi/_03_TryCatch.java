package _Gun_43_HataYonetimi;

import java.time.LocalDate;
import java.time.Month;

public class _03_TryCatch {
    public static void main(String[] args) {


        System.out.println("Program calismaya basladi");

        try { //try hatanin basladigi yerin ustune konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);

        }//hata oldugu zaman programi kirma devam et demek
        catch(Exception ex)
            //ex isimli degiskenden olusan hatalarin bilgisi ataniyor
        { //hata oldugunda yapilmasi istenenler buraya yaziliyor
            System.out.println("Hata olustu, lütfen tekrar deneyiniz");
            System.out.println("Tum hata mesaji=" + ex); //hatayla ilgili tum mhata measajini yazdirir
            System.out.println("Hatanin aciklamasi=" + ex.getMessage()); //sadece hatanin aciklamasini yazdirir
            //kendine hata mesaji mail atabilirsin
            //log tutma; program nasil calisiyor ,hata loglarini harddiske yazabilirsin
        }
        System.out.println("Program bitti");
        try {
            //JAva ve toollari calismaya devam et
            //Konulari ogrenmeye ve calismaya devam
            // anlamadigin yer mi oldu?kirilmadan devam et
        }
        catch (Exception ex){
            //hatanin sebebini anla
            //derse daha fazla odaklan
            //gereken videolari izl
            //grup calismasi yap


        }


    }
}
