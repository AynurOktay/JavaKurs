package _Gun_34_Inheritance.Protected.Paket2;

import _Gun_34_Inheritance.Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {


    public P2Kedi(String ad ,String cinsi) {

        this.ad=ad;
        this.cinsi=cinsi; //protected oldugunda ancak baska paketten extends yaptigimizda erisebiliyoruz
                          //Normalde ad cikar ama cinsi protected oldugundan cikmazdi.ama inherit ettigimiz icin erisilebildi
    }
}
