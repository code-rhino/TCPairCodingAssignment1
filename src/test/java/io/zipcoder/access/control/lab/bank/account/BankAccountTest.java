package io.zipcoder.access.control.lab.bank.account;


import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {

    @Test
    public void getAccountType(){
        BankAccount account = new BankAccount();
        AccountType expected = AccountType.CHECKING;
        AccountType actual = account.getAccountType();
        Assert.assertEquals(expected,actual);
    }
}
