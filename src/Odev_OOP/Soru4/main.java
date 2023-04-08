package Odev_OOP.Soru4;

public class main {
    public static void main(String[] args) {

        Circle circle=new Circle();
        circle.setRadius(6);
        System.out.println("Circle`s area="+circle.getArea());

        Rectangle rectangle=new Rectangle();
        rectangle.setWidth(8);
        rectangle.setLength(6);
        System.out.println("Rectangle`s area="+rectangle.getArea());
    }
}
