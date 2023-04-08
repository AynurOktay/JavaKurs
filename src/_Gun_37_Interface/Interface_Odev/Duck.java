package _Gun_37_Interface.Interface_Odev;

public class Duck implements IFlying,ISailing{


    public String food() {
        return "Ducks eat insects.";
    }

    @Override
    public String Flying() {
        return "Ducks fly over the lakes.";
    }

    @Override
    public String Sailing() {
        return "Ducks swim in water.";
    }
}
