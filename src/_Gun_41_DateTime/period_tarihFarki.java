package _Gun_41_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class period_tarihFarki {
    public static void main(String[] args) {
          //Iki tarih arasindaki farki verir
        //Local dateler icin kullanilir

        LocalDate dogumTarihi=LocalDate.of(1979,11,1);
        LocalDate bugun=LocalDate.now();

        Period fark=Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println( fark.getYears()+" yasindasiniz");

        /**************************************/

         Period period3gun=Period.ofDays(3);
        Period period3ay=Period.ofMonths(3);

        System.out.println("period3gun = " + period3gun);
        System.out.println("period3ay = " + period3ay);

        LocalDate ucGunSonra=bugun.plus(period3gun);
        System.out.println("ucGunSonra = " + ucGunSonra);


         /**********************************/
         //Kursun bitis tarihini bulunuz:(31 Ekim 2022 den itibaren 6 ay)

   LocalDate kursBaslangic=LocalDate.of(2022,10,31);
   Period kursSure =Period.ofMonths(6);
   LocalDate kursBitis=kursBaslangic.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

        //Kursun bitmesine ne kadar sure kaldi
        Period neKadarSureKaldi=Period.between(bugun,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);
        
        //Kurs Ne kadar Suredir devam ediyor
        Period suAnaKadarDEvamSuresi =Period.between(kursBaslangic,bugun);
        System.out.println("suAnaKadarDEvamSuresi = " + suAnaKadarDEvamSuresi);
    }
}
