package assignment8;

public class WithdrawLimitExceededException extends Exception{

    public WithdrawLimitExceededException(String message)
    {
        super(message);
    }
}
