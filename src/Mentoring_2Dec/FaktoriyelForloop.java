package Mentoring_2Dec;

public class FaktoriyelForloop {
    public static void main(String[] args) {
         //Verilen bir sayinin faktoriyelini hesaplayan bir program yazin

        //Faktoriyel=6!=6*5*4*3*2*1

        int sayi=6;
        int faktoriyel=1;
        for (int i = 1; i <=6 ; i++) {
            faktoriyel*=i;
        }
        System.out.println("Faktoriyel="+ faktoriyel);

    }}
