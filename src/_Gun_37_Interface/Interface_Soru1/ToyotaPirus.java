package _Gun_37_Interface.Interface_Soru1;

public class ToyotaPirus extends  Vehicle implements IElectric,IGas{


    public ToyotaPirus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Omur boyu kullan";
    }

    @Override
    public String changeOil() {
        return "Bir depo ile 300 km gider";
    }

    @Override
    public String drive() {return "Saatte .. km gider" ;}
}
