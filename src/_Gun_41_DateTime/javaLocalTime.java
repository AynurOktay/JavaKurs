package _Gun_41_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class javaLocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println("saat="+saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());
        
        //kendimize ozel format:

        DateTimeFormatter of1=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("saat.format(of1) = " + saat.format(of1));

        DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk:mm ");
        System.out.println("saat.format(of2) = " + saat.format(of2));

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("k:mm ");
        System.out.println("saat.format(of3) = " + saat.format(of3));

        /*********************************/
        
        LocalTime saat1=LocalTime.of(7,34,45);
        System.out.println("saat1.format(of3) = " + saat1.format(of3));
        
    }
}
