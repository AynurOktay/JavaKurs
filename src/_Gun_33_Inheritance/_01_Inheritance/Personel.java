package _Gun_33_Inheritance._01_Inheritance;

public class Personel {
    private String ad;
    private String soyad;
    private int yas;
    private double maas;
    private String department;
    private String sicilNo;
    private String telefon;
    private String tcNo;

    public Personel() {

    }

    public void bordroYazdir(){
        System.out.println("Bordro yazdirildi");
    }

    public Personel(String ad, String soyad, int yas, double maas, String department,
                    String sicilNo, String telefon, String tcNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.maas = maas;
        this.department = department;
        this.sicilNo = sicilNo;
        this.telefon = telefon;
        this.tcNo = tcNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", maas=" + maas +
                ", department='" + department + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                ", telefon='" + telefon + '\'' +
                ", tcNo='" + tcNo + '\'' +
                '}';
    }
}
