package dk.cphbusiness.bank.contract.eto;

import dk.cphbusiness.bank.contract.dto.CustomerIdentifier;

public class NoSuchCustomerException extends Exception {
  private CustomerIdentifier customer;

  public NoSuchCustomerException(CustomerIdentifier customer) {
    super(customer.getCpr()+" does not exist");
    }

  public CustomerIdentifier getCustomer() {
    return customer;
    }

  }
