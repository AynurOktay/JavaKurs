package Odev_OOP.Soru4;

public abstract class Data {



   /* Data class'ını Abstract yapın.
    ismi getArea olan bir abstract method oluşturunuz.
            return type'ı double.
    ismi pi olan bir final double variable oluşturunuz.
            pi 3.14'e eşittir.
            3 tane private int variable oluşturun
        1) radius (yarıçap)
        2) length (boy)
        3) width (en)
    bu üç variable için getter ve setter oluşturun.*/


    abstract double getArea();

    public final double pi = 3.14;
    private int radius;
    private int length;
    private int width;

    public Data() {
    }

    public Data(int radius, int length, int width) {
        setRadius(radius);
        setLength(length);
        setWidth(width);

    }


    public double getPi() {
        return pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



    @Override
    public String toString() {
        return "Data{" +
                "pi=" + pi +
                ", radius=" + radius +
                ", length=" + length +
                ", width=" + width +
                '}';
    }


}