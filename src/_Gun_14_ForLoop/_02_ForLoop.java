package _Gun_14_ForLoop;

public class _02_ForLoop {
    public static void main(String[] args) {

        //1 den 5 e kadar olan sayilari ekrana yazdirin
        //Döngünün kac kere dönecegi belli degilse while kullaniriz

        int i=1;
        while (i<=5)
        {
            System.out.println("w_i=" +i);
            i++;
        }
         //For Loop ile yapilisi:
        //for döngüsü basi belli,sonu belli ,artisi belli ise kullanilir.

        for ( i=1 ;i<=5 ; i++){
            System.out.println("f_i=" +i);
        }




    }
}
