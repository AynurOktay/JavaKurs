package _Gun_28_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    public Ogrenci(){
        System.out.println("nesne olusturuldu");
    }
   public Ogrenci (int id,String ad,String soyad ,int sinifi){
      this.id=id;
      this.ad=ad;
      this.soyad=soyad;
      this.sinifi=sinifi;
    }
    public Ogrenci (int id,String ad ,String soyad){
        this(id,ad,soyad,0);  //this ogrenci


    }
    //    mühendisin arabayı çizdiği kağıttaki modeller: class, tipin adı, türün adı
//        buna bakarak yapılmış araba ise nesne, araba üretilirken yapılan işlemlerin
//        yapıldığı metos ise Constructor yani yapıcı metodlar


}
