package _Gun_45_JavaTekrar;

public class Soru7 {
    public static void main(String[] args) {

        //Ciktisi ne olur?
        int[][] num= new int[3][1];

        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                num[i][j]=10;

            }
        }

        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("num["+i+"]["+j+"]="+num[i][j]);
            }
        }

   //

    }


}
