package _Gun_28_classes.Kitapci;

public class Kitapci {
    public static void main(String[] args) {

        ///Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.


       Book kitap1=new Book();
       kitap1.name="Ince Memed";
       kitap1.publishYear=1975;
       kitap1.author="YasarKemal";


       Book kitap2=new Book("Tutunamayanlar" ,"Oguz Atay");

        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap2 = " + kitap2);


    }

}
