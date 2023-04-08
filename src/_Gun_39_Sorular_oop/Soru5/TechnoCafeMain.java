package _Gun_39_Sorular_oop.Soru5;

import Utility.Saat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafeMain {
    public static void main(String[] args) {


      /* 2.Bölüm de
        Aşağıdaki metodları olan classları yazınız.food dan implemente alarak

        AdanaKebab: void marinade(), grill()
        Lahmacun: dough(), addMeat(), bake()
        Borsh: boil(), eatTomorrow()
        Palov: fry(), boil()

        3.Bölüm
        TechnoCafe isimli class da ki main metodunda kullanıcıya menüyü sunarak
                kullanıcı tamam seçeneğini seçene kadar yemek siparişini alınız.
        ödev:seçim sonrası kaç adet olduğunu da alınız.
                Bu yemekleri bir ArrayList e ekleyeiniz.
                Menü*
                1-Adana Kebap (55 TL)
        2-Lahmacun (33 TL)
        3-Borsh (33 TL)
        4-Palov (44 TL)
        0-Tamam

        4. Verilen siparişleri main de bir döngü vasıtasıyla TechnoKitchen isimli
        classa tek tek göndererek hazırlatınız, ve ücret bilgisini oluşturup.
                yazdırınız.*/



        List<IFood> siparisler=new ArrayList<>();
        Scanner scan = new Scanner(System.in); //Kullanici meduden siparis  sececegi icin scanner aldik .

        //Kullanici once secimini yapacagi sonra listeye eklenecegi icin do while dongusunu kullandik
        //Menuyu dongunun icinde switch ile sunup sectiriyoruz.

        int secim=0;
        do{
            menu();
                secim=scan.nextInt();

                switch(secim){
                case 1:
                    IFood adana=new AdanaKebap();
                    siparisler.add(adana);
                    break;

                    case 2:
                    IFood lahmacun=new Lahmacun();
                    siparisler.add(lahmacun);
                        break;

                    case 3:
                   IFood borsch=new Borsch();
                    siparisler.add(borsch);
                        break;

                    case 4:
                        IFood palov=new Palov();
                    siparisler.add(palov);
                    break;
                }
                }while(secim < 5);

   //Menu metoduyla alinan siparisleri yazdiriyoruz;
                System.out.println("Alinan siparisler.");
                for (IFood f: siparisler){
                    System.out.println(f.getClass().getSimpleName());
                }
    //Alinan siparisleri bir donguyle tek tek hazirlanmaya TecnoKitchen classina hazirlanmasi icin gönderiyoruz.
        System.out.println("siparisleriniz hazirlaniyor..\n");
        Saat.Bekle(2);
                double toplam=0;
                for (IFood f: siparisler){
                    TechnoKitchen.hazirla(f);
                    toplam+=f.ucret();
                }
        System.out.println("Toplam ucret="+toplam);
    }
    public static void menu(){
        System.out.println("****Menu****" + "\n" +
                "1-Adana Kebap(75 tl)" + "\n" + "2-Lahmacun(20 tl)" + "\n" + "3-Borsch(40tl)" + "\n" + "4-Polov(20 tl)" + "\n" + "0-Tamam"+ "\nSeciminiz");

    }
}