package dk.cphbusiness.bank.contract.dto;

import java.math.BigDecimal;
import java.util.Collection;

public abstract class AccountDetail extends AccountIdentifier {
  private final BigDecimal interest;
  private final Collection<TransferSummary> transfers;

  public AccountDetail(String number, BigDecimal interest, Collection<TransferSummary> transfers) {
    super(number);
    this.interest = interest;
    this.transfers = transfers;
    }

  public abstract String getType();

  public BigDecimal getInterest() {
    return interest;
    }

  public Collection<TransferSummary> getTransfers() {
    return transfers;
    }
 
  }
