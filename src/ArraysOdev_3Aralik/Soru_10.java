package ArraysOdev_3Aralik;

public class Soru_10 {
    public static void main(String[] args) {
       //En kucuk sayiyi yazdirin

        int[]sayilar={14,19,5,21};
        int enk=21;

        for (int i = 0; i <4 ; i++) {

            if( enk>sayilar[i])
                enk=sayilar[i];

        }
        System.out.println(enk);
    }
}
