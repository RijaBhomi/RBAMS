public interface Transaction {

    void deposit(double amount); // Add money to account.

    void withdraw(double amount) throws InsufficientBalanceException; // Remove money, may throw exception.
}
