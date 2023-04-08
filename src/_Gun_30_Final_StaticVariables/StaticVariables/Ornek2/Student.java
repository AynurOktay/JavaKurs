package _Gun_30_Final_StaticVariables.StaticVariables.Ornek2;

public class Student {

    int id;
    String fullname;

    static int sayac=1;

    //static sadece 1 tane olur
    // static olmadan herzaman 1 le başlıyordu,cunku her new nesne olusturdugumuzda tekrar 1 den baslar sayac,artmaz
    //o zaman butun id lere 1 yazar
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı.her nesne icin birer artarak devam etti
    // tüm nesnelere ait olan bilgiler veya
    // sayac gibi işlemler için static kullanılır.
    public Student(int id, String name) {
        this.id = id;     //bu costruction maindeki ilk 3 satir icin gerekli.static degisken olusturduktan sonra buna gerek kalmiyor.yeni id lker sayac arttikca olusuyor
        this.fullname = name;
    }
    public Student(String name){
        this.id=sayac++;
        this.fullname=name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + fullname + '\'' +
                '}';
    }
}
