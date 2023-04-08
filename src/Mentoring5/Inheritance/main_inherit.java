package Mentoring5.Inheritance;

public class main_inherit {
    public static void main(String[] args) {

        Ucak ucak=new Ucak("AC-410","Gasoline",1000,true,100);
        ucak.attackEnemey();
        ucak.getFuzeSayisi();

        System.out.println("ucak = " + ucak);
        System.out.println(ucak.getFuzeSayisi());

    }
}
