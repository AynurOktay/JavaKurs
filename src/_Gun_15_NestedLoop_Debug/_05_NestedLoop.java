package _Gun_15_NestedLoop_Debug;

public class _05_NestedLoop {
    public static void main(String[] args) {

        //*
        //**
        //***
        //****
        //*****
        //*****
        //****
        //***
        //**
        //*
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
    }



    }
}
