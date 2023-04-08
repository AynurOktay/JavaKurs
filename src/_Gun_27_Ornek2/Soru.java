package _Gun_27_Ornek2;

public class Soru {
   public static void main(String[] args) {
      // Math sınıfndaki metodlarıdan 5 tanesini
      // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
      // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
      // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
      // kullanımlarını yazınız.

      int max=MathMethods.getMax(4,6);
      int min=MathMethods.getMin(4,6);
      int rnd=MathMethods.getRandom(10);
      double usSonuc=MathMethods.getUsAl(2,3);
      double kareKok=MathMethods.getKaraeKok(16);

      System.out.println("max = " + max);
      System.out.println("min = " + min);
      System.out.println("rnd = " + rnd);
      System.out.println("usSonuc = " + usSonuc);
      System.out.println("kareKok = " + kareKok);






   }









}
