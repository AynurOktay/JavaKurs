package _Gun_34_Inheritance.Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="karakedi";
        p1h.yas=2;
        p1h.cinsi="tekir";//protected erisildi,cunku ayni paketten
    }
}
