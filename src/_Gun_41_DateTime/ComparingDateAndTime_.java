package _Gun_41_DateTime;

import java.time.LocalDate;

public class ComparingDateAndTime_ {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        boolean sonraMi=bugun.isAfter(dun);
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi= bugun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);

        boolean esitMi=bugun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);

        boolean artikYilMi= bugun.isLeapYear();
        System.out.println("artikYilMi = " + artikYilMi);
    }
}
