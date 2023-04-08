package _Gun_22_ArrayListMethods;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayListMethods_sorular {
    public static void main(String[] args) {
        //Bir sinifta 20 kisi var ve bunlarin 3 dersi var.
        //Ögrencilerin bu 3 derse ait notlarini nasil bir degiskende saklayabilirim

        ArrayList<Integer> liste = new ArrayList<>();

        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizNotlari = new ArrayList<>();
        ArrayList<Integer> kimNotlari = new ArrayList<>();


        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(60);

        fizNotlari.add(40);
        fizNotlari.add(70);

        kimNotlari.add(45);
        kimNotlari.add(45);
        kimNotlari.add(65);
        kimNotlari.add(65);

        //ArrayListin ArrayListini nasil yaparim:(Array listin 2 boyutlu hali)

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();

        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        notlarListesi.get(0);    //bu bize mat notalarini verir
        int matBirNot = notlarListesi.get(0).get(0);  //mat notlarinin ilkini aldim

        System.out.println("notlarListesi = " + notlarListesi.get(0));
        System.out.println("notlarListesi = " + notlarListesi.get(1));
        System.out.println("notlarListesi = " + notlarListesi.get(2));

        //Yukaridakinin yerine bir for döngüsü kullanabiliriz:

        for (int i = 0; i < notlarListesi.size(); i++) {   //Size get.0,1,2 ni yerine gecer.Yukardakinin aynisi verir notalri ders ders yazdirir
            System.out.println("Notlar listesi= " + notlarListesi.get(i));
        }

        //Satir sütun seklinde yazdirmak icin:

        for (int i = 0; i < notlarListesi.size(); i++) {     //Sadece notlari yazar(satiri yazdirri

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j) + "\t");
            }


            System.out.println();
        }

        //Notlari ekrana ders adlarini bir ArrayList olarak her dersin adini ve notlarini her bir satira yazdirirniz
        //Mat:40 50 60
        //Fizik 30 40
        //Kimya: 70 80 90 100

        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) { //Bu kisim derslerin adini yazdirir
            System.out.print(dersler.get(i)+":");

            for (int j = 0; j < notlarListesi.get(i).size(); j++) { //tek tek notlari yazdirir
                System.out.print(notlarListesi.get(i).get(j) + "\t");
            }
            System.out.println();
        }

        System.out.println("***********************+***");

// Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        System.out.println("***********************");
        Scanner oku=new Scanner(System.in);
        System.out.print("Ders No (0-Mat, 1-Fiz, 2-Kim) =");
        int dersNo=oku.nextInt();

        dersNotlariniYazdir(notlarListesi, dersNo);   //Metod olusturma



    }

    public static void dersNotlariniYazdir(ArrayList< ArrayList<Integer> > notlarListesi, int dersNo){ //notlar listesinin tipi listelerin listesi (Arraylist<ArraList
                                                                                                       //ders notunun tipi int
        //notlar listesini for döngüsüyle yazdirriyoruz
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.print(notlarListesi.get(dersNo).get(i)+"\t");

        }

        // Soru 3 :
        // Yukarıda verilen derse ait not ortalamasını ve geçen sayısını bir metodda yazdırınız.
        dersOrtVeGecenMikBul(notlarListesi, dersNo);

    }

    public static void dersOrtVeGecenMikBul(ArrayList< ArrayList<Integer> > notlarListesi, int dersNo){
        int toplam=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam+=notlarListesi.get(dersNo).get(i);         //notlarListesi.get(dersNo).get(i)  bize notlari veren kisim.bunu toplama ekleyerek notlarin toplamini buldum
        }

        int ort= toplam/notlarListesi.get(dersNo).size();    //ortalama hesapladim

        int gecenMik=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            if (notlarListesi.get(dersNo).get(i)>= ort)
                gecenMik++;
        }

        System.out.println("ort = " + ort);
        System.out.println("gecenMik = " + gecenMik);




    }
}