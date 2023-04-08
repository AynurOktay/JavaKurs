package _Gun_23_HashSets;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {

        HashSet<Integer> hs= new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);

        System.out.println("hs.size = " + hs.size());

        hs.remove(5); //elemanin kendi degerinde siliyor.yani 5i siliyor.Setlerde index yok
        System.out.println("remove sonrasi hs = " + hs);   //5i siliyor

        if(hs.contains(7))
            System.out.println("var");
        else
            System.out.println("yok");

        hs.clear();
        System.out.println("hs=" + hs);







    }
}
