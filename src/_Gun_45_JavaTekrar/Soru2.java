package _Gun_45_JavaTekrar;

public class Soru2 {
    public static void main(String[] args) {

        String [] arr={"A","B","C","D"};

        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");

            if (arr[i].equals("C")) {  //ilk adimda burasi calismaz
                continue;
            }
            System.out.println("Work done");
            break;
        }
        //  A
        //Work done   yazar.
       // Eger break olmasaydi A  Work donr   B work done C   D   Work done yazardi
    }
}
