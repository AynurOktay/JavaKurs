package _Gun_42_StringBuffer_Builder_VeriTipleri;

public class StringKarsilastirma {
    public static void main(String[] args) {

        //Stringlerde == yerine neden equals kullnilmalidir???


        String cumle1="Bugun hava cok guzel";
        String cumle2="Bugun hava cok guzel";

        //Ilkel tipleri karsilastirdigimizdan ikisinde degerleri karsilastirir

        if(cumle1==cumle2)
            System.out.println("cumle 1 cumle 2 ye esit");
        else
            System.out.println("cumle 1 cumle 2 ye esit DEGIL");

        if(cumle1.equals(cumle2))
            System.out.println("cumle 1 cumle 2 ye esit");
        else
            System.out.println("cumle 1 cumle 2 ye esit DEGIL");

        //Referans tiplerde durum:
        //Scannerdan alip ekranda okundugunda oldugu gibi olur

        String cumle3=new String("Bugun hava cok guzel");
        String cumle4=new String("Bugun hava cok guzel");

        if(cumle3==cumle4)
            System.out.println("cumle 3 cumle 4 ye esit");
        else
            System.out.println("cumle 3 cumle 4 ye esit DEGIL");

        if(cumle3.equals(cumle4))
            System.out.println("cumle 3 cumle 4 ye esit");
        else
            System.out.println("cumle 3 cumle 4 ye esit DEGIL");



    }
}
