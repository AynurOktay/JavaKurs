package _Gun_29_AccessModifiers.Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {

        Doctor dr1=new Doctor();
        dr1.adi="ismet";
        dr1.bolumu="Dahiliye";
        dr1.hastaneAd="Ankara Hastanesi";
        //dr1.SicilNo private oldugundan erisilmiyor
        Doctor dr2=new Doctor("Mehmet");
    }

}
