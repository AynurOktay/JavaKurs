package _Gun_08_Operators;

public class _05_JavaAssignmentOperators {
    public static void main(String[] args) {
        int a=10;
        //a=a+5; demek yerine
        a+=5;    //sonuc yukardakiyle ayni,15 olur
        System.out.println("a="+a);

        int b=15;
        //b=b-5;    //b'nin degeri 5 olur.
        //bunun yerine soyle yazariz:
        b-=5;
        System.out.println("b="+b);

        int c=10;
        c/=5;
        System.out.println("c="+c);

        int d=10;
        d*=5;
        System.out.println("d="+d);

    }
}
