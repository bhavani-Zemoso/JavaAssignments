package assignment8;

public class Account {

    private double balance;
    private double withdrawLimit;

    public Account(double balance, double withdrawLimit)
    {
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void withdrawAmount(double amount) throws InsufficientBalanceException, InvalidAmountException, WithdrawLimitExceededException
    {
        if(amount < 0)
            throw new InvalidAmountException("Amount is less than 0");

        if(amount > balance)
            throw new InsufficientBalanceException("Your account doesn't have sufficient balance");

        if(amount > withdrawLimit)
            throw new WithdrawLimitExceededException("Your amount has exceeded the withdraw limit for this day");
    }
}
