package Forloop_odev_28kasim;

public class Soru6 {
    public static void main(String[] args) {

        //0 ile 100 arasinda hem 4 e hem 5e bölünen syilar

         for(int i=0 ;i<=100 ; i++)
             if(i%5==0 && i%4==0 )
                 System.out.println(i);
    }
}
