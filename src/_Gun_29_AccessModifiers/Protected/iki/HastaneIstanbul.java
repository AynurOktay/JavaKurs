package _Gun_29_AccessModifiers.Protected.iki;

import _Gun_29_AccessModifiers.Protected.bir.Doctor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        Doctor dr1=new Doctor("mehmet");
        dr1.hastaneAd="Istanbul Hstanesi";

        //baska package oldugundan sadece public olan hastane adina erisebildik

    }
}
