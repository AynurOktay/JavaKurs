package _Gun_04_Casting;

public class _04_Narrowing {
    public static void main(String[] args) {

        double oran=3.2;
        int sayi=5;

        //sayi=oran  seklinde atama yapamayiz.Büyük kücüge atanmaz

        sayi=(int) oran;  //seklinde yaparsak java kabul eder ,
                           // ama deger kaybi olabilir.
                           //parantez icine int yazarak bunu bilerek yaptigimizi kgösteririz

        System.out.println("sayi = " + sayi);
        //3 diye yazdirir,veri kaybi olur.double'i in'e atadik

        //Orn-2
        byte kisaKenar=5;
        byte uzunKenar =7;

        byte cevre=(byte)(kisaKenar+uzunKenar+kisaKenar+uzunKenar);
        System.out.println("cevre = " + cevre);
        //kenarlarin toplamini hesaplayinca java Int algiliyor,kabul etmiyor
        // int'i byte'a atamaya calisiyorsun
    //eger veri kaybi olmayacagindan eminsen yada onemli degilse bunun önüne byte yazarak narrowing yapiyoruz.
        // Cunku int byte`tan buyuk.






    }
}
