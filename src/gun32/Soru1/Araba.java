package gun32.Soru1;

public class Araba {
    private String renk;
    private String model;
    private double motorHacmi;
    private int kapiSayisi;

    public Araba() {
    }

    public Araba(String renk, String model, double motorHacmi, int kapiSayisi) {
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapiSayisi(kapiSayisi); //bu sekilde set li yazmazsak ne yazarsak kabul eder.setle sinirlandirmamiz lazim
        /*this.renk = renk;
        this.model = model;
        this.motorHacmi = motorHacmi;
        this.kapiSayisi = kapiSayisi;*/
    }

    void setRenk(String renk){
        this.renk=renk;
    }
    String getRenk(){
        return this.renk=renk;
    }
    void setModel(String model){
        this.model=model;

    }
    String getModel(){
        return this.model;
    }
    void setMotorHacmi(double motorHacmi){
        this.motorHacmi=motorHacmi;
    }
    double getMotorHacmi(){
        return this.motorHacmi;
    }
    void setKapiSayisi(int kapiSayisi){
        if(kapiSayisi>7)
        this.kapiSayisi=kapiSayisi;
        else
        System.out.println("Kapi sayisi hatali girildi");
    }
    int getKapiSayisi(){
        return this.kapiSayisi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}
