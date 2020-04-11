import exceptions.DepositNullException;

public class BankAccount {

    int currentAmount = 0;

    public void deposit(int amount) {
        if (amount == 0){
            throw new DepositNullException("Deposit amount can't be zero");
        }
        currentAmount += amount;
    }


}
