package dk.cphbusiness.bank.contract.eto;

public class NoSuchAccountException extends Exception {
  private final String accountNumber;

  public NoSuchAccountException(String accountNumber, String message) {
    super(message);
    this.accountNumber = accountNumber;
    }

  public String getAccountNumber() {
    return accountNumber;
    }
  
  }
