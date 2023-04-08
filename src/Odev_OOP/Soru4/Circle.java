package Odev_OOP.Soru4;

public  class Circle extends Data {
    @Override
    double getArea() {
        return getRadius()*getRadius()*getPi();
    }



   /*Circle classını Data class'ına extend ediniz.
    getArea methodunu override ediniz.
    circle'ın alanını hesaplayınız ve sonucu return ediniz.
    circle(daire) alan formülü: area = pi * radius * radius*/


}
