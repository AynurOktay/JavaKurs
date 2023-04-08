package _Gun_30_Final_StaticVariables.SoruSabitler;

public class Sabitler {
    final static int birGundekiSaatSayisi=24;   //bu degerler bir tane oldugu icin static,ve hic degistirilemeyecegi icin final olatrak tanimladik.
    final static int birSaattekiDakikaSayisi=60;
    final static int birdakikadakiSaniyeSayisi=60;

    public static int hesapla(int gun,int saat ,int dakika)
    {int toplamSaniye= gun *Sabitler.birGundekiSaatSayisi
                    *birSaattekiDakikaSayisi
                    *birdakikadakiSaniyeSayisi
                    + saat *birSaattekiDakikaSayisi
                            *birdakikadakiSaniyeSayisi
                    + dakika *birdakikadakiSaniyeSayisi;
        return toplamSaniye;



    }


}
