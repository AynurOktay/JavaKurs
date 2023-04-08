package _Gun_24_HashMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_MapsSoru {
    public static void main(String[] args) {



        //Canli sözluk yapimi:
        //Kullaniciya asagidaki gibi bir menu cikariniz:
        //1-Ekleme(Bu secenekte kelimenein kendisi ve manasini bir cümle ile aliniz)
        //2-Düzeltme(bu secenekte kelimenin manasini düzelttirin)
        //3-Listeleem
        //4-Arama(Bu secenekte verilen bir kelimeyle baslayan tüm kelimenin manalari
       // 5-Silme
         //6-Cikis

        Map<String, String> sozluk= new TreeMap<>();
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        int secim=0;

        do{
            //menü çıkacak (1-Ekleme, 2-Düzeltme, 3-Listeleme, 4-Arama)
            System.out.print("MENÜ\n1- Ekleme\n2- Düzeltme\n3- Listeleme\n4- Arama\n5- Silme\n6- Çıkış\nSeçiminiz=");
            //seçim alınacak
            secim =okuInt.nextInt();

            //seçime göre işlem yapılacak
            switch (secim)
            {
                case 1: //1 i seçti ise ekleme işlemini yap
                    //kelimeyi giriniz
                    System.out.print("Kelime giriniz=");
                    String kelime=okuStr.nextLine();
                    // manasını giriniz
                    System.out.print("Manasını yazınız=");
                    String manasi=okuStr.nextLine();
                    // buna uygun değişkene ekle
                    sozluk.put(kelime, manasi);
                    break;
                case 2: //2 yi seçti ise düzeltme işlemini yap
                    System.out.println("Düzeltme yapiniz");
                    String duzeltme= okuStr.next();
                    break;
                    case 3:
                        System.out.println("Kelimeleri listeleyiniz");

                        break;
                case 4:
                    System.out.println("Arama secildi");
                    break;
                case 5:
                    System.out.println("");
                case 6:
                    System.out.println("Programdan cikiniz");

            }

        }while(secim != 6); //çıkış olmadığı sürece devam et

        // TODO : geri kalan menu işlemleri yapılacak
        // TODO :  2.Aşama menulerde yapılacak işlemleri METOD ile yapınız.















        
    }
}
