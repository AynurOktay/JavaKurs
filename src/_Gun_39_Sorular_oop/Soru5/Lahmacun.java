package _Gun_39_Sorular_oop.Soru5;

public class Lahmacun implements IFood  {

    public void dough(){
        System.out.println("Hamur hazirlandi.");
    }
   public void addMeat(){
       System.out.println("Kiyma eklendi.");
   }
   public void bake(){
       System.out.println("Lahmacununuz pisirildi.");
   }

    @Override
    public void taste() {
        System.out.println("Enfes lahmacununuz hazir.");
    }

    @Override
    public double ucret() {
        return 20;
    }
}
