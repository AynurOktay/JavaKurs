package Utility;

public class Saat {

    public static void Bekle(int sn){
        try{
            Thread.sleep(1000*sn);}
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}
