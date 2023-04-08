package _Gun_30_Final_StaticVariables.FinalVariables.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo; //final olan degiskenler bir daha asla degistirelemez
                    //yani sadece 1 defa atama sansi var

    static int tcNoSayac=1;


    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
