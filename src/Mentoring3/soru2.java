package Mentoring3;

import java.util.Arrays;

public class soru2 {
    public static void main(String[] args) {
        //Ornek 2: Verilen bir Character Array ini String e ceviren programi yaziniz...
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};

        String str=" ";
        for (int i = 0; i <ch.length; i++) {
        str+= ch[i];

        }

        System.out.println("str="+str);

  //2.yontem
        String str2=new String(ch);
        System.out.println("str2=" + str2);

     //3.yontem:
        String str3=String.valueOf(ch);
        System.out.println("str3=" +str3);

    }
}
