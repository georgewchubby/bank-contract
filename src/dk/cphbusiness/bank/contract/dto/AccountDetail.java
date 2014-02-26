package dk.cphbusiness.bank.contract.dto;

import java.math.BigDecimal;
import java.util.Collection;

public class AccountDetail extends AccountIdentifier {
  private final String type;
  private final BigDecimal interest;
  private final Collection<TransferSummary> transfers;

  public AccountDetail(String number, String type, BigDecimal interest, Collection<TransferSummary> transfers) {
    super(number);
    this.type = type;
    this.interest = interest;
    this.transfers = transfers;
    }

  public String getType() {
    return type;
    }

  public BigDecimal getInterest() {
    return interest;
    }

  public Collection<TransferSummary> getTransfers() {
    return transfers;
    }
 
  }
