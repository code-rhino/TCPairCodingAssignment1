package io.zipcoder.access.control.lab.bank.account;


public class BankAccount {
    private AccountType accountType;

    public BankAccount(){
        this.accountType = AccountType.CHECKING;
    }

    public AccountType getAccountType(){
        return accountType;
    }

}
