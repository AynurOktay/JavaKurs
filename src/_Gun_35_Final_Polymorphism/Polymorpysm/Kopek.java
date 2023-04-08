package _Gun_35_Final_Polymorphism.Polymorpysm;

public class Kopek extends Hayvan{
    public Kopek(String name) {
        super(name);
    }

    public void ses(){
        System.out.println("Havladi");
    }
   public void kokladi(){
       System.out.println("kokladi");
   }

    @Override
    public String toString() {
        return "Kopek{" +
                "name='" + name + '\'' +
                '}';
    }
}
