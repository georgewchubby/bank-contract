package dk.cphbusiness.bank.contract.dto;

import java.math.BigDecimal;

public class AccountSummary extends AccountIdentifier {
  private final String type;
  private final BigDecimal balance;
  
  public AccountSummary(String number, String type, BigDecimal balance) {
    super(number);
    this.type = type;
    this.balance = balance;
    }

  public String getType() {
    return type;
    }

  public BigDecimal getBalance() {
    return balance;
    }
  
  }
