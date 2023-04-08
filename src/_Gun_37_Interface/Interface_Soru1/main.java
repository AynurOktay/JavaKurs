package _Gun_37_Interface.Interface_Soru1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

       /* Ekteki Tasarıma göre gerekli modülleri yazınız.
        Sonra bir main metodunda, TeslaCar dan, ToyotaPirus
        dan ve cityBus dan birer nesne üretiniz.

                - ürettiğiniz nesneleri bir ArrayListe ekletip, daha sonra
        bu ArrayList i bir döngü ile metodlarını ekrana yazdırınız.

                engine (double)
        model (String)
        metodların hepsinin tipi String
       */

  TeslaCar tesla=new TeslaCar("Model 5",310);
  ToyotaPirus toyota=new ToyotaPirus("Sedan" ,1200);
  Bus cityBus=new Bus("Iveco",7000);

  ArrayList<Vehicle>arabalar=new ArrayList<>();
  arabalar.add(tesla);
  arabalar.add(toyota);
  arabalar.add(cityBus);

        for ( Vehicle v: arabalar) {
            System.out.println("_____________________");
            System.out.println(v.getClass().getSimpleName()); ///clasin adini verir
            System.out.println("_____________________");

            System.out.println("Model=" + v.getModel());
            System.out.println("Engine= " + v.getEngine());

            if (v instanceof TeslaCar) {
                System.out.println(((TeslaCar) v).drive());
                System.out.println(((TeslaCar) v).changeBattery());

            } else if (v instanceof ToyotaPirus) {
                System.out.println(((ToyotaPirus) v).drive());
                System.out.println(((ToyotaPirus) v).changeBattery());
                System.out.println(((ToyotaPirus) v).changeOil());

            } else if (v instanceof Bus) {
                System.out.println(((Bus) v).drive());
                System.out.println(((Bus) v).changeDiesel());
            }


        }
  
    }
}
