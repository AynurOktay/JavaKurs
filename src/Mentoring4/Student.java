package Mentoring4;

public class Student {

   public String ad;
   public String soyad;
   static int no;
   static int count=100;

    public Student(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        no++;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +"No="+
                no+
                '}';
    }


}
