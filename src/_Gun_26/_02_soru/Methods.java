package _Gun_26._02_soru;

public class Methods {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.
    // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
    //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.
    public static void main(String[] args) {

        Person calisan1=new Person();
        calisan1.name="Hatice";
        calisan1.surname="Demir";
        calisan1.age=30;

        Person calisan2=new Person();
        calisan2.name="Muhammed";
        calisan2.surname="Gürdal";
        calisan2.age=35;
        //1.yöntem
        System.out.println("Name:"+calisan1.name);
        System.out.println("Surname:"+calisan1.name);
        System.out.println("Age:"+calisan1.name);

        System.out.println("Name:"+calisan2.name);
        System.out.println("Surname:"+calisan2.name);
        System.out.println("Age:"+calisan2.name);

        //2.yontem:
        BilgiYazdir(calisan1);
        BilgiYazdir(calisan2);

        //3.Yontem:
        calisan1.BilgiYazdir();
        calisan2.BilgiYazdir();
//$.yontem:
        System.out.println("calisan1="+calisan1);
        calisan1.getBirthYear();
        calisan1.getInitials();
    }
    public static void BilgiYazdir(Person cal){
        System.out.println("Name:"+cal.name);
        System.out.println("Surname:"+cal.name);
        System.out.println("Age:"+cal.name);



    }


}
