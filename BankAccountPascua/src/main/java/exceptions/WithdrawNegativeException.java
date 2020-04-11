package exceptions;

public class WithdrawNegativeException extends RuntimeException {

    public WithdrawNegativeException(String message){
        super(message);
    }
}
