package _Gun_04_Casting;

public class _06_ornek2 {
    public static void main(String[] args) {

        //Kisinin agirligini double,boyunu int olarak degerler veriniz.
        //ve bir satirda boyunuz.... ve kilonuz      seklinde yaziniz.
        //vucut kitle indeksini de bularak yazdiriniz.(kg/boy*boy)

        double agirlik=110.5;
        int boy=180;
        double index=(agirlik/(boy*boy));
        System.out.println("index = " + index);
        System.out.println("boyunuz="+boy+" "+ "kilonuz="+agirlik);
    }
}
