package _Gun_07_StringMethods;

public class _02_StringEqualsIgnoreCase {
    public static void main(String[] args) {

        String s1="Merhaba";
        String s2="MERHABA";

        System.out.println("s1.equals(s2)= " + s1.equals(s2));//false
        System.out.println("s1.equalsIgnoreCase(s2)="+ s1.equalsIgnoreCase(s2));

        //ikincisinde buyuk kucuk harf ignore edildigi icin true cikar


    }


}
