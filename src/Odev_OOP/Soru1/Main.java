package Odev_OOP.Soru1;

public class Main {
    public static void main(String[] args) {
       /* 4 tane class oluşturulmuştur. Cats, Tigers, Lions, HomeCats
        Cats class'ı super class'dır. (parent) (Ana)
                Bütün class'lar Cats class'ının extend'idirler. (Uzantısı, Alt sınıfı, Çocukları)
        Cats class'ının içine 2 tane method oluşturunuz.
        1) walk isminde bir method oluşturun. Return tipi void olmalıdır. Bu methodun içinde "Cat is walking" yazdırnız.
        2) abstract(soyut) method'un ismi talk olmalıdır. Return tipi void olmalıdır.
        Not: Çünkü bu method soyuttur, bir body'si(beden) yoktur.
        Bütün child(Çocuk) class'lar Cats class'ının içindeki abstract method' extend olmalıdır.
        Tiger class'ı abstract method'u
        "Tiger is talking" yazdırınız.
                Lion class'ı abstract method'u
        "Lion is talking" yazdırınız.
                HomeCat class'ı abstract method'u
        "Home Cat is talking" yazdırınız.
                main class'ın içinde
        Tigers için bir object oluşturun
        ve bu talking methodunu çağırınız.
                Sonra walking methodunu çağırınız.
                Lions için bir object oluşturun
        ve bu talking methodunu çağırınız.
                Sonra walking methodunu çağırınız.
                HoemCats için bir object oluşturun
        ve bu talking methodunu çağırınız.
                Sonra walking methodunu çağırınız.*/

       Cats tiger=new Tigers();
       tiger.talk();
       tiger.walk();
       Cats lion=new Lions();
       lion.talk();
       lion.walk();
       Cats homeCats= new HomeCats();
       homeCats.talk();
       homeCats.walk();

    }
}
