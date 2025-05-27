// Made this use defined exception to handle cases where withdrawal exceeds allowed balance
public class InsufficientBalanceException extends Exception{

    // Constructor that accepts a custom message
    public InsufficientBalanceException(String message){
        super(message);  // this calls parent exception class constructor to set the message
    }
}
