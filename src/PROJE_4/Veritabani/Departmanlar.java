package PROJE_4.Veritabani;




import PROJE_4.Modeller.Departmanlar.BilisimTeklonojileriDepartmani;
import PROJE_4.Modeller.Departmanlar.Departman;
import PROJE_4.Modeller.Departmanlar.InsanKaynaklariDepartmani;
import PROJE_4.Modeller.Departmanlar.YonetimDepartmani;

import java.util.ArrayList;
import java.util.Arrays;


public abstract class Departmanlar {


    // Bunu bir veritabani gibi düsünmeliyiz bu yüzden proje calistiği zaman, ilk once veritabani olusmali ki
    // ekleme cikarma islemlerini rahatca yapabilelim bu yüzden tüm değerleri static verip, departmanList i ise
    // new leyip, bu departmanlari içerisine bulunduralim.
    static private final Departman BILISIM_TEKLONOJILERI_DEPARTMANI = new BilisimTeklonojileriDepartmani();
    static private final Departman YONETIM_DEPARTMANI = (Departman) new YonetimDepartmani();
    static private final Departman INSAN_KAYNAKLARI_DEPARTMANI = new InsanKaynaklariDepartmani();
    static private ArrayList<Departman> DepartmanList = new ArrayList<>(Arrays.asList(BILISIM_TEKLONOJILERI_DEPARTMANI, YONETIM_DEPARTMANI, INSAN_KAYNAKLARI_DEPARTMANI));

    // Basit bir getter method
    public static ArrayList<Departman> getDepartmanList() {
        return DepartmanList;
    }



}
