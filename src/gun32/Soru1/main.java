package gun32.Soru1;

public class main {
    public static void main(String[] args) {
        //Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
        // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
        // Main de 1 tane nesne oluşturup bunu kontrol ediniz.


        Araba car =new Araba();
        car.setRenk("Gri");
        car.setModel("BMW");
        car.setMotorHacmi(1.6);
        car.setKapiSayisi(3);

        System.out.println("car = " + car);

        Araba car2 =new Araba("mavi" ,"Mercedes",1.8 ,4);
        System.out.println("car2 = " + car2);
    }
    // KURAL: genel yazılım kuralıdır.
    // bütün değişkenler private yapılır.
    // yani Kapsulleme ile kullanılır.
    // Eğer gerekiyorsa private kaldırılır.



}
