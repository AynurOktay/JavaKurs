package ArraysOdev_3Aralik;

public class _5_ArrayElemansayisi {
    public static void main(String[] args) {
        //Arraydeki eleman sayisini yazdir

        String[] sehirler={"new jersey","new york ","boston","california"};

        int elemanSayisi=0;

        for (int i = 0; i <sehirler.length  ; i++) {
           elemanSayisi++;
        }

        System.out.println(elemanSayisi);


      //  2. kisa cözüm:

        String[] sehirler2={"new jersey","new york ","boston","california"};
        System.out.println("Eleman sayisi=" +sehirler2.length);
    }

}
