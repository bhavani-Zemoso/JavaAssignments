package core_java.seven;

public class Proj7_1_BankAccountDemo {
    public static void main(String[] args) {

        Proj7_1_BankAccount account1 = new Proj7_1_BankAccount("Bhavani", 5000);
        Proj7_1_BankAccount account2 = new Proj7_1_BankAccount("Srikar");

        account2.deposit(500);
        System.out.println("Owner : " + account2.getOwner());
        System.out.println("Balance : " + account2.getBalance());

        account2.withdraw(1000);
        System.out.println("Owner : " + account2.getOwner());
        System.out.println("Balance : " + account2.getBalance());
        System.out.println();

        System.out.println("Owner : " + account1.getOwner());
        System.out.println("Balance : " + account1.getBalance());
        System.out.println();

        System.out.println("Deposit 1000");
        account1.deposit(1000);

        System.out.println("Owner : " + account1.getOwner());
        System.out.println("Balance : " + account1.getBalance());


    }
}
