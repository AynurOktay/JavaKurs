package PROJE_4.Veritabani;


import PROJE_4.Modeller.Calisanlar.Calisan;
import PROJE_4.Modeller.Departmanlar.Departman;

import java.util.ArrayList;

public class Calisanlar {


    // Buradaki calisanList static cünkü proje calismaya basladiği anda oluşması lazım. Bunu bir veritabani
    // gibi görebiliriz. Calisanlarimizin hepsi bu liste icerisinde yer alacak.
    private static ArrayList<Calisan> calisanList = new ArrayList<>();


    // Calisanlari almak icin basit bir getter method
    public static ArrayList<Calisan> getCalisanList() {

        return calisanList;
    }

    // Bir çalışan eklemek için gerekli method.
    public static void addACalisan(Calisan calisan) {

        calisanList.add(calisan);
    }
    //NEDEN BURDA Fori kullanmadik?????

    // Bir çalışan silmek için gerekli method.
    public static void deleteACalisanWithId(String calisanId) {
        for (int i = 0; i < calisanList.size(); i++) {
            if (calisanId.equals(getCalisanList().get(i).getCalisanId())) ;
            getCalisanList().remove(calisanList.get(i));
        }

    }

    // Departman kodu verilerek, konsola sadece o departmanda calisanlari yazdirmak için
    public static void printDepartmandakiCalisanlar(String departmanKodu) {
        Departman d = null;
        for (Departman departman : Departmanlar.getDepartmanList()) {
            if (departman.getDepartmanKodu().equals(departmanKodu)) {
                d = departman;
            }
        }
        for (Calisan calisan : calisanList) {
            if (calisan.getDepartman() == d) {
                System.out.println(calisan);
            }
        }

        // Calisanlari konsola yazdirmak için
       /* public static void printCalisanlar() {
            for (Calisan calisan : calisanList) {
                System.out.println(calisan.toString());
            }
        }*/


    }
}



