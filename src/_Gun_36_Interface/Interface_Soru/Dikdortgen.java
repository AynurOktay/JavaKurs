package _Gun_36_Interface.Interface_Soru;

public class Dikdortgen implements ISekil {
    @Override
    public int alan(int kenar1, int kenar2) {
        return kenar1*kenar2;
    }

    @Override
    public int cevre(int kenar1, int kenar2) {
        return (kenar1+kenar2)*2;
    }


}
