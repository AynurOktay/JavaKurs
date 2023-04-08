package _Gun_38_Abstract.Ornek2;

public class GreekSalad extends Salad{
    public GreekSalad() {
    }

    @Override
    public void madeIn() {
        System.out.println("Greek salad Yuanistanindir");
    }

    @Override
    public String toString() {
        return "GreekSalad{}";
    }
}
