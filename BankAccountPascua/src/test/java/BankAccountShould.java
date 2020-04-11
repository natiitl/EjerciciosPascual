import org.junit.Test;

import static org.junit.Assert.assertEquals;

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



}
