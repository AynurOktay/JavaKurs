package _Gun_33_Inheritance._02_Inheritance;

public class Ordek extends Hayvan {

   int kanatAcikligi;

    public int getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }

    public Ordek(String renk, int kilo, String cinsi, int kanatAcikligi) {
        super(renk, kilo, cinsi);
        this.kanatAcikligi(kanatAcikligi);
        
    }

    private void kanatAcikligi(int kanatAcikligi) {
    }


    @Override
    public void konustu() {
        System.out.println("Ordek vak vak dedi");
        

    }
}
