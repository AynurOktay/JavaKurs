package _Gun_08_Operators;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {

       int a=9;
       int b=5;

        System.out.println("Toplama islemi");
        System.out.println("a+b="+(a+b ));

        System.out.println("Cikarma islemi");
        System.out.println("a-b="+(a-b ));

        System.out.println("Carpma islemi");
        System.out.println("a*b="+(a*b ));

        System.out.println("Bölme islemi");
        System.out.println("a/b="+(a/b ));
        //Normalde sonuc 1.8,ama int`te bölme yapinca tam sayilarin küsüratini yazmaz.
        //bu yuzden sonuc 1 olur
        //tam sonuc istersek bir tanesini double cevirmeliyiz
        System.out.println("(double)a/b sonucu=" +((double)a/b));

        System.out.println("Modül islem=");
        System.out.println("9%5="+ (9%5)); //modül 4
        System.out.println("4%5=" +(5%9));  //modül 5
        //sol kücükse soldaki sayiyi al,soldaki sayi buyukse kalani al.








    }
}
