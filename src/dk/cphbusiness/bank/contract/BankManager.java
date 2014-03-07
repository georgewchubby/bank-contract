package dk.cphbusiness.bank.contract;

import dk.cphbusiness.bank.contract.eto.CustomerBannedException;
import dk.cphbusiness.bank.contract.eto.NoSuchCustomerException;
import dk.cphbusiness.bank.contract.eto.ExistingCustomerException;
import dk.cphbusiness.bank.contract.dto.CustomerDetail;
import dk.cphbusiness.bank.contract.eto.TransferNotAcceptedException;
import dk.cphbusiness.bank.contract.eto.NoSuchAccountException;
import dk.cphbusiness.bank.contract.eto.InsufficientFundsException;
import dk.cphbusiness.bank.contract.dto.AccountSummary;
import dk.cphbusiness.bank.contract.dto.AccountDetail;
import dk.cphbusiness.bank.contract.dto.AccountIdentifier;
import dk.cphbusiness.bank.contract.dto.CustomerIdentifier;
import dk.cphbusiness.bank.contract.dto.CustomerSummary;
import java.math.BigDecimal;
import java.util.Collection;

public interface BankManager {
  
  Collection<CustomerSummary> listCustomers();
  
  Collection<AccountSummary> listAccounts();
  
  Collection<AccountSummary> listCustomerAccounts(CustomerIdentifier customer);

  AccountDetail transferAmount(
      BigDecimal amount,
      AccountIdentifier source,
      AccountIdentifier target
      ) throws
      NoSuchAccountException, 
      TransferNotAcceptedException,
      InsufficientFundsException;
  
  AccountDetail showAccountHistory(AccountIdentifier account);
  
  CustomerDetail saveCustomer(CustomerDetail customer) throws ExistingCustomerException;

  AccountDetail createAccount(
      CustomerIdentifier customer,
      AccountDetail account
      ) throws NoSuchCustomerException, CustomerBannedException;
  
  }
