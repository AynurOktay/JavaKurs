package _Gun_47;

public class Soru2 {
    public static void main(String[] args) {

        String shirts[][] =new String [2][2];
        shirts[0][0]= "red";
        shirts[0][0]="blue";
        shirts[0][0]="small" ;
        shirts[0][0]="medium";

        for (int index = 0; index <2 ; index++) {
            for (int idx = 0; idx < 2; idx++) {
                System.out.println(shirts[index][idx]+":");
            }   //medium yazdirir
        }
        for (int index = 0; index <2 ; ++index) {
            for (int idx = 0; idx < index; ++idx) {
                System.out.println(shirts[index][idx] + ":");
             //sadece small yazdirir
            }
        }
        for (String []c:shirts) { //shirts icindeki satirlari al,c ismini ver ve döngüye gönder
            for (String s:c ) {    //satirdaki elemanlari al s adini ver ve döngüye gönder
                System.out.println( s +":");
            }
              //hepsini yazdirir.
        }




    }
}
