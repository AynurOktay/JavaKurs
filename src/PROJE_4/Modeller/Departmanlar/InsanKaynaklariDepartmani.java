package PROJE_4.Modeller.Departmanlar;

public class InsanKaynaklariDepartmani implements Departman{

    final String departmanKodu = "IKD";

    // Zam oranini belirlemeyi unutmayalim.
    final int zamOrani = 8;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}
