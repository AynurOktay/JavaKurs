package _Gun_11_Ternary_MathMethods;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //Math random(): double sayi üretir.
        //0 ile 0.99999999 arasi sayi üretir

        double randSayi=Math.random();
        System.out.println("Randon sayi=" +randSayi);

        // 0-6 arasi üretmek icin 6 ile carpariz .sonuc 5,9

        int rndTamsayi=(int)(Math.random() * 6);
        System.out.println("randomsayi=" + rndTamsayi);

    }
}
