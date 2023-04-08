package _Gun_40.Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaLocalDate {
    public static void main(String[] args) {

        //Local date sadece gun, ay ,yil bilgisini tutar
        LocalDate tarih=LocalDate.now();


        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        //Kendisindeki hazir formatlar:
        System.out.println("ISO DATE= " + tarih.format(DateTimeFormatter.ISO_DATE));//Uluslararasi format
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("*****************");
        //Lokalde aldigim tarihi istedigim ülkenin formatina ve diline gore göstermek:

        System.out.println(tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US)));
         //amerikanin formatina gore yazdirdik.Ama her ulke metodda yazmiyor.
        //Bu durumda lokalizasyon tanimlamasina göre ekleyecegiz.Bunun icin once lokali buluyoruz


        Locale lokalTurkce=new Locale("tr","TR");
        System.out.println(tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalTurkce)));

        /*Lokalizasyon tanimlamalari ornekler:
        en-US :Birincisi dil,ikincisi ulke
         en-UK
         fr-CA
         tr-TR
           */
        //Loklaizasyon tanimlamalarini bulmak icin:
        Locale[] kullanilabilirLokaller =Locale.getAvailableLocales();

        for (Locale l: kullanilabilirLokaller) {
            if (l.getDisplayCountry().toLowerCase().contains("Turkey")){
                System.out.println("Dil="+l.getDisplayLanguage());
                System.out.println("Ulke="+l.getDisplayCountry());
            }
        }
        //Kendi istedigimiz formatta yazdirmak :

       DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("ozelFormat1 = " + tarih.format(ozelFormat1));
        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("ozelFormat2 = " + tarih.format(ozelFormat2));

        //Kendi belirledigimiz tarihio yazdirmak:

        LocalDate tarih1=LocalDate.of(2005,5,20);
    }
}
