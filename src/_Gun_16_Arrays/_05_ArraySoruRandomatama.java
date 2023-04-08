package _Gun_16_Arrays;

public class _05_ArraySoruRandomatama {
    public static void main(String[] args) {

        //5 tv kanali ismini bir diziye doldurunuz.
        //Daha sonra random olarak bir tanesini secip ekrana secileni yazdir

        String[] kanallar= {"trt" ,"atv" ,"kanald","zdf","ard"};

        int rastgele=(int) (Math.random() *  kanallar.length);

        System.out.println("Rastgele secilen Tv=" +kanallar[rastgele]);

    }
}
