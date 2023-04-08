package _Gun_29_AccessModifiers.PrivateErisim;

public class sirket {
    public static void main(String[] args) {
        calisan cal1=new calisan();
        cal1.id=1;
        cal1.name="ismet";
        cal1.surname="temur";

        //cal1.password artik private kendi paketinden bile cagrilamaz

        cal1.sifreAta("1234");
        cal1.sifreAta("M123_sdrfg");
        cal1.sifreGoster();

    }
}
