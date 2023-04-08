package _Gun_47;

public class Soru1 {
    public static void main(String[] args) {
    String [][] chs = new String [2][];
    chs[0]= new String[2];   //2
     int i=97;

        for (String []ca :chs) {
            for (String c:ca) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b <chs.length ; b++) {
                chs[a][b] = ""+i;  //i yi otomatik Stringe ceviriyor
                                   //00->97,01-> 98 ,10-> 99 , 11->100  yazar
                i++;
            }

        }
        for (String []ca :chs) {
            for (String c:ca) {
                System.out.print(c+" ");}
            System.out.println();}







    }
}
