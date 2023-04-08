package PROJE_4.Modeller.Departmanlar;

import PROJE_4.Modeller.Departmanlar.Departman;

public class YonetimDepartmani implements Departman {

    final String departmanKodu = "YD";

    // Zam oranini belirlemeyi unutmayalim.
    final int zamOrani = 10;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}
