package _Gun_47;

public class Soru4 {
    public static void main(String[] args) {
        int n[][]= {{1,3},{2,4}};

        for (int i = n.length-1; i >=0 ; i--) {
            for(int y: n[i]){
                System.out.print(y);
            }
            //2,4,1,3 yazdirir
        }



    }
}
