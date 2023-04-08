package _Gun_20_Methods;

public class _05_Methods {
    public static void main(String[] args) {

        //Birden fazla  methoda ayni ismi verebiliriz ama icindeki parametre sayilari farkli olmalidir.
        // mesela birinde 2 sayi digerinde 3 sayi var ama ikiside ayni islemi yaptigi icin toplambul ismini 2 farkli metoda kullandik
        //Hatta 2 String ifadeyi de toplambul metodu ile birlestirebiliriz.Yeterki parametreler farkli olsun
        int s1=4;
        int s2=12;
        int s3=34;

        int sonuc1=toplamBul(s1,s2);
        int sonuc2=toplamBul(s1,s2,s3);

        String ad="ismet";
        String soyad="temur";
        String sonuc3=toplamBul(ad,soyad);

        //yazdrma kismi
        System.out.println(toplamBul(s1,s2));
        System.out.println(toplamBul(s1,s2,s3));
        System.out.println(toplamBul(ad,soyad));
    }
    public static int toplamBul(int s1,int s2){
        return s1+s2;

    }

    public static int toplamBul(int s1,int s2,int s3) {
        return s1 + s2 + s3;

    }

    public static String toplamBul(String ad,String soyad) {
        return ad+" "+soyad;

    }



}
