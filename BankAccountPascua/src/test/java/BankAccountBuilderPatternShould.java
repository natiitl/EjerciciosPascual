import builderPattern.BankAccountDirector;
import builderPattern.DepositBuilderConcrete;

import builderPattern.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BankAccountBuilderPatternShould {

    @Test
    public void test(){
        BankAccountDirector bankAccountDirector = new BankAccountDirector();
        TransactionBuilder deposit = new DepositBuilderConcrete(500);

        bankAccountDirector.setBankAccoutBuilder(deposit);
        bankAccountDirector.buildTransaction();

        //TransactionProduct transactionProductExpected = bankAccountDirector.getTransaction();

        //assertEquals(deposit, transactionProductExpected);

    }


   /* public void check_if_deposit_was_added(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);

        int valueExpected = 500;

        assertEquals(valueExpected, bankAccount.currentAmount);
    }*/
}
