package _Gun_45_JavaTekrar;

public class Soru8 {
    public static void main(String[] args) {

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i][j].length(); j++) {
                System.out.println(arr[i][j] + " ");
                //kodun burdan sonraki kismi gereksiz verilmis.
                // kodu etkilemez.dongu icinde hepsi yazilir  //A B C D E
                if (arr[i][j].equals("B")) {
                    continue;  //Eger burda continue yerine break olsaydi icteki döngüyü kirardi.
                               // o zaman a b yazilir c yi yazmadan d ve e ye gecer yazdirirdi

                }
                
            }
                   continue;
        }
    }
}