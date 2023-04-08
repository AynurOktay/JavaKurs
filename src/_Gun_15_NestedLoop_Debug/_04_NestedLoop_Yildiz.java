package _Gun_15_NestedLoop_Debug;

public class _04_NestedLoop_Yildiz {
    public static void main(String[] args) {
        //*****
        //****
        //***
        //**
        //*

             for (int i = 5; i > 0; i--) {  // 5 ,4, 3, 2, 1 diye satirlari yaziyor(5ten baslayip 0a gidiyor

                 for (int j = 0; j < i; j++) {
                     System.out.print("*");
                 }
                 System.out.println();
             }
    }
}