// SavingsAccount inherits from BankAccount and adds interest functionality.
public class SavingsAccount extends BankAccount {

    private static final double interestRate = 0.05; // 5% annual interest (hardcoded for demo).

    public SavingsAccount(String accountHolderName,String  accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance); // Call to parent class constructor.
    }

    // Adds interest to the current balance.
    public void addInterest() {
        balance += balance * interestRate; // Increase balance by 5%.
        System.out.println("Interest added. New Balance: " + balance);
    }

    // Deposit increases balance.
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdrawal checks for sufficient funds.
    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

}
