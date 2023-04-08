package Forloop_odev_28kasim;

public class Soru10 {
    public static void main(String[] args) {

        //0 30 arasindaki bütün cift sayilar.(do while loop ile)

         int i=0;
        do{
            if(i%2==0)
            System.out.println("Sayilar="+i);
            i++;
        }
        while(i<=30);

        System.out.println();
    }
}
