import exceptions.DepositNegativeException;
import exceptions.DepositNullException;
import exceptions.WithdrawNegativeException;
import exceptions.WithdrawZeroException;

public class BankAccount {

    int currentAmount = 0;

    public void deposit(int amount) {
        if (amount == 0){
            throw new DepositNullException("Deposit amount can't be zero");
        }
        if (amount <= 0){
            throw new DepositNegativeException("Deposit amount can't be negative");
        }
        currentAmount += amount;
    }


    public void withdraw(int amount) {
        if (amount == 0){
            throw new WithdrawZeroException("Withdraw amount can't be zero");
        }
        if (amount <= 0){
            throw new WithdrawNegativeException("Withdraw amount can't be negative");
        }
        currentAmount -= amount;
    }
}
