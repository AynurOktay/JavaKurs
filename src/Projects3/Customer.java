package Projects3;

import java.util.ArrayList;

import java.util.List;

public class Customer {
    public String username;

    public String password;


    public List<Account> accounts;

    public Customer(String username, String password, List<Account> accounts) {
        this.username = username;
        this.password = password;
        this.accounts = accounts;
    }

    /*public void hesabaParaEkle(String hesap, int bakiye){
    Account sonHesap=new Account();
    sonHesap.accountNo=hesap;
    sonHesap.fund+=bakiye;

    accounts.add(sonHesap);*/


 }
