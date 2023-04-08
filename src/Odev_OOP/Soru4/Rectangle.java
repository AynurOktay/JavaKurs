package Odev_OOP.Soru4;

public  class Rectangle extends Data{
    @Override
    double getArea() {
        return getWidth()*getLength();
    }



/* Rectangle classını Data classına extend ediniz.
    getArea methodunu Override ediniz.
    Rectangle'ın (dikdörtgen) alanını hesaplayın ve sonucu return edin.
    Rectangle alan formülü: area = length * width
    getter setter isimlerini buradan alınız
            getLength
    setLength
            getRadius
    setRadius
            getWidth
    setWidth*/
}
