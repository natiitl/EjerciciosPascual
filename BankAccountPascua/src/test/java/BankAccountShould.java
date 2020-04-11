import exceptions.DepositNegativeException;
import exceptions.DepositNullException;
import exceptions.WithdrawNegativeException;
import exceptions.WithdrawZeroException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountShould {

    @Test
    public void check_if_deposit_was_added(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);

        int valueExpected = 500;

        assertEquals(valueExpected, bankAccount.currentAmount);
    }

    @Test
    public void check_if_deposit_was_added_twice(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.deposit(500);

        int valueExpected = 1000;

        assertEquals(valueExpected, bankAccount.currentAmount);
    }

    @Test
    public void raise_error_when_deposit_is_zero(){
        BankAccount bankAccount = new BankAccount();

        assertThrows(DepositNullException.class, () -> bankAccount.deposit(0));
    }

    @Test
    public void raise_error_when_deposit_is_negative(){
        BankAccount bankAccount = new BankAccount();

        assertThrows(DepositNegativeException.class, () -> bankAccount.deposit(-20));
    }


    @Test
    public void check_whithdraw(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.withdraw(400);

        int valueExpected = 100;

        assertEquals(valueExpected, bankAccount.currentAmount);
    }

    @Test
    public void check_whithdraw_twice(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.withdraw(400);
        bankAccount.withdraw(50);

        int valueExpected = 50;

        assertEquals(valueExpected, bankAccount.currentAmount);
    }

    @Test
    public void raise_error_when_withdraw_is_zero(){
        BankAccount bankAccount = new BankAccount();

        assertThrows(WithdrawZeroException.class, () -> bankAccount.withdraw(0));
    }

    @Test
    public void raise_error_when_withdraw_is_negative(){
        BankAccount bankAccount = new BankAccount();

        assertThrows(WithdrawNegativeException.class, () -> bankAccount.withdraw(-20));
    }

    @Test
    public void check_different_operations_at_the_same_time(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.withdraw(150);
        bankAccount.deposit(300);
        bankAccount.withdraw(200);

        int valueExpected = 450;

        assertEquals(valueExpected, bankAccount.currentAmount);
    }





}
