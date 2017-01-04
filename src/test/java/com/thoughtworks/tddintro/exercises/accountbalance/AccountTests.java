package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private final Account account = new Account(100);

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){assertThat(account.deposit(50), is(150));}

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){assertThat(account.withdrawal(50), is(50));}

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account2 = new Account(50);
        assertThat(account2.withdrawal(100), is(50));
    }

}
