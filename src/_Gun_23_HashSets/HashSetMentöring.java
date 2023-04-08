package _Gun_23_HashSets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMentöring {
    public static void main(String[] args) {


        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(4);
        hs1.add(1);
        boolean eklendiMi = hs1.add(5);

        HashSet<Integer> hs2=new HashSet<>();
        hs2.addAll(hs1);
        System.out.println("hs2 = " + hs2);

        hs1.remove(38); //38i cikarir
        hs1.contains(1);//true
        hs1.size();
        System.out.println("hs1 size= " + hs1.size());

        HashSet<Integer>hs3=new HashSet<>();
        hs3.add(2);
        hs3.add(6);
        hs3.add(4);
        hs1.retainAll(hs3);
        System.out.println("hs1 ortaklar = " + hs1); //hs1 ile hs3 ün ortak elemanlarini retainAll metoduyla alip yazdirir


        System.out.println("hs1 = " + hs1);
        System.out.println("eklendiMi = " + eklendiMi);
        //for each en iyi yazdirma yontemidir
        for (int str : hs1) {
            System.out.println("str = " + str); //tek tek yazdirmak istersek fori yada foreach le yazdiririz

            //diger yazdirma yontemi
            Iterator itrt = hs1.iterator();
            while (itrt.hasNext())  //iteratorden sonrasi var olana kadar döngü devam edecek.sonrasi olmadiginda döngü duracak
            {
                int sayilar = (int) itrt.next(); //istenilen bir int ama itrt.next bir object oldugundan basina int yazarak onu inte ceviriyoruz ve yazdiriyoruz
                System.out.println("sayilar = " + sayilar);
            }
        }
    }
}