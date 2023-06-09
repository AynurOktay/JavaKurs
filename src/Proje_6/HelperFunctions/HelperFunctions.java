package Proje_6.HelperFunctions;


import jdk.nashorn.internal.objects.NativeString;

import static Proje_6.Database.Address.cityList;

public class HelperFunctions {

    /*

        Proje kapsamında gerekli genel methodlari burada tanımlayacağız, buradaki methodlari birer doğrulayıcı yada
    oluşturucu olarak düşünebiliriz. Örneğin bir city nin varlığını doğrulama veya bir rastgele bir numara oluşturuma.

     */



      /*  Bir method oluşturalım ve adına "checkCity" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir city almalı

        Eğer ki city:
            Address classinin icerisindeki static arrayliste bulunan bir city e eşit değilse
            bir RuntimeException firlatsin ve şu mesaji geçsin:
                "We can not continue your process because, there is no shipping that location."
        Eğer ki city:
            Arraylistin içerisinde var ise o zaman city i dondursun.



        public static String checkCity(String city){
            for (int i = 0; i <cityList.size() ; i++) {

                if(cityList.get(i).equals("city"))
                    break;
                 else
                System.out.println("We can not continue your process because there is no shipping that location");

            }


        /*

            Bir method oluşturalım ve adına "generateShippingTrackingNumber" diyelim,
                Tipi: static
                Return tipi: String
                Parametre: String türünden bir fullname, bir city, bir zipcode almalı

            Bu methodun amacı bir kargo takip numarasi üretmektir.

            kargo takip numarası şu şekilde oluşacak ve daha sonrada return olacaktır.

                city nin ilk 3 harfi + zipcode + fullname in baş harfleri

            son olarak ise dönen değer tamamen büyük harde dönmelidir.

            örneğin bir takip kodu: IZM35430CK (Izmir + 35430 + Cem Karaca)

         */
        /*public static String generateShippingTrackingNumber (String fullName,
             String city ,String zipCode){
            int boslukIndex=fullName.indexOf(" ");
            String trackingNumber=city.substring(0,2).toUpperCase()+zipCode+ fullName.charAt(0)+fullName.charAt(boslukIndex+1);
            return trackingNumber;
        }
    /*

        Bir method oluşturalım ve adına "checkZipCode" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir zipCode almalı

        Eğer ki zipCode:
            5 rakamdan oluşmuyorsa RuntimeException firlatmalı ve mesaj olarak ise "Please enter valid Zip Code"
            geçmeli
        diğer durumda ise zipCode unu döndürmeli
     */

    /*    public static String checkZipCode(String zipCode){
            if(zipCode.length()==5)
                return zipCode;
            else
                System.out.println("Please enter valid Zip Code");
        }

    }*/

}
