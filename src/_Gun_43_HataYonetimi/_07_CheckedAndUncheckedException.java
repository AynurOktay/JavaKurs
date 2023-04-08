package _Gun_43_HataYonetimi;

public class _07_CheckedAndUncheckedException {
    public static void main(String[] args) {

        String str="";
        char ilkHarf=str.charAt(0);
        //boyle bir hata da try-catch ister kullaniriz ,ister kullanmayiz.try catch olmazsa da kod calisir ama exeption verir
        //unchecked exeption

        try {
            Thread.sleep(1000); //burda try catch kullanmak mecbur.Checked exception.try catch e almazsak bu kodu kullanmayiz.
        } catch (InterruptedException e) {
            System.out.println("Hata olustu");
        }

    }


    }

