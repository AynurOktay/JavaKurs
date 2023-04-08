package Forloop_odev_28kasim;

public class Soru5 {
    public static void main(String[] args) {
       // 0 100 arasi sayilar tek mi cift mi?

        for (int i = 0; i <=100 ; i++) {
            if(i%2==0)
                System.out.println("This number is even and number is "+i);
            else
                System.out.println("This number is odd and the number is " +i);
        }
        System.out.println();
    }
}
