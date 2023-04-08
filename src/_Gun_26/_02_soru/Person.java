package _Gun_26._02_soru;

public class Person {
    String name;
    String surname;
    int age;
    public void BilgiYazdir(){
        System.out.println("Name:"+name);
        System.out.println("Surname:"+surname);
        System.out.println("Age:"+age);
   }
public String toString(){
        return name+"\t"+surname+"\t"+age;
}
    public  void getBirthYear(){

        System.out.println("Calisanin dogum yili="+(2022-age));

    }
    public String getBirthYear2(){
        return "dogum yiliniz=" +(2022-age);

    }
    public void getInitials(){
        System.out.println(name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0));


    }



}
