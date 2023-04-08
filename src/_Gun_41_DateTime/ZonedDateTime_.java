package _Gun_41_DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTime_ {
    public static void main(String[] args) {

        ZonedDateTime zdt =ZonedDateTime.now();
        //su anda benim bulundugum default zamani verdiS
        System.out.println("zdt = " + zdt);

        Set<String> zamanBolgeleri =ZoneId.getAvailableZoneIds();

        for (String z: zamanBolgeleri) {
            if (z.toLowerCase().contains("anbul"))
                System.out.println("z = " + z);
        }

          ZoneId zoneIdIstanbul =ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul= ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);



    }



}
