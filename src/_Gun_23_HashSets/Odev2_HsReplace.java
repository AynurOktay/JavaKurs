package _Gun_23_HashSets;

import java.util.Arrays;
import java.util.HashSet;

public class Odev2_HsReplace {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>(Arrays.asList("apple", "banana", "peach"));
        System.out.println("Degismis hali = " + changeSet(hs, "apple", "strawberry"));

    }  public static HashSet<String> changeSet(  HashSet<String>hs,String str1 ,String str2) {

        System.out.println("hs = " + hs);
        hs.remove(str1);
        hs.add(str2);
        return hs;

    }









    }