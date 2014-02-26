package dk.cphbusiness.bank.contract.dto;

import java.io.Serializable;

public class CustomerIdentifier implements Serializable {
  private final String cpr;

  public CustomerIdentifier(String cpr) {
    this.cpr = cpr;
    }

  public String getCpr() {
    return cpr;
    }

  @Override
  public String toString() {
    return cpr;
    }
  
  public static CustomerIdentifier fromString(String string) {
    return new CustomerIdentifier(string);
    }
  
  }
