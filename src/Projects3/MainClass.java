package Projects3;

import java.util.*;

public class MainClass {


    public static void main(String[] args) {


        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        boolean isRight = false;
        boolean choice = false;

    //Banka islemleri listesi tanimlayin:
        ArrayList<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));

        //Hesap numaralari tanimlayin;
        Account user1_account1= new Account(1234,200);
        Account user1_account2= new Account(4321,20);
        Account user2_account1= new Account(5678,200);
        Account user2_account2= new Account(8765,450);
        Account user3_account1= new Account(9999,1200);
        Account user3_account2= new Account(1111,550);

     //Banka musterileri kullanici adi listesi tanimlayin

        Customer customer1 = new Customer("User1","Password1",Arrays.asList(user1_account1,user1_account2));
        Customer customer2 = new Customer("user2","password2",Arrays.asList(user2_account1,user2_account2));
        Customer customer3 = new Customer("user3","password3",Arrays.asList(user3_account1,user3_account2));
        List<Customer>customers=new ArrayList<>(Arrays.asList(customer1,customer2,customer3));

        //Kod burada basliyor:

        Customer activeUser ;
        Account chosenAccount ;
        while (isRight) {
            System.out.println("Please enter your username: ");
            String username = scanStr.nextLine();
            System.out.println("Please enter your password: ");
            String password = scanStr.nextLine();


/*
            activeUser = confirmUsernameAndPassword( customers,username , password);
            if (activeUser!=null) {
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;
            }
            System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }

          //Actions start here:
        while (choice) {
            System.out.println("Yapmak istediginiz islemi seciniz...\"\\n\" +\n" +
                    "                    \"Para yatir - 1\" + \"\\n\" + \"Para cek -2\" + \"\\n\" + \"Transfer -3\" + \"\\n\" + \"Cikis -4\");\n");


            int userChoice = scanInt.nextInt();

            switch (userChoice) {

                case 1: {

                    boolean dogruMu = false;
                    while (!dogruMu) {
                        System.out.println("Lutfen para yatirmak istediginiz hesabi seciniz.");
                        for (Account account : activeUser.accounts)
                            System.out.println(account.accountNo);

                        String chosen = scanStr.nextLine();
                        chosenAccount = confirmAccountNumber(activeUser, chosen);
                        if (chosenAccount == null) ;
                        System.out.println("Hatali hesap numarasi girdiniz.");
                        continue;
                    }
                    break;
                    System.out.println("Lutfen yatirilacak para miktarini giriniz:");
                    int depositedMoney = scanInt.nextInt();
                    chosenAccount.fund += depositedMoney;
                    System.out.println("Para yatirma isleminiz tamamlanmistir");
                    break;

                }

                case 2: {
                    boolean x = false;
                    while (!x) {

                        System.out.println("Lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
                        for (Account account : activeUser.accounts) {
                            System.out.println(account.accountNo);
                        }
                        String chosenAccount2 = scanInt.next();

                        chosenAccount = confirmAccountNumber(activeUser, chosenAccount2);
                        if (chosenAccount == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.println("Lutfen cekmek istediginiz para miktarini giriniz...: ");
                        int withdrawnMoney = scanInt.nextInt();

                        if (!withdraw(chosenAccount, withdrawnMoney)) {
                            break;
                        }

                    }
                    break;
                    case 3: {
                        System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                        break;
                    }

                    case 4: {
                        System.exit(1);
                    }
                    default: {
                        System.out.println("Basarili bir secim yapmadiniz...");
                    }
                }
            }
        }




                    // TODO - Asagidaki 3 methodun return tipini ve icerigini tanimlayin ki yukarida olmasi gerektigi gibi sonuc versinler...
/*
                    public static  Customer confirmUsernameAndPassword boolean users;
        ( List<Customer>users, String username, String
        String password;
        password){


                        for (int i = 0; i < users.size(); i++) {
                            if (users.get(i).username.equals(username) && (customers.get(i).password.equals(password))) {
                                return users.get(i);
                            }
                        }

                        return null ;
                        }

                    }
                    public static Account confirmAccountNumber (Customer ,activeUser, String chosenAccount){
                        Account result = null;
                        for (Account account : activeUser.accounts)
                            if (account.accountNo.equals(chosenAccount)) {
                                result = account;
                                break;
                            }
                        return result;


                    }

                    public static boolean withdraw (Account chosenAccount,int amountToWithdraw ){

                        boolean sonuc = true;
                        if (chosenAccount.fund < amountToWithdraw)
                            System.out.println("Hesabinizda yeterli bakiye bulunmamaktadir");
                        else {
                            System.out.println("Lutfen paranizi aliniz.");
                            chosenAccount.fund -= amountToWithdraw;
                            System.out.println("Hesabinizda kalan para" + chosenAccount.fund);
                            sonuc = false;

                        }
                        return sonuc;              32

        }*/


    }
}}