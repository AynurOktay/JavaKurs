package _Gun_30_Final_StaticVariables.StaticVariables.Ornek2;



public class School {
    public static void main(String[] args){
      //  Student (id,fullName) seklind 5 ogrenci tanimlayiniz
        //Her ogrencinin takip eden id si olmali(otomatik artan)
        //ve en son kac ogrenci oldugunu bulabilmeliyim

        Student ogr1=new Student(1,"Ismet Temur");
        Student ogr2=new Student (2,"Mehmet Yilmaz");
        Student ogr3=new Student(3,"Beyza Demir");

        Student ogr11=new Student("Ismet Temur");
        Student ogr12=new Student ("Mehmet Yilmaz");
        Student ogr13=new Student("Beyza Demir");
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);
        System.out.println("ogr13 = " + ogr13);

    }
}
