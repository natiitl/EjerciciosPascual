import exceptions.DepositNullException;
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




}
