package _Gun_31_Enum._03_Enum;

public enum Aylar {

    OCAK(1,31,"Ocak"),
    SUBAT(2,28,"Subat"),
    MART(3,31,"Mart"),
     NISAN(4,30,"Nisan"),
    MAYIS (5,31,"Temmuz"),
    HAZIRAN(6,31,"Haziran"),
    TEMMUZ(7,31,"Temmuz"),
    AGUSTOS (8,31,"Agustos"),
    EYLUL(9,30,"Eylul"),
    EKIM(10,31,"Ekim"),
    KASIM(11,30,"Kasim"),ARALIK(12,31,"Aralik");


    int ayNo;
    int gunMiktar;
    String ayAd;

    Aylar(int ayNo, int gunMiktar, String ayAd) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.ayAd = ayAd;
    }
}
