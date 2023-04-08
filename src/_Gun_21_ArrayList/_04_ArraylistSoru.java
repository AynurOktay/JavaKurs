package _Gun_21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_ArraylistSoru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);
        ArrayList<Integer>notlar=new ArrayList<>();
        int toplam=0;
        String devamMi;
        do {

           System.out.println("Not=");
            int not= scanInt.nextInt();
           notlar.add(not);
           toplam=toplam+not;
            System.out.println("devam etmek istiyor musun?(E/H)");
            devamMi=scanStr.next();
       } while( devamMi.equalsIgnoreCase("E"));

        int ort=toplam/ notlar.size();
        int gecenSayisi=0;
        for (int i = 0; i < notlar.size() ; i++) {
            if(notlar.get(i) > ort)

                gecenSayisi++;
        }

        System.out.println("gecenSayisi=" +gecenSayisi);





    }
}
