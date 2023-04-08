package _Gun_44_Java_tekrar;

public class Soru3 {
    public static void main(String[] args) {
        //What is the result?
   int[]arr={1,2,3,4};
   int i=0;

   do {
       System.out.println((arr[i] + " "));
       i++;
   }while (i < arr.length+1); //+1 olunca 4.index olmadigindan 1234Exception....yazdiirir
    }
}
