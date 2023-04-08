package OdevMethods;

public class Soru5_StringSayiTopla {
    public static void main(String[] args) {
        /*EvenOddNums isminde bir method oluşturun.
        Bu yöntem String olan bir parametreyi kabul etsin.
        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
        toplam sonucu yazdırın.
       **İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
        For example Örnek:
        String =  "6678421312"
        6+6-7+8+4+2-1-3-1+2
        sonuç 16 olmalı */


        String sayi="6678421312";
        EvenOddNumber(sayi);

    }
    public static void EvenOddNumber(String strSayi) {
        long intSayi=Long.parseLong(strSayi);
        int toplam= 0;
        do{
            if((intSayi%10) % 2 ==0)
                toplam+=intSayi %10;
            else toplam-=intSayi %10;
            intSayi/=10;
        }while (intSayi >0);

        System.out.println("Toplam="+toplam);


    }


}
