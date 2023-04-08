package _Gun_38_Abstract.Ornek1_;

public class Main {
    public static void main(String[] args) {

        /*1- içinde name field ı olan Sekil isimli bir Abstract Class yazınız.
        2- Bu classın Alan ve cevre abstract metodları ve içind eAlan ve cevre nin sonucu olan toString somut metodu,
        sekilin adını veren getName somut metodu ve ciz isimli somut metodlarını ekleyiniz.
        3- Bu sınıftan Dikdörtgen ve Daire isimli 2 class oluşturunuz.
        4- Bunlardan birer örnek main metodunda çalıştırınız.*/

           Dikdortgen di=new Dikdortgen(4,5);
           di.setName("Dikdörtgen"); //Dikdortgene isim verdik
           di.ciz();
           System.out.println(di);

           Daire da=new Daire(4);
           da.setName("Daire");
           da.ciz();
           System.out.println(da);





    }
}
