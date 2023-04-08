package _Gun_35_Final_Polymorphism.Polymorpysm;

public class CiftlikMain {
    public static void main(String[] args) {

        //  aşağıda Hayvan classından türettiğimiz-extend yaptığımız için
        //  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
        //  köpek ve kedi için classlarında Override yaparak yazdığımız
        //  özellikleri alarak yazdı.
        //  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
        //  yazdıklarımızı hayvanSesi methodunda yazdıramayız.

        //Bir NESNE istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.


     /*}   Kopek kopek1=new Kopek("karabas");

          kopek1.ses(); //havladi
          kopek1.kokladi(); //kokladi

        Kedi kedi1=new Kedi("Köpük");

             kedi1.ses();//miyavladi
              kopekSesi(kopek1);//havladi

        hayvanSesi(kopek1); //havladi
        hayvanSesi(kedi1);  //miyavladi

        //*************************************
    Hayvan hayvan =new Hayvan("aslan");
        //Referans tipi      //nesne tipi
        Hayvan hayvan1=new Hayvan("ordek");
        Hayvan hayvan2=new Kopek("kangal");
        Hayvan hayvan3=new Kedi("boncuk");

        System.out.println("________________");
        hayvan1.ses();//ses cikardi yazar
        hayvan2.ses(); //havladi
        hayvan3.ses();   //miyavladi
        System.out.println("________________");

        hayvan2.ses();//hayvan 2 kopek te olsa Referansi sebebiyle metodlar kisitli
                      //tip dönüsümü ile hayvandan köpek formu cikaririm

        ((Kopek)hayvan2).kokladi(); //Bu sekilde hayvani kopege cevirince diger metodlari da kullanabilirim



        //Bir classin aslinda kim oldugunu bulma yontemi:
        if(hayvan instanceof Kopek)
            ((Kopek)hayvan).kokladi();



    }

    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }

  // public static void kediSesi (Kedi kedi){
       // kedi.ses();


   public static void hayvanSesi(Hayvan hayvan){

        hayvan.ses();
   }*/

    }
}