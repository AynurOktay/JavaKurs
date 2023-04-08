package Proje_6.Database;

public class Items {/*

        Item class ını bir veritabanı olarak düşünebiliriz fakat burada bir static method kullanmak yerine satın alınmak
    istenen ürüne göre işlem yapacağız. Örneğin satın alınmak istenen ürün bir telefon ise bize o telefon için bir ücret
    döndürecek ve bu ücreti user in bakiyesine ekliyeceğiz.

     */

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "ItemName" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir itemName almalı

        Eğer ki itemName:
            "Rose teddy bear" ise 30,
            "Iphone max" ise 850.23,
            "laptop mouse" ise 23.50,
            "Monitor" ise 90.23,
            "charger" ise 43.20,
            "hdmi cable" ise 5.90,
            "mug" ise 30
        değerlerini döndürmeli



    // Method buraya yazılacak*/

    public static double ItemName(String itemName) {
        double price = 0;
        if (itemName.equalsIgnoreCase("Rose Teddy Bear"))
            price=30;
        else if (itemName.equalsIgnoreCase("Iphone max"))
            price=850.23;
        else if (itemName.equalsIgnoreCase("Laptop mouse"))
            price=23.50;
        else if (itemName.equalsIgnoreCase("Monitor"))
            price=90.23;
        else if (itemName.equalsIgnoreCase("Charger"))
            price=43.20;
        else if (itemName.equalsIgnoreCase("hdmi cable"))
            price=5.90;
        else if (itemName.equalsIgnoreCase("mug"))
            price=30;
        return price;
    }



       /* Bir method oluşturalım ve adına "colorPrice" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir color almalı

        Eğer ki color:
            "Red" ise 10,
            "Blue" ise 6,
            "Black" ise 4,
            "White" ise 2
        değerlerini döndürmeli

     */

    // Method buraya yazılacak

   public static double colorPrice(String color){
       double colorPrice=0;
       if(color.equalsIgnoreCase("Red"))
       colorPrice=10;
       else if (color.equalsIgnoreCase("Blue"))
       colorPrice=6;
       else if(color.equalsIgnoreCase("Black"))
       colorPrice=4;
       else if(color.equalsIgnoreCase("White"))
           colorPrice=2;
       return colorPrice;
   }
    /*

        Bir method oluşturalım ve adına "customText" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir text almalı

        Eğer ki text:
            10 karakterden uzun ise 5,
            10 karakterden kısa veya eşit ise 3
        değerlerini döndürmeli

     */

    // Method buraya yazılacak

    public static double customText(String text){
        double customText = 0;
        if(text.length()>10)
         customText=5;
        else if(text.length()<=10)
        customText=3;
        return customText;

    }
}
