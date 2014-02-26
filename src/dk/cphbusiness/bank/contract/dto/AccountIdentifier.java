package dk.cphbusiness.bank.contract.dto;

import java.io.Serializable;

public class AccountIdentifier implements Serializable {
  private final String number;

  public AccountIdentifier(String number) {
    this.number = number;
    }

  public String getNumber() {
    return number;
    }

  @Override
  public String toString() {
    return super.toString();
    }
  
  public static AccountIdentifier fromString(String string) {
    return new AccountIdentifier(string);
    }
  
  }
