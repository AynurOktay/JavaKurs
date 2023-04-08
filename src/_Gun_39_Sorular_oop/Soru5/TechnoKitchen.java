package _Gun_39_Sorular_oop.Soru5;

public class TechnoKitchen {


    public static void hazirla(IFood f) {

        System.out.println(f.getClass().getSimpleName());
        if (f instanceof AdanaKebap) {
            ((AdanaKebap) f).marinade();
            ((AdanaKebap) f).grill();


        } else if (f instanceof Lahmacun) {

            System.out.println("HAZIRLANMAYA BASLANDI.");
            ((Lahmacun) f).dough();
            ((Lahmacun) f).addMeat();
            ((Lahmacun) f).bake();

            System.out.println("_____________________");
        } else if (f instanceof Borsch) {

            System.out.println("HAZIRLANMAYA BASLANDI.");
            ((Borsch) f).boil();
            ((Borsch) f).eatTomorrow();

            System.out.println("_____________________");

        } else if (f instanceof Palov) {
            System.out.println("HAZIRLANMAYA BASLANDI.");

            ((Palov) f).fry();
            ((Palov) f).boil();

            System.out.println("_____________________");
        }
        f.taste();
        System.out.println(); //taste metodu hepsinde ortak oldugundan ayri ayri yazmiyoruz,en sonunda ekliyoruz
    }
}