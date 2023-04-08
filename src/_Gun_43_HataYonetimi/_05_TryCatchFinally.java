package _Gun_43_HataYonetimi;

public class _05_TryCatchFinally {
    public static void main(String[] args) {

       try {
  //hata olma olasiligi olan yer

       }catch(Exception ex)
        {

        //hata oldugunda yapilacaklarin oldugu yer
       }
        finally //hata olsa da olmasa da calisacak kisim.
               //bu bolum yukaridaki surecle oldugunu gostermek icin finally icinde yazilir
        {
        }

       System.out.println("Diger calisan kodlar");
        System.out.println("Program sonu" );

        long startTime=0;
        String str="";

        try {
            startTime=System.currentTimeMillis();
            System.out.println("Hatadan onceki kisim");
            char ilkHArf=str.charAt(0);
            System.out.println("Hatadan sonraki kisim");
            //hata olma olasiginin oldugub kodlar
        }
        catch (Exception ex)
        {
            System.out.println("catch blogu calisti");
            //hata oldugunda yapilacaklar
        }
        finally
        {
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure="+ gecenSure);
        }
        System.out.println("diger calisan kodlar");
        System.out.println("program sonu");





















    }
}
