package _Gun_38_Abstract.Abstract;

public class Ford extends BinekOto {

    public Ford(String marka, int uretimYili, int vitesadedi)
    {
        super(marka, uretimYili, vitesadedi);
    }

    @Override
    public int HizlanmaSuresi() {
        return 0;
    }

    @Override
    public String toString() {
        return "Ford{}";
    }
}
