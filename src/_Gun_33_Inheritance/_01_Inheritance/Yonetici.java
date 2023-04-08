package _Gun_33_Inheritance._01_Inheritance;

public class Yonetici extends Personel{

    public Yonetici() {
        super();
    }

    public void zamYap(){
        System.out.println("Zam yapildi");
    }

    public Yonetici(String ad, String soyad, int yas, double maas, String department,
                    String sicilNo, String telefon, String tcNo) {
        super(ad, soyad, yas, maas, department, sicilNo, telefon, tcNo);
    }
}
