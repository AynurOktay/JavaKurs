package _Gun_08_Operators;

public class _02_AritmetikOperators_Sayac {
    public static void main(String[] args) {
         int sayac=0;

         sayac=sayac+1;//sayacin degerini 1 tane artirir
         sayac++;  //sayacin degerini 1 tane artirir
         ++sayac;   //sayacin degerini 1 tane artirir

        //Hepsi ayni

        sayac=sayac-1;   //birer eksiltir
        sayac--;
        --sayac;

        //tek basinayken ayni ama islemin icindeyken
        // ++ veya -- nin sayacin saginda yada solunda olmasi fark eder.
        int toplam=5+sayac; //sonuc=5

        toplam=5 + sayac++; // toplam=5 sayac 1 oldu
        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

        toplam=5+ ++sayac;  //toplam 5+sayac   ,sonuc 7 olur
        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);
        //ozet:
        //++lar sagda ise once islem sonra artis
        // ++lar solda olursa önce artis sonra islem



    }
}
