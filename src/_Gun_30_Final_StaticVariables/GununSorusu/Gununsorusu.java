package _Gun_30_Final_StaticVariables.GununSorusu;




public class Gununsorusu {


    int a;
    static int b=0; //static oldugu icin bir tanedir



    public static void main(String[] args) {
        Gununsorusu gs1 = new Gununsorusu();
        gs1.a = 5;

        Gununsorusu gs2 = new Gununsorusu();
        gs2.a = 7;

        //Burada her nesnenin bir a si var.gs1in a`sinin degeri 5,gs2nin 7 dir.

        System.out.println("gs1 = " + gs1.a); //5
        System.out.println("gs2 = " + gs2.a); //7

        //Soru:b nin degeri kactir?
        //b nin tek bir degeri vardir.0
        System.out.println("b = " + Gununsorusu.b);


    }

}
