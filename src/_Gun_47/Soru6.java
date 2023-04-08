package _Gun_47;

import java.util.ArrayList;

public class Soru6 {
    public static void main(String[] args) {
        ArrayList <Integer> points =new ArrayList<>() ;

        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);

        points.remove(1);  //1.indexi siler
        points.remove(null);

        System.out.println("points = " + points);

        //Deger silerken ayni degerden 2 tane varsa ilkini siler
        //points.clear();   hepsini siler

        //1.indexi degil object olan 1 i silmek istersek;
        //   points.remove((Object)1);

    }
}
