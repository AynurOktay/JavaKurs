package _Gun_29_AccessModifiers.PrivateErisim;

public class calisan {
    int id;//default
    String name; //default
    String surname; //default
    private String password;//private


    public void sifreAta(String sifre){

        if(sifre.length()<8) {
            System.out.println("Zayif sifre");
        }
        else {
            password=sifre;
            System.out.println("Sifre basariyla atandi");
        }
    }

   public void sifreGoster(){
       System.out.println("****"+password.substring(4));
   }

}
