package _Gun_43_HataYonetimi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_TryCatchMultiple {
    public static void main(String[] args) {

        System.out.println("Program basladi");
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Sayi1 = ");
            int sayi1 = scan.nextInt();

            System.out.println("sayi2=");
            int sayi2 = scan.nextInt();

            int bolum = sayi1 / sayi2;

            System.out.println("Bolum=" + bolum);
        }
        catch (InputMismatchException ex)  //belirli bir hata
        {
            System.out.println("Lutfen sayi giriniz");

        } catch (ArithmeticException ex)  //belirli bir hata
        {
            System.out.println("Sifira bolme hatasi");
        }
        catch(Exception ex)    //yukaridakilerin disinda kalan butun hatalar
        {
            System.out.println("hata=" + ex.getMessage());
    }
        System.out.println("Program bitti");

}
}
