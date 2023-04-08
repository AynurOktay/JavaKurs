package _Gun_41_DateTime;

import Utility.Saat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Doru1_DigitalSaat {
    public static void main(String[] args) {
        //Canli digital saat yapiniz.


        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");

        while(true){
            LocalTime saat =LocalTime.now();
            System.out.print(("\r" +saat.format(f)));
            Saat.Bekle(1);
        }
    }
}
