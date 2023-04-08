package _Gun_41_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class javaLocalDateTime {
    public static void main(String[] args) {

        //hem tarih hem saat bilgisini tutar
        
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);
        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getDayOfWeek() = " + dt.getDayOfWeek());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());
        System.out.println("dt.getNano() = " + dt.getNano());

        System.out.println("ISO_DATE_TIME) = " + dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("SHORT = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        //Ozel formatta istedigimiz gibi yazdirma
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("dt.format(f)= " + dt.format(f));


    }
}
