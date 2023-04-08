package Odev_String_15_11;

public class Soru1_7 {
    public static void main(String[] args) {
        //1.soru
        String cumle="I love java";
        int karakter=cumle.length();
        System.out.println("karakter = " + karakter);


        //2.soru
        String dize="Sprint planning";
        int karakter2=dize.length();
        System.out.println("karakter2 = " + karakter2);

        //3.soru
        String kelime="apple";
        System.out.println("kelime.contains(app)="+kelime.contains("app"));

        //4.soru
        String str1="orange";
        String str2="Apple";

        System.out.println("str.equals(str2)="+str1.equals(str2));

        //5.soru
        String str3="apple";
        String str4="Apple";
        boolean esitMi=str3.equalsIgnoreCase(str4);
        System.out.println("Esit mi?="+esitMi);

        //6.soru

        String str5="Florida";
        int index=str5.indexOf("o");
        System.out.println("index = " + index);

        //7.soru
        String str6="Thank you";
        int konum=str6.indexOf("y");
        System.out.println("konum = " + konum);










    }
}
