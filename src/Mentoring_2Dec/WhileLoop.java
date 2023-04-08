package Mentoring_2Dec;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
         String str="Merhaba";
         String ters="";
        for (int i = str.length()-1; i >0; i--) {
            ters = ters + str.charAt(i);

            if (str.equals(ters))
                System.out.println("Polindromdur");
             else
                System.out.println("Polidrom degildir");

//Yontem2:

          Scanner scan=new Scanner(System.in) ;
            System.out.println("enter number or string:");
            String value= scan.nextLine();
            boolean isPolindrome=true;
            for (int j = 0; j <(value.length()-1)/2 ; j++) {
                if (!(value.charAt(j)==value.charAt(value.length()-1-j))){
                    isPolindrome=false;
                }
            }
            System.out.println("isPolindrome = " + isPolindrome);


        }
            
        }
    }




