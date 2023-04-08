package PROJE_4.Modeller.Calisanlar;


import PROJE_4.Modeller.Departmanlar.Departman;
import PROJE_4.Veritabani.Calisanlar;
import PROJE_4.Veritabani.Departmanlar;


public class Calisan extends Departmanlar {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departman Departman;
    private String isimKodu = "";

    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        this.setDepartman(departmanKodu);
        this.setCalisanId();
        Calisanlar.addACalisan(this);
    }// Kullanicinin departman koduna göre, gerekli departman set edilmelidir.
    private void setDepartman(String departman) {
        for (int i = 0; i < Departmanlar.getDepartmanList().size(); i++) {
             if(departman.equalsIgnoreCase(Departmanlar.getDepartmanList().get(i).getDepartmanKodu()));
        }
        /*İpucu: Departman listesinin (Veritabani.Departmanlar.DepartmanList) içerisindeki departmanların kodları var,
        bu kodlari donguye tutmak ise yarayabilir.*/
    }

    // Calisanin ID sinin kendisine özel olduğundan bahsetmistik, ID nin nasil kaydedileceği CalisanKaydetmeProjesiTanıtım.txt
    // içerisinde yer aliyor.
    private void setCalisanId() {

        this.calisanId=this.Departman.getDepartmanKodu()+(Calisanlar.getCalisanList().size()+1)+this.getCalisanIsimKodu();
    }

    // Calisanin ID sinin sonuna isim kodu eklenmesi için, ismi parçalayan bir method.
    //  Basit string metodlari ise isinice cok yarayacaktir fakat dinamik olmasina dikkat edelim... Mesela 2 isim bir
    //  soyisim girildiğinde hata vermesin. */
    private String getCalisanIsimKodu() {
        this.isimKodu+=this.adSoyad.charAt(0);

        for (int i= 0;  i<this.adSoyad.length() ; i++) {
            if (adSoyad.charAt(i)==' '){
               this.isimKodu+=adSoyad.charAt(i+1);}
        }
        return this.isimKodu;
    }

    // Calisanin id sini almak icin basit getter method
    public String getCalisanId() {
        return this.calisanId;
    }

    // Calisanin departmanini almak icin basit getter method
    public Departman getDepartman() {
        return this.Departman;
    }

    // Departman adini verebilmek için bir method
   public String getDepartmanAdi() {
       String departman=" ";
       if (this.Departman.getDepartmanKodu().equals("BTD"))
           departman="Bilisim Teknolojileri Departmani";
    else if (this.Departman.getDepartmanKodu().equals("YD")) {
        departman = "Yönetim Departmani";
    } else if (this.Departman.getDepartmanKodu().equals("IKD")) {
        departman = "Insan Kaynaklari Departmani";
    }
        return departman;



   }
    // Calisana zam yapilmasi için gerekli bir method
    public static void zamYap(String calisanId) {
        for (int i = 0; i <Calisanlar.getCalisanList().size() ; i++) {
                if(calisanId.equals(Calisanlar.getCalisanList().get(i).getCalisanId())){
                    int zam=Departmanlar.getDepartmanList().get(i).getZamOrani();
                    Calisanlar.getCalisanList().get(i).maas+=(Calisanlar.getCalisanList().get(i).maas*zam)/100;
                }
            }
       }
        /*İpucu: Calisan ID si kullanilarak yapilmalidir, diğer attributelarin aynilarindan 1 er tane daha
            olabilirdi.*/


    // Calisanlari yazdırmak için gerekli bir override


    @Override
    public String toString() {
        return "Calisan{" +
                "calisanId='" + calisanId + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", maas=" + maas +
                ", Departman=" + getDepartmanAdi() +
                '}';
    }


}
