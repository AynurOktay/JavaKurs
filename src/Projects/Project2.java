package Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Project2 {


    public static void main(String[] args) {

        List<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));
        List<String> userList = new ArrayList<>(Arrays.asList("user1", "user2", "user3"));
        List<String> passwordList = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));
        List<String> hesap = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));
        List<Integer> bakiye = new ArrayList<>(Arrays.asList(200, 1000, 5000));
        boolean devamMi = false;


        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        while (devamMi == false) {


            System.out.println("Please enter your username");
            String userName = scan.nextLine();

            System.out.println("Please enter your password:");
            String password = scan.nextLine();
            if (confirmUsernameAndPassword(userList, passwordList, userName, password) == true) {
                System.out.println("Basarili bir sekilde giris yaptiniz.");
                devamMi = true;
            } else
                System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin ");
        }
        boolean durum = false;
        while (durum == false) {

            System.out.println("Lutfen yapmak istediginiz islemi seciniz." );/*+ "\n" +
                    "Para yatir - 1" + "\n" + "Para cek -2" + "\n" + "Transfer -3" + "\n" + "Cikis -4");*/

            for (int i = 0; i <actions.size() ; i++) {
                System.out.println(actions.get(i)+"-"+(i+1));

            }
            int secim = scan2.nextInt();

            switch (secim) {
                case 1: {
                    System.out.println("Bu bankamatik gecici olarak para yatirma islemine kapalidir.Lutfen daha sonra tekrar deneyiniz");
                    break;}
                case 2:{
                    System.out.println("Lutfen para cekmek istediginiz hesap numarsini girin");
                    for (int i = 0; i <hesap.size() ; i++) {
                        System.out.println(hesap.get(i));
                    }
                    String secilenHesap = scan.nextLine();

                    System.out.println("Ne kadar para cekmek istiyorsunuz?");
                    int cekilenPara = scan2.nextInt();
                withdraw(hesap,bakiye,secilenHesap,cekilenPara);

                    break;}

                case 3:{
                    System.out.println("Bu islemi su an gerceklestiremiyoruz.");
                    break;}
                case 4:{
                    System.exit(1);}
                default:
                    System.out.println("Basarili bir secim yapmadiniz...");
            }
        }
    }

    private static boolean confirmUsernameAndPassword(List<String> users, List<String> passwords, String
            username, String password) {
        boolean dogruMu = false;

        for (int i = 0; i < users.size(); i++) {
            if ((username.equals(users.get(i)) && (password.equals(passwords.get(i))))) {
                dogruMu = true;
                break;
            }
        }

        return dogruMu;

    }
    private static void withdraw(List<String> accounts, List<Integer> funds, String chosenAccount, int amountToWithdraw) {
        int restAmount = 0;
        boolean ayniMi=false;
        for (int i = 0; i <accounts.size() ; i++) {

            if(accounts.get(i).equals(chosenAccount))
            {if(funds.get(i)>=amountToWithdraw){
                restAmount=funds.get(i)-amountToWithdraw;
                System.out.println("Kalan bakiye = " + restAmount +"Euro");
                funds.set(i,restAmount);
                ayniMi=true;
                break;
            }else{
                System.out.println("Yeterli bakiyeniz yoktur");
                ayniMi=true;
                break;}

            }
        }
         if(ayniMi==false)
             System.out.println("Beklenmedik bir hata olustu.Iyi gunler dileriz");

    }

}
