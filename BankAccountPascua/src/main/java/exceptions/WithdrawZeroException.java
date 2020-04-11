package exceptions;

public class WithdrawZeroException extends RuntimeException {

    public WithdrawZeroException(String message){
        super(message);
    }
}
