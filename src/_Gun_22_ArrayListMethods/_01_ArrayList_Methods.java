package _Gun_22_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList_Methods {
    public static void main(String[] args) {
        //ArrayList Collection grubunun bir uyesidir
        //Array i siralarken Array.sort u kullandigimiz gibi,Arraylist icin Collection methodlarini kullaniriz

        ArrayList<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(450);
        rakamlar.add(45);
        rakamlar.add(3);

        System.out.println("rakamlar=" + rakamlar);  //ArrayListi direk bu sekilde yazdirabiliriz
        //rakamlar=[50,5,450,45,3]seklinde yazdirir

        //Kucukten buyuge siralama:
        Collections.sort(rakamlar);
        System.out.println("rakamlar = " + rakamlar); //sayilari kucukten buyuge siralayarak yazdirir

        //Tersine cevirme:
        Collections.reverse(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        //Max ve min eleman bulma:
        System.out.println("max()=" + Collections.max(rakamlar));
        System.out.println("min()=" + Collections.min(rakamlar));

        //Butun elemanlari set etme
        Collections.fill(rakamlar,0);     //Butun elemanlara 0 atar
        System.out.println("rakamlar = " + rakamlar);

        //replaceAll
        Collections.replaceAll(rakamlar,0,5); //0 olan elemanlari 5 yapar
        System.out.println("rakamlar = " + rakamlar);


        // tanımlarken değer atama

        int[] dizi={2,3,4,5};
        ArrayList<Integer> liste=new ArrayList<>( Arrays.asList(3,4,5,6) );
        System.out.println("liste = " + liste);
        ArrayList<String> strliste=new ArrayList<>( Arrays.asList("ahmet","mehmet","büşra","roman") );
        System.out.println("strliste = " + strliste);

        ArrayList<Integer> liste2 = new ArrayList<>();
        Collections.addAll(liste2, 2,3,4,5,6,67);

        //diziyi direk ArrayList e nasıl atarım.
        Integer[] dizi2={2,3,4,5};
        ArrayList<Integer> list3= new ArrayList<>( Arrays.asList(dizi2) );
        System.out.println("list3 = " + list3);



    }





    }
