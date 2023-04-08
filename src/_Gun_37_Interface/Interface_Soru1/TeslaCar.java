package _Gun_37_Interface.Interface_Soru1;

public class TeslaCar extends Vehicle implements IElectric {
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Bataryanin 9 yil omru var";
    }

    @Override
    public String drive() {
        return "Autopilot ozelligi var";
    }
}


