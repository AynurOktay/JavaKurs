package _Gun_39_Sorular_oop.Soru1;

public class main {
    public static void main(String[] args) {

       /* 1- id(int) ,isim(String), vahsi(boolean), dogumTarihi (String) fieldları olan ve
        void yiyecegi, void yemekMiktari, void gunlukUykuSuresi ve void sesi isimlerinde abstract metodları,
        toString şeklinde normal metodu ve get ve set leri olan Hayvan isminde
        bir abstract class yazınız.

        2- Kedi, kartal şeklinde 2 tane extend alacak normal class yazınız.

        3- Main de 1 er nesne oluşturup, değerlerini atayıp, yazdırınız.

        4- Benzersiz ID leri olmalı, buna göre güvenli dizayn yapınız.*/


   Hayvan kedi=new Kedi("Pitir",false,"01.11.2022");
        System.out.println(kedi);

   Hayvan kartal=new Kartal("Kartal",true,"01.02.2022");
        System.out.println(kartal);


    }
}
