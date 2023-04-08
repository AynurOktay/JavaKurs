package _Gun_43_HataYonetimi;

public class _01_JavaException {
    public static void main(String[] args) {
        System.out.println("program calismaya basladi");
        String kelime="";//burada ; koymadigimizda olusan hata Compile error
        char harf=kelime.charAt(3); //kelime 3.index olmadigi icin calisirken hata verir.

        System.out.println("program bitti");

         //Program calismadan once olusmis eksikliklerden kaynakli hatalara
        // derleme zamani yani COMPILE ERROR ,Exception diyoruz.
         //Program calistiktan sonra olusan hatalara da RUNTIME ERROR,Exception diyoruz


    }
}
