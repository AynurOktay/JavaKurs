package Odev_String_15_11;

public class Soru8_13 {
    public static void main(String[] args) {

        //soru 8
        String str1="Mouse";
        int uzunluk=str1.length();
        System.out.println("Ucuncu karakter="+ str1.substring(str1.length()-3,str1.length()-2));

        //2.cozum
        String donanim="Mouse";
        char karakter=donanim.charAt(2);
        System.out.println("Mouse kelimesinin 3.karakteri:" +karakter);

        //soru 9
        String str2="paper";
        System.out.println("str2.toUpperCase="+str2.toUpperCase());

        //soru 10
        String str3="oraNge";
        System.out.println("str3.toLowerCase=" +str3.toLowerCase());

        //soru 11
        String str4="New Jersey";
        System.out.println("str4.toUpperCase()" +str4.toUpperCase());

        //soru 12
        String str5="New York";
        System.out.println("str5.toLowerCase=" +str5.toLowerCase());

        //soru 13
        String str6="PADDLE";
        System.out.println("str.toLowerCase=" +str6.toLowerCase());
    }
}
