package _Gun_39_Sorular_oop.Soru2;

public class ABMain {
    public static void main(String[] args) {

        A a=new A();
        System.out.println(A.mesaj);  //A dan merhaba

        B b=new B();
        System.out.println(A.mesaj);    //Bden merhaba.Cunku constructor calisti

        A a2 =new A();  //bunun degistirici bi etkisi yok
        System.out.println(A.mesaj);  //B den merhaba

    }
}
