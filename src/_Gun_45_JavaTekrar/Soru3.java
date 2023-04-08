package _Gun_45_JavaTekrar;

public class Soru3 {
    public static void main(String[] args) {
        String [] arr={"A","B","C","D"};

        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");

            if (arr[i].equals("D")) {
                System.out.println("Work done");
                break;//break den sonra zaten döngü bittiginden break te etkilemez
            }
            continue; // bundan sonra bisey gelmedigi icin continue gereksiz
        }
             // A B C D Work done yazdirir
    }
}
