package builderPattern;

public class BankAccountDirector {
    private TransactionBuilder transactionBuilder;

    public void setBankAccoutBuilder(TransactionBuilder transactionBuilder) {
        this.transactionBuilder = transactionBuilder;
    }

    public TransactionProduct getTransaction() {

    }

    public void buildTransaction() {
        //construir
    }
}
