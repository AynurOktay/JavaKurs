package GenelTekrar;

public class arrays {
    public static void main(String[] args) {
        int [][]dersler=new int[3][10];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 10; j++) {
                dersler[i][j] = (int) (Math.random() * 100);
            }

        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "-" + j);
            }
        }
    }
}
