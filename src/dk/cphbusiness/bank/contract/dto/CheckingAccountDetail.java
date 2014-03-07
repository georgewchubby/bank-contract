package dk.cphbusiness.bank.contract.dto;

import java.math.BigDecimal;
import java.util.Collection;

public class CheckingAccountDetail extends AccountDetail {

  public CheckingAccountDetail(BigDecimal interest) {
    super(null, interest, null);
    }
  
  public CheckingAccountDetail(
      String number,
      BigDecimal interest,
      Collection<TransferSummary> transfers
      ) {
    super(number, interest, transfers);
    }

  @Override
  public String getType() {
    return "Checking Account";
    }
  
  }
