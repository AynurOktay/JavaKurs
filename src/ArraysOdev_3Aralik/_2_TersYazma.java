package ArraysOdev_3Aralik;

import java.util.Arrays;

public class _2_TersYazma {
    public static void main(String[] args) {

        //Stringi tersten yazdirin

        String cumle = "Hello World";

        for (int i = cumle.length()-1; i >=0 ; i--) {
            System.out.print(cumle.charAt(i));

        }
      //Array ile cözum:

        char[]c=new char[cumle.length()];
        for (int i = 0; i <c.length ; i++) {
            c[i]+=cumle.charAt((c.length-1)-i);
        }
        System.out.println(Arrays.toString(c));



        }


    }

