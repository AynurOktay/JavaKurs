package _Gun_37_Interface.Interface_Odev;

import java.util.ArrayList;

public class AnimalsMain {
    public static void main(String[] args) {
        /*Ekteki Tasarıma göre gerekli modülleri yazınız.
        Sonra her birinden nesne üretiniz.

                - ürettiğiniz nesneleri bir ArrayListe ekletip, daha sonra bu ArrayList i
        bir döngü ile metodlarını ekrana yazdırınız.

        metodların hepsinin tipi String*/

        Swallow sw=new Swallow();
        Shark sh=new Shark();
        Cat c=new Cat();
        Duck d=new Duck();

       ArrayList<Animals>animals=new ArrayList<>();


         Animals.add(sw);


        for (Animals a: animals) {

           if(d instanceof Duck)
               System.out.println(((Duck)d).Flying());
               System.out.println(((Duck)d).food());
               System.out.println(((Duck)d).Sailing());



        }

        }
}
