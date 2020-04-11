package exceptions;

public class DepositNegativeException extends RuntimeException {

    public DepositNegativeException (String message){
        super(message);
    }
}
