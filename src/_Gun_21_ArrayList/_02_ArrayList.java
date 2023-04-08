package _Gun_21_ArrayList;

import java.util.ArrayList;

public class _02_ArrayList {
    public static void main(String[] args) {
        //Array list:
        // Boyutu dinamik.Eleman ekledikce uzar,sildikce kisalir
        //Boyutunu basta vermene gerek yok(Arrayden farkli olarak)
        //Degiskenelerin adi hep buyuk yazilir

        ArrayList<Integer>IntegerList=new ArrayList<>();
        ArrayList<String>stringList=new ArrayList<>();
        ArrayList<Double>doubleList=new ArrayList<>();

        ArrayList<String>isimler=new ArrayList<>();
        System.out.println("isimler=" +isimler);

        isimler.add("Ahmet"); //diziye yeni elemanlar ekliyor
        isimler.add("Metin");
        isimler.add("Hacer");
        isimler.add("Aynur");

        System.out.println("isimler=" + isimler);  //Dizinin boyutunu yazdiriyor.yani kac elemanli oldugunu
        System.out.println("isimler.size() "+isimler.size());
        isimler.add(1,"Muhammed");//verilen indexe ekliyor,yanindakinin indexini kaydiriyor
        System.out.println("isimler=" +isimler);

        isimler.set(1,"Zafer");
        System.out.println("isimler=" +isimler);//replace yapiyor.1.indextekini silip,yerine Zafer yaziyor

        boolean varMi=isimler.contains("Metin");
        System.out.println("var mi=" + varMi);

        isimler.remove("Metin");
        System.out.println("isimler=" +isimler);

        int indexOfAynur=isimler.indexOf("Aynur");
        System.out.println("indexOfAynur=" +indexOfAynur);

        String ilkEleman=isimler.get(0);
        System.out.println("ilkEleman=" +ilkEleman);

        isimler.clear();
        System.out.println("isimler=" +isimler);




    }
}
