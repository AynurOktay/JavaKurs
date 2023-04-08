package _Gun_41_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringToLocaldateAndTimeParse_ {
    public static void main(String[] args) {

        //Kullanicidan alinan ve string durumundaki time veya tarih bilgisinin cevrilmesi



        long startTime=System.currentTimeMillis();
        Scanner scan=new Scanner(System.in);
        System.out.println("Tarih giriniz(25 01 2023)");
        String strTarih=scan.nextLine();

        // Kullanıcının girecegı formata gore format olusturduk.
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");

        // Stringin formatı bu formata uygun olmalı.parse ile çevirdik.
        LocalDate tarih= LocalDate.parse(strTarih,f);


        System.out.println("tarih = " + tarih.format(f));


        long finishTime= System.currentTimeMillis();
        System.out.println("gecenSure="+ (finishTime-startTime)+" ms");
    }
}
