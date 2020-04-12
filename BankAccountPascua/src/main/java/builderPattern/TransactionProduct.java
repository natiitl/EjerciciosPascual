package builderPattern;

public class TransactionProduct {
    private String date = "";
    private int credit = 0;
    private int debit = 0;
    private int balance = 0;


    public void setDate(String date) {
        this.date = date;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
