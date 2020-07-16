package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        assertThat(account.getBalance() == 0);
        account.deposit(1);
        assertThat(account.getBalance() == 1);
    }

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account account = new Account();
        assertThat(account.getBalance() == 0);
    }

    @Test
    public void withdrawAnAmount() {
        Account account = new Account();
        account.withdraw(1);
        assertThat(account.getBalance() == 1);
    }

    @Test
    public void depositAndWithdrawAnAmount() {
        Account account = new Account();
        assertThat(account.getBalance() == 0);
        account.deposit(1);
        assertThat(account.getBalance() == 1);
        account.withdraw(1);
        assertThat(account.getBalance() == 0);
    }

    // Should be in Money test class
    @Test
    public void moneyTest() {
        Money money = new Money();
        assertThat(money.value == 0);

    }
}
