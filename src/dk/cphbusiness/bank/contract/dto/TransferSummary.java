package dk.cphbusiness.bank.contract.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TransferSummary implements Serializable {
  private final Date date;
  private final BigDecimal amount;
  private final String accountNumber;

  public TransferSummary(Date date, BigDecimal amount, String accountNumber) {
    this.date = date;
    this.amount = amount;
    this.accountNumber = accountNumber;
    }

  public Date getDate() {
    return date;
    }

  public String getAccountNumber() {
    return accountNumber;
    }
  
  public BigDecimal getAmount() {
    return amount;
    }
  
  }
