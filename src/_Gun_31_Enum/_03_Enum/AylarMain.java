package _Gun_31_Enum._03_Enum;

public class AylarMain {
    public static void main(String[] args) {

        //ayın kaç gün sürdüğünü metod gerekiyor
        // ayın türkçe yazılışı metod gerekiyor
        // ayın gerçek sıra nosu metod gerekiyor

        // Java diyorki bu şekilde tek bir kelime veya
        // sayı olan degerleri olacaksa, sana bir kolaylık
        System.out.println("Aylar.AGUSTOS="+Aylar.AGUSTOS);

        Aylar ay=Aylar.AGUSTOS;

        System.out.println("ay = " + ay);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.ayAd = " + ay.ayAd);

        for (Aylar a: Aylar.values()) {
            System.out.println("a = " + a.ayNo+"-"+a.ayAd+a.gunMiktar);

        }
    }
}
