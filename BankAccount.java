// Abstract class containing common features for all types of accounts
public abstract class BankAccount implements Transaction {

    // Protected: child class can only access
    protected String AccountHolderName;
    protected String AccountNumber;
    protected double balance;

    // constructor
    public BankAccount(String accountHolderName,String  accountNumber, double balance ){
        this.AccountHolderName= accountHolderName;
        this.AccountNumber= accountNumber;
        this.balance= balance;
    }

    // Encapsulation: used get methods to access protected data.
    public String getAccountHolderName(){
        return AccountHolderName;
    }

    public String getAccountNumber(){
        return AccountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountType() {
        return this instanceof SavingsAccount ? "Savings" : "Current";
    }


    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + AccountHolderName);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Balance: Rs. " + balance);
    }
}


