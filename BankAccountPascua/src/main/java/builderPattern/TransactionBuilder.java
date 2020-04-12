package builderPattern;

public abstract class TransactionBuilder {
    TransactionProduct transactionProduct;

    public TransactionProduct getTransactionProduct(){
        return transactionProduct;
    }

    public abstract void buildDate();
    public abstract void buildCredit();
    public abstract void buildDebit();
    public abstract void buildBalance();

}
