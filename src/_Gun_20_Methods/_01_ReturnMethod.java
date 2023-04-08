package _Gun_20_Methods;

public class _01_ReturnMethod {
    public static void main(String[] args) {

        System.out.println("Merhaba");

        merhabaYaz();//giden yok,dönen yok,sadece yazdiriyoz        toplamYaz(4, 5);//giden var,dönen yok
        int enb = Math.max(4, 5);//giden var,
        double sayi = Math.random();//giden yok,dönen var _bU FONKSIYON BIRSEYE ESITLEYEBILIYORUM;SADECE YAZDIRMIYOR

        enbYaz(4, 5);
        enb = enbBul(4, 5);
        System.out.println("enb=" + enb);
        //metodda return oldugu icin main de yazdirabiliyoruz!!!!
        //yani metodun sonucunu alabiliyoruz(dönen)
    }
   public static int enbBul(int a,int b){  //geriye bir sonuc gönderdigi icin void yazmiyoruz,dönecek degerin tipini yaziyoruz.(int)void tipsiz demekti
        int donecek=0;
        if(a>b)
            donecek=a;
        else
            donecek=b;
        return donecek ;} //donecek deger}

   public static void merhabaYaz(){
           System.out.println("Merhaba");
       }
    public static void toplamYaz(int a,int b){
        System.out.println("Merhaba");
    }
    public static void enbYaz(int a,int b){
        System.out.println("Merhaba");
    }
   } // dönecek tip









