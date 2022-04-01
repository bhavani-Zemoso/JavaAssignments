package assignment8;

public class Bank {
    public static void main(String args[])
    {
        //Account account = null;
        Account account = new Account(5000, 1000);

        try
        {
            account.withdrawAmount(-2000);
        }

        catch(Exception exception)
        {
            System.out.println("Exception : " + exception.toString());
            //exception.printStackTrace();
        }

        finally {
            System.out.println("In finally block");
        }
    }
}
