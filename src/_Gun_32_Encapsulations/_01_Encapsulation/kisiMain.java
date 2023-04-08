package _Gun_32_Encapsulations._01_Encapsulation;

public class kisiMain {
    public static void main(String[] args) {

        //Degiskene direk erisimi kapatip(private yaparak) bir metod ile korumali
        // veri gonderme ve alma islemine Encapsulation denir

        kisi kisi1= new kisi();

        kisi1.setAd("Ismet");
        kisi1.setSoyad("temur");
        kisi1.yasAta(-25);


        System.out.println(kisi1.yasVer());

        System.out.println("kisi 1="+ kisi1);
    }
}
