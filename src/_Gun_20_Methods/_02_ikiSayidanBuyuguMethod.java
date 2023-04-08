package _Gun_20_Methods;

import java.util.Scanner;

public class _02_ikiSayidanBuyuguMethod {
    public static void main(String[] args) {

        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("1.sayi =");
        int sayi1 = scan.nextInt();
        System.out.print("2.sayi =");
        int sayi2 = scan.nextInt();
        int enb=dahaBuyuk(sayi1,sayi2);
        System.out.println("enb="+enb);

    }

    public static int dahaBuyuk(int sayi1, int sayi2) {
        int donecek = 0;
        if (sayi1 > sayi2)
            donecek = sayi1;
        else
            donecek = sayi2;
        return donecek;
        //2.yontem:
        //   return sayi1>sayi2 ? sayi1 : sayi2;   //if li kismi ternary operator ile daha kisa yapabiliriz

        //3.Yontem:
        /*if (sayi1>sayi2)
            return sayi1;
        else
            return sayi2;*/

    //2. ve 3. yontemi kullanmak daha iyi!!!!!!

    }

}





