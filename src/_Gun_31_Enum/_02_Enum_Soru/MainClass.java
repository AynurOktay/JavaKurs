package _Gun_31_Enum._02_Enum_Soru;

public class MainClass {
    public static void main(String[] args) {


    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

  // enum Role  {  ADMIN,MUDUR,SATIS,PERSONEL}   enumlari bu sekilde main classta da tanimlayabiliriz,ayri enum class olusturarark ta tanimlayabiliriz
   //enum Statu {AKTIF,PASIF}

   User user1=new User("ismet", Role.MUDUR, Statu.AKTIF);
   User user2= new User ("mehmet", Role.ADMIN,Statu.AKTIF);
   User user3 = new User ("Ayse" , Role.PERSONEL ,Statu.PASIF);

        System.out.println("User1=" +user1);

   userSil(user1);
   userSil(user2);
   userSil(user3);

}
   public static void userSil(User user){
        if (user.role== Role.ADMIN) {
        System.out.println("admin silinemez");

    }





}}