package _Gun_44_Java_tekrar;

public class Soru5 {
    public static void main(String[] args) {

       String []strs =new String[2];
       int idx = 0;
       for (String  s : strs){
           strs[idx].concat("element" + idx);
           idx++;
         //String ifadelerin default degeri null oldugu icin null uzerine concat yapilamaz
         //Null pointer exeption hatasi verir
       }
        for (int i = 0; i <strs.length ; i++) {
            System.out.println(strs[i]);
        }
    }
}
